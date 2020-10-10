package com.facebook.Generic;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import com.facebook.utilities.ConfigReader;

import jxl.read.biff.BiffException;

public class TestNGXml {
	ConfigReader config;
	String envPackage = null;
	int testCaseNumber = 1;
	public static ExcelReader list;
	public static ExcelObjects listData = new ExcelObjects();
	public static ExcelMethods listMethods = new ExcelMethods();

	@SuppressWarnings("deprecation")
	public void runCRMApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.Listners");
		envPackage = "com.SIT.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}
	
	@SuppressWarnings("deprecation")
	public void runSTApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.ST18_6Listners");
		envPackage = "com.ST18_6.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}

	@SuppressWarnings("deprecation")
	public void runCrmLiteApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.PRMListners");
		envPackage = "com.crm.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}
	
	@SuppressWarnings("deprecation")
	public void runOnlineApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.OnlineListners");
		envPackage = "com.Online.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}
	
	@SuppressWarnings("deprecation")
	public void runMySparkApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.MySparkListners");
		envPackage = "com.MySpark.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}
	
	@SuppressWarnings("deprecation")
	public void runIDPApplication(String sheetName) {
		config = new ConfigReader();

		try {
			list = new ExcelReader(config.TestCasesPath(), sheetName);
			list.ColumnDictionary();
			listMethods.readExcelData(listData, list);
		} catch (BiffException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (IOException e) {
			System.err.println("Error :  Loading List Sheet");
			return;
		} catch (NullPointerException n) {
			System.err.println("Error :  Loading List Sheet");
			return;
		}

		// Create an instance on TestNG
		TestNG myTestNG = new TestNG();

		// Create an instance of XML Suite and assign a name for it.
		XmlSuite mySuite = new XmlSuite();
		mySuite.setName("Spark Automation Suite");
		mySuite.setPreserveOrder("true");
		mySuite.setThreadCount(config.GetThreadCount());
		if (config.GetParallelFlag()) {
			mySuite.setParallel("tests");
		}
		mySuite.addListener("com.ListnerGeneric.IDPListners");
		envPackage = "com.SIT_IDP.TestCases.";
		// Create an instance of XmlTest.
		XmlTest myTest = null;
		// Create a list of XmlTests and XmlClasses
		List<XmlTest> myTests = new ArrayList<XmlTest>();
		List<XmlClass> myClasses = null;
		// Create a list which can contain the classes that you want to run.
		/* Select sheets which are set as 'Y' */
		if (!listData.getExecute().contains("Y")) {
			System.err.println("Atleast 1 test case needs to be selected.");
			return;
		}

		try {
			for (int i = 0; i < listData.getSNo().size(); i++) {
				if (listData.getExecutionCount().get(i).isEmpty())
					listData.getExecutionCount().set(i, "1");
				for (int j = 0; j < Integer.parseInt(listData.getExecutionCount().get(i)); j++) {
					if (listData.getExecute().get(i).equals("Y")) {
						String testCaseName = envPackage + listData.getTestCaseName().get(i);
						// Add new test and assign a name for test.
						myTest = new XmlTest(mySuite);
						myTest.setName("TC_" + (testCaseNumber) + "_" + listData.getTestCaseName().get(i));
						myTest.addParameter("envName", listData.getEnv().get(i));
						myTest.addParameter("testCaseNumber", Integer.toString(testCaseNumber));
						myTest.addParameter("testDataRow", listData.getTestDataRow().get(i));
						// Add new classes and assign a name for classes.
						myClasses = new ArrayList<XmlClass>();
						myClasses.add(new XmlClass(testCaseName));
						// add XmlClasses in XmlTest
						myTest.setXmlClasses(myClasses);
						// add all XmlTest created in tests list
						myTests.add(myTest);
						/*
						 * System.out .println(" - " +
						 * listData.getTestCaseName().get(i) + " | " +
						 * listData.getEnv().get(i));
						 */++testCaseNumber;
					}

				}
			}
		} catch (Exception e) {
			System.out.println("Test Case name is incorrect");
		}
		// add the list of tests to your Suite.
		mySuite.setTests(myTests);

		// Add the suite to the list of suites.
		List<XmlSuite> mySuites = new ArrayList<XmlSuite>();
		mySuites.add(mySuite);

		// Set the list of Suites to the testNG object you created earlier.
		myTestNG.setXmlSuites(mySuites);
		// invoke run() - this will run your class.
		myTestNG.run();
	}
	
	


	public static void main(String args[]) {
		TestNGXml sparkAutomation = new TestNGXml();
		if (args[1].equalsIgnoreCase("CRM")) {
			sparkAutomation.runCRMApplication(args[0]);
		} else if (args[1].equalsIgnoreCase("PRM")) {
			sparkAutomation.runCrmLiteApplication(args[0]);
		}else if (args[1].equalsIgnoreCase("Online")) {
			sparkAutomation.runOnlineApplication(args[0]);
		}else if (args[1].equalsIgnoreCase("MySpark")) {
			sparkAutomation.runMySparkApplication(args[0]);
		}else if (args[1].equalsIgnoreCase("IDP")) {
				sparkAutomation.runIDPApplication(args[0]);
		}
		else if(args[1].equalsIgnoreCase("ST"))
		{
			sparkAutomation.runSTApplication(args[0]);
		}
		
	}
}
