package com.facebook.TestCases;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.facebook.Generic.*;
import com.facebook.pages.*;
import com.facebook.utilities.ConfigReader;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BaseTest {
	String env;
	int envCursor;
	int dataCursor;
	int stCursor;
	int wholesaleCursor;
	int pricingCursor;
	int entitlementCursor;
	int benefitCursor;
	int onlineCursor;
	String envURL;
	String envDBString;
	String simDbString;
	String online;
	Database simDatabase;
	String[] simDataBaseString;
	String[] simRange;
	String onlineINT03;
	String onlineStaging;
	int tesCaseId;
	public static ConfigReader config = new ConfigReader();
	HashMap<String, List<String>> simNumbers;
	static HashMap<String, List<String>> simNumbers1;
	WebDriver driver;
	public static ArrayList<ExcelReader> excelReader = new ArrayList<ExcelReader>();
	public static ArrayList<ExcelObjects> excelObjects = new ArrayList<ExcelObjects>();
	public static ArrayList<ExcelMethods> excelMethods = new ArrayList<ExcelMethods>();
	static ArrayList<String> sheetNames = new ArrayList<String>();
	public static ExcelReader OMDetails;
	public static ExcelObjects OMDetailsData = new ExcelObjects();
	public static ExcelMethods OMDetailsMethods = new ExcelMethods();

	TestCaseDetails details;

	@BeforeSuite
	public void initSetup() {
		/* Read test data from excel */
		System.out.println("Reading Test Data . . .");
		try {
			Workbook wrkbook = Workbook.getWorkbook(new File(config.TestDataPath()));
			
			for (int i = 0; i < wrkbook.getNumberOfSheets(); i++) {
				sheetNames.add(wrkbook.getSheet(i).getName());
			}
			System.out.println(sheetNames);
			for (int i = 0; i < wrkbook.getNumberOfSheets(); i++) {
				ExcelReader tempReader = new ExcelReader(config.TestDataPath(), wrkbook.getSheet(i).getName());
				tempReader.ColumnDictionary();
				ExcelObjects tempData = new ExcelObjects();
				ExcelMethods tempMethods = new ExcelMethods();
				tempMethods.readTestData(tempData, tempReader);
				excelReader.add(tempReader);
				excelMethods.add(tempMethods);
				excelObjects.add(tempData);
			}
		} 
		catch (BiffException | IOException e1) {
			System.out.println("Error reading test data file");
		}
		
	}

	@BeforeTest
	@Parameters({ "envName", "testCaseNumber", "testDataRow" })
	public void setup(String envName, String testCaseNumber, String testDataRow) {
		System.setProperty("webdriver.gecko.driver",config.GetGeckoDriverPath());
		//System.setProperty("webdriver.chrome.driver",config.GetGeckoDriverPath());
		/* Initializing driver */
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.getWindowHandle();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		// Storing ENV name for listeners
		env = envName;

		// string testCaseId for unique simNumber
		tesCaseId = Integer.parseInt(testCaseNumber);

		// Assigning cursors for ENV details and test data
		
		envCursor = getSheet("Env").get("Env").indexOf(env);
		dataCursor = getSheet("Data").get("UniqueID").indexOf(testDataRow);
		stCursor = getSheet("STData").get("UniqueID").indexOf(testDataRow);
		onlineCursor = getSheet("Online").get("UniqueID").indexOf(testDataRow);

		onlineCursor = getSheet("Online").get("UniqueID").indexOf(testDataRow);

		// details object of testCaseDetails class that stores testCase details
		details = new TestCaseDetails();

		// Retrieving env details from test data
		try {
			envURL = envData("Url");
			//envDBString = envData("DbString");
			//simDbString = envData("SIMDbString");
			//online = envData("Online");
			//simRange = envData("SIMNumber").split("-");
		} catch (NullPointerException e) {
			Reporter.log("~Step~~Please provide correct ENV or update test data file ~~Pass");
			System.out.println("Please provide correct ENV or update test data file");
			Assert.fail("Please provide correct ENV or update test data file");
		}

		
		driver.get(envURL);
	
		if (!(env.contains("Online"))) {
			login(loginData("Username", "Siebel"), loginData("Password", "Siebel"));
		}
		// SIM database connectivity
		//simDataBaseString = simDbString.split("&");
		//simDatabase = new Database(simDataBaseString[0], simDataBaseString[3], simDataBaseString[1],
		//		simDataBaseString[2]);
		//simNumbers = simDatabase
			//	.selectQuery("Select RESOURCE_ID from rm.res0urce where STATUS='AVAILABLE' and resource_id >='"
			//			+ simRange[0] + "' and resource_id <='" + simRange[1] + "' and reservation_mdn is null");
	}

	public void login(String un, String pwd) {
		Reporter.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ login Start ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", true);

		if (env.equals("INT05") || env.equals("INT03") || env.equals("INT02") || env.equals("Stg")) {

			driver.findElement(By.id("email")).sendKeys(un);
			driver.findElement(By.id("pass")).sendKeys(pwd);
			driver.findElement(By.cssSelector("button[type=Submit]")).click();
		}

		if (env.equals("8372") || env.equals("INT04") || env.equals("2039") || env.equals("8374") || env.equals("TaaSDev2")) {
			// 8372
			driver.findElement(By.id("s_swepi_1")).sendKeys(un);
			driver.findElement(By.id("s_swepi_2")).sendKeys(pwd);
			driver.findElement(By.id("s_swepi_22")).click();

		}

		if (env.contains("PRM")) {
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(un);
			driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
			driver.findElement(By.xpath("//button[@title='User Login:Login']")).click();

		}
		Reporter.log("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ login End ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", true);
	}

	public String getENV() {
		return env;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public TestCaseDetails getDetails() {
		return details;
	}

	public static HashMap<String, List<String>> getSheet(String sheet) {
		return excelObjects.get(sheetNames.indexOf(sheet)).getData();
	}

	/* to get data from excel */
	public String stData(String columnName) {
		String value = null;
		try {
			value = getSheet("STData").get(columnName).get(stCursor);
		} catch (Exception e) {
			value = "";
		}
		return value;
	}

	public String envData(String columnName) {
		return getSheet("Env").get(columnName).get(envCursor);
	}

	public String onlineData(String columnName) {
		return getSheet("Online").get(columnName).get(onlineCursor);// added by
																	// ankita
	}

	public String loginData(String columnName, String application) {
		return getSheet("Login").get(columnName).get(getSheet("Login").get("Application").indexOf(application));
	}

	/* to add Sleep between pages */
	public void waitMethod(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception e) {
			Reporter.log(e.getMessage(), true);
		}
	}

	public void newTab(String url) {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		waitMethod(5);
		driver.get(url);
	}

	public void previousTab() {
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
		reload(1);
		waitMethod(10);
	}

	public void reload(int count) {
		for (int i = 0; i < count; i++) {
			driver.navigate().refresh();
		}
	}

	public void back(int count) {
		for (int i = 0; i < count; i++) {
			driver.navigate().back();
		}
	}

	public String getSIM() {
		String simNumber = null;
		try {
			simNumber = simNumbers.get("RESOURCE_ID").get(tesCaseId);
		} catch (Exception e) {
			Assert.fail("No SIM is available");
		}
		return simNumber;
	}

	public List<String> bulkSIMs() {

		return simNumbers.get("RESOURCE_ID");

	}

	
	
	
}
