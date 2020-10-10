package com.facebook.Generic;

import java.io.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.NetworkMode;
public class ExtentManager {
	private static ExtentReports extent;

	public synchronized static ExtentReports getReporter(String filePath) {
		if (extent == null) {
			extent = new ExtentReports(filePath, true, NetworkMode.ONLINE);
			extent.loadConfig(new File("Configuration\\extent-config.xml"));
			extent.addSystemInfo("Host Name", "-");
		}
		return extent;
	}

	public synchronized static ExtentReports getReporter() {
		return extent;
	}
}
