package com.facebook.Generic;
import java.util.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	static Map extentTestMap = new HashMap();
	private static ExtentReports extent = ExtentManager.getReporter();

	/*
	 * public static synchronized ExtentTest getTest() { return
	 * extentTestMap.get((int)Thread.currentThread().getId()); }
	 */

	public static synchronized void endTest(ExtentTest test) {
		extent.endTest(test);
	}

	public static synchronized ExtentTest startTest(String testName) {
		return startTest(testName, "");
	}

	public static synchronized ExtentTest startTest(String testName, String desc) {
		ExtentTest test = extent.startTest(testName, desc);
		extentTestMap.put((int) (long) (Thread.currentThread().getId()), test);
		return test;
	}
}
