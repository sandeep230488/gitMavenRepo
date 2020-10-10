package com.facebook.ListenerGeneric;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.facebook.utilities.ConfigReader;

public class ScreenshotOnFailure implements ITestListener {
	static WebDriver driver;

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			// e.printStackTrace();
		}
		getDesktopScreenshot();
	}

	public void getDesktopScreenshot() {
		try {
			ConfigReader config = new ConfigReader();
			Dimension desktopsize = Toolkit.getDefaultToolkit().getScreenSize();
			Rectangle r = new Rectangle(desktopsize);
			Robot robot = new Robot();
			BufferedImage img = robot.createScreenCapture(r);
			ImageIO.write(img, "jpeg", new File(config.getScreenshotFolderPath().concat(".jpeg")));
		} catch (Exception e) {
			System.out.println("Failed to take screenshot");
			// System.out.println(e.toString());
			// System.out.println(e.getMessage());
		}
	}

	public static String getScreenShot(WebDriver driver) {
		try {
			//String screenshotName = testname + "_" + randomNumberGeneration.showRandomInteger() + ".png";
			//EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
			File srcImgFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(srcImgFile, new File(config.GetREPORTPATH() + folderName + "\\" + screenshotName));
			return srcImgFile.toString();
		} catch (NullPointerException nullPointerException) {
			System.out.println(
					" you are trying to get data from object which is referenced null/empty, i.e driver/any other object is not yet instantiated properly ");
			// Assert.fail("you are trying to get data from object which is
			// referenced null/empty, i.e driver/any other object is not yet
			// instantiated properly ");
		} catch (Exception e) {
			System.out.println("screen-shot did not saved, because browser alredy closed");
			// Assert.fail("screen-shot did not saved, because browser alredy
			// closed");
		}
		return null;
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("+Begin test: " + result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Case success and TestCase name is " + result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Case skipped and TestCase details are " + result.getName());

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test Case started and TestCase name is " + context.getName());

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
