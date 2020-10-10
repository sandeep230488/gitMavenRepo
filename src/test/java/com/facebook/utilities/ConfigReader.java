package com.facebook.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
	Properties property;

	public ConfigReader() {

		try {
			File src = new File("C:\\Users\\Sandeep\\eclipse-workspace\\facebook\\src\\test\\java\\Configuration\\config.property");
			FileInputStream fis = new FileInputStream(src);
			property = new Properties();
			property.load(fis);
		}

		catch (Exception e)

		{
			System.out.println("Exception is" + e.getMessage());
		}

	}

	
	
	public String GetGeckoDriverPath() {
		String GeckoDriverPath = property.getProperty("GeckoDriverPath");
		return GeckoDriverPath;
	}
	
	
	public String GetIcmsApplication() {
		String IcmsApplication = property.getProperty("IcmsApplication");
		return IcmsApplication;
	}
	
	public String GetOVERALLREPORTPATH() {
		String OVERALLREPORTPATH = property.getProperty("OVERALLREPORTPATH");
		return OVERALLREPORTPATH;
	}

	public String GetURL() {
		String URL = property.getProperty("URL");
		return URL;
	}
	
	public int GetThreadCount() {
		String threadCount = property.getProperty("threadCount");
		return Integer.parseInt(threadCount);
	}
	
	public Boolean GetParallelFlag() {
		String parallelExecution = property.getProperty("parallelExecution");
		return Boolean.valueOf(parallelExecution);
	}

	public String GetEnvName() {
		String EnvName = property.getProperty("EnvName");
		return EnvName;
	}

	public String GetDbString() {
		String DbString = property.getProperty("DbString");
		return DbString;
	}

	public String SIMDbString() {
		String SIMDbString = property.getProperty("SIMDbString");
		return SIMDbString;
	}

	public String TestDataPath() {
		String TestData = property.getProperty("TestData");
		return TestData;
	}

	public String QueueURL() {
		String QueueURL = property.getProperty("QueueURL");
		return QueueURL;
	}

	public String ChromeDriverpath() {
		String ChromeDriverpath = property.getProperty("ChromeDriverpath");
		return ChromeDriverpath;
	}

	public String GeckoDriverpath() {
		String GeckoDriverpath = property.getProperty("GeckoDriverpath");
		return GeckoDriverpath;
	}

	
	public String GetREPORTPATH() {
		String REPORTPATH = property.getProperty("REPORTPATH");
		return REPORTPATH;
	}

	public String TestCasesPath() {
		String TestCases = property.getProperty("TestCases");
		return TestCases;
	}

	public String QueueName() {
		String QueueName = property.getProperty("QueueName");
		return QueueName;
	}

	public String csvFilePath() {
		String csvFilePath = property.getProperty("csvFilePath");
		return csvFilePath;
	}

	public String terminatecsvFilePath() {
		String terminatecsvFilePath = property
				.getProperty("terminatecsvFilePath");
		return terminatecsvFilePath;
	}

	public String autoItpath() {
		String autoItpath = property.getProperty("autoItpath");
		return autoItpath;
	}
	
	public String closeAndPostOrder() {
		String closeAndPostOrder = property.getProperty("CloseAndPostOrder");
		return closeAndPostOrder;
	}
	
	public String createCopper() {
		String createCopper = property.getProperty("CreateCopper");
		return createCopper;
	}
	

	public String TestCaseDetails() {
		String TestCaseDetails = property.getProperty("TestCaseDetails");
		return TestCaseDetails;
	}

	public String getScreenshotFolderPath() {
		// TODO Auto-generated method stub
		String ScreenshotFolderPath = property
				.getProperty("ScreenshotFolderPath");
		return ScreenshotFolderPath;
	}

}
