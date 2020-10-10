package com.facebook.ListenerGeneric;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;
import com.facebook.TestCases.BaseTest;
import com.facebook.Generic.TestCaseDetails;
import com.facebook.utilities.ConfigReader;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class STListner implements IReporter, ITestListener {
	ConfigReader config;
	TestCaseDetails details;
	int folderName;
	WebDriver driver;
	HashMap<ITestContext, ArrayList<String>> overallTestsDetails = new HashMap<ITestContext, ArrayList<String>>();
	private String envName = "";
	private ExtentReports extent;
	private static ThreadLocal<String> currentMethods = new ThreadLocal<>();
	private static ThreadLocal<String> currentMethodsName = new ThreadLocal<>();

	@Override
	public void onTestFailure(ITestResult arg0) {
System.out.println("ok");
		ArrayList<String> testDetails = new ArrayList<String>();
		envName = ((BaseTest) arg0.getInstance()).getENV();
		driver = ((BaseTest) arg0.getInstance()).getDriver();
		details = ((BaseTest) arg0.getInstance()).getDetails();

		String testname = arg0.getInstanceName();
		testname = testname.substring(testname.lastIndexOf('.') + 1);
		String tetsCaseDescription = arg0.getName();
		updateTestCaseDetails(details, testname, tetsCaseDescription, "Fail", envName,
				formatSeconds((int) ((arg0.getEndMillis() - arg0.getStartMillis()) / 1000)));
		testDetails.add(ScreenshotOnFailure.getScreenShot(driver));
		if (details.displayInfo().isEmpty())
			testDetails.add(null);
		else
			testDetails.add(details.displayInfo().toString());
		overallTestsDetails.put(arg0.getTestContext(), testDetails);

	}

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		System.out.println("Opening browser for " + arg0.getName());
		currentMethods.set(arg0.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		/*System.out.println("Executing " + arg0.getInstanceName().substring(arg0.getInstanceName().lastIndexOf(".") + 1)
				+ "  . . .");*/
		currentMethodsName.set(arg0.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		
		ArrayList<String> testDetails = new ArrayList<String>();
		envName = ((BaseTest) arg0.getInstance()).getENV();
		driver = ((BaseTest) arg0.getInstance()).getDriver();
		details = ((BaseTest) arg0.getInstance()).getDetails();
		
		Actions act = new Actions(driver);
		String testname = arg0.getInstanceName();
		String tetsCaseDescription = arg0.getName();

		updateTestCaseDetails(details, testname.substring(testname.lastIndexOf('.') + 1), tetsCaseDescription, "Pass",
				envName, formatSeconds((int) ((arg0.getEndMillis() - arg0.getStartMillis()) / 1000)));
		testDetails.add(ScreenshotOnFailure.getScreenShot(driver));
		if (details.displayInfo().isEmpty())
			testDetails.add(null);
		else
			testDetails.add(details.displayInfo().toString());
		overallTestsDetails.put(arg0.getTestContext(), testDetails);
		act.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys("X").keyUp(Keys.SHIFT).keyUp(Keys.CONTROL).perform();
		
	try {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.close();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
	}
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		/*WebElement we;
		try {
			we = driver.findElement(By.xpath("//li[@title='Settings']"));
			we.click();
			waitMethod(500);
			we = driver.findElement(By.xpath("//button[normalize-space(text())='Logout']"));
			we.click();
			waitMethod(3000);
		} catch (NoSuchElementException e) {
			WebElement omLogout = driver.findElement(By.xpath("//div[contains(text(),'Logout')]"));
			omLogout.click();
			waitMethod(3000);
		} catch (WebDriverException e) {
		}
		driver.close();*/
	}

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		folderName = getExecutionID();
		extent = new ExtentReports(config.GetREPORTPATH() + folderName + "/" + "index.html", true);
		extent.loadConfig(new File("Configuration\\extent-config.xml"));
		// extent.addSystemInfo("Host Name",
		// "- <script
		// src='https://cdn.rawgit.com/anshooarora/extentreports/6032d73243ba4fe4fb8769eb9c315d4fdf16fe68/cdn/extent.js'
		// type='text/javascript'></script><script
		// src='internal.js'></script>");

		for (ISuite suite : suites) {
			Map<String, ISuiteResult> result = suite.getResults();

			for (ISuiteResult r : result.values()) {
				ExtentTest test;
				ITestContext context = r.getTestContext();
				test = extent.startTest(context.getName());

				test.setStartedTime(context.getStartDate());
				test.setEndedTime(context.getEndDate());

				buildTestNodes(context.getPassedTests(), LogStatus.PASS, Reporter.getOutput(), context.getName(), test);
				buildTestNodes(context.getFailedTests(), LogStatus.FAIL, Reporter.getOutput(), context.getName(), test);
				buildTestNodes(context.getSkippedTests(), LogStatus.SKIP, Reporter.getOutput(), context.getName(),
						test);
				extent.endTest(test);
			}

		}
		extent.flush();

		extent.close();
		try {
			File src = new File(config.GetREPORTPATH() + folderName + "\\index.html");
			File des = new File(config.GetOVERALLREPORTPATH() + "\\index.html");
			FileUtils.copyFile(src, des);

			// callReportBrowser(des.toPath().toString());
		} catch (Exception e) {
			// System.out.println("Failed To Copy In Common Report " + e);
			// callReportBrowser(config.GetREPORTPATH() + folderName +
			// "\\index.html");
		}

	}

	public void callReportBrowser(String url) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(url);
	}

	public int getExecutionID() {
		config = new ConfigReader();
		File file = new File(config.GetREPORTPATH());
		String[] directories = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File current, String name) {
				return new File(current, name).isDirectory();
			}
		});

		new File((config.GetREPORTPATH()) + (directories.length + 1)).mkdir();
		return directories.length + 1;

	}

	public static String getTestMethod() {

		return checkNotNull(currentMethods.get(), "Name not found", "");
	}

	public static String getTestMethodName() {

		return checkNotNull(currentMethodsName.get(), "Name not found", "");
	}

	private static <T> T checkNotNull(T o, String msg, Object param) {
		if (o == null) {
			throw new NullPointerException(String.format(msg, param));
		}
		return o;
	}

	private void buildTestNodes(IResultMap tests, LogStatus status, List<String> list, String testcasename,
			ExtentTest test) {
		// String unique = testcasename.replace(" ", "");
		// System.out.println(list);
		if (tests.size() > 0) {

			// Collection<ITestNGMethod> invokedMethods = tests.getAllMethods();

			List<Date> myList = new ArrayList<>();
			HashMap<Date, String> hm = new HashMap<Date, String>();
			for (ITestResult allresult : tests.getAllResults()) {
				myList.add(getTime(allresult.getStartMillis()));
				hm.put(getTime(allresult.getStartMillis()), allresult.getMethod().getMethodName());
			}
			Collections.sort(myList);

			HashMap<String, String> stepMap = new HashMap<String, String>();
			StringBuilder stepDetails = new StringBuilder();
			for (ITestResult result : tests.getAllResults()) {
				File tempScreenshotFile = null;
				boolean screenshotFlag = true;
				String screenshotName = null;
				try {
					tempScreenshotFile = new File(overallTestsDetails.get(result.getTestContext()).get(0));
					String testname = result.getInstanceName();
					screenshotName = testname.substring(testname.lastIndexOf('.') + 1)
							+ RandomStringUtils.randomNumeric(4)+ ".png";
					String screenshotPath = config.GetREPORTPATH() + folderName + "\\" + screenshotName;
					try {
						FileUtils.copyFile(tempScreenshotFile, new File(screenshotPath));
					} catch (IOException e) {
						screenshotFlag = false;
						System.out.println("there is a problem in writing data to screenshot folder file");
					}
				} catch (NullPointerException e) {
					screenshotFlag = false;
				}
				String message = "Skipped " + result.getMethod().getMethodName();

				list = Reporter.getOutput(result);
				stepDetails
						.append("<ul class='collapsible node-list' data-collapsible='accordion'><li><div  class='collapsible-header' style='width: 100%;display: inline-block;background-color: #18748F;color:#FFF;'><span style='cursor:pointer;float:left'>"
								+ getTimestamp(result.getStartMillis()) + " - " + result.getMethod().getMethodName()
								+ "</span><span style='cursor:pointer;float:right;text-align:center;' class='btn-floating btn-small waves-effect waves-light blue'>SD</span></div>");
				stepDetails.append("<div class='collapsible-body'><table style='margin-top: 10px;'>");
				for (Iterator<String> iter = list.iterator(); iter.hasNext();) {
					String element = iter.next();

					if (element.startsWith("~Step")) {
						String[] arr = element.split("~");
						stepDetails
								.append("<tr><td style='border-bottom: 0px none !important;'>" + arr[3] + "</td></tr>");
						if (result.getStatus() == 3) {
							message = "<tr><td style='border-bottom: 0px none !important;'>" + arr[3] + "</td></tr>";
						}
					}
				}

				if (result.getThrowable() != null) {
					message = result.getThrowable().getMessage();

					if (!screenshotFlag) {
						stepDetails.append(
								"<tr><td style='border-bottom: 0px none !important;'>" + message + "</td></tr>");
					} else {
						stepDetails.append("<tr><td style='border-bottom: 0px none !important;'>" + message
								+ ((screenshotName != null) ? test.addScreenCapture(screenshotName) : "")
								+ "</td></tr>");
					}

					if (overallTestsDetails.get(result.getTestContext()).get(1) != null) {
						stepDetails.append("<tr><td style='border-bottom: 0px none !important;'>"
								+ overallTestsDetails.get(result.getTestContext()).get(1) + "</td></tr>");
					}

					stepMap.put(result.getMethod().getMethodName(),
							stepDetails.toString() + "</table></div></li></ul>");

				} else if (result.getStatus() == 3) {

					if (!screenshotFlag) {
						stepDetails.append(
								"<tr><td style='border-bottom: 0px none !important;'>" + message + "</td></tr>");
					} else {
						stepDetails.append("<tr><td style='border-bottom: 0px none !important;'>" + message
								+ ((screenshotName != null) ? test.addScreenCapture(screenshotName) : "")
								+ "</td></tr>");
					}
					stepMap.put(result.getMethod().getMethodName(), stepDetails.toString() + "</table></div>");
				} else {

					if (overallTestsDetails.get(result.getTestContext()).get(1) != null) {
						stepDetails.append("<tr><td style='border-bottom: 0px none !important;'>"
								+ overallTestsDetails.get(result.getTestContext()).get(1) + "</td></tr>");
					}
					stepMap.put(result.getMethod().getMethodName(), stepDetails.toString() + "</table></div>");
				}

			}

			for (int i = 0; i < myList.size(); i++) {
				test.assignCategory((hm.get(myList.get(i))).toString());
				// System.out.println(myList.get(i) + "--" +
				// stepMap.get(hm.get(myList.get(i))));
				test.log(status, stepMap.get(hm.get(myList.get(i))).toString());
			}
		}

	}

	private Date getTime(long millis) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}

	public String getTimestamp(long millis) {
		Date date = new Date(millis);
		SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

	public void updateTestCaseDetails(TestCaseDetails details, String testCaseName, String testcasedescription,
			String status, String envName, String executionTime) {
		try {
			details.writeTestCaseDetails(testCaseName, testcasedescription, status, envName, executionTime);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to add details");
		}
	}

	public static String formatSeconds(int timeInSeconds) {
		int hours = timeInSeconds / 3600;
		int secondsLeft = timeInSeconds - hours * 3600;
		int minutes = secondsLeft / 60;
		int seconds = secondsLeft - minutes * 60;

		String formattedTime = "";
		if (hours < 10)
			formattedTime += "0";
		formattedTime += hours + ":";

		if (minutes < 10)
			formattedTime += "0";
		formattedTime += minutes + ":";

		if (seconds < 10)
			formattedTime += "0";
		formattedTime += seconds;

		return formattedTime;
	}

	/* to add Sleep between pages */
	public void waitMethod(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			Reporter.log(e.getMessage(), true);
		}
	}

}
