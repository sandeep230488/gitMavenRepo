package com.facebook.page;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.openqa.selenium.support.ui.Wait;
import com.facebook.Generic.*;
import com.facebook.utilities.ConfigReader;
import jxl.read.biff.BiffException;

public class BasePage {
	public static String reportMsg = "TEST";

	public static ExcelReader testCaseDetails;

	public static ExcelObjects testCaseDetailsData = new ExcelObjects();

	public static ExcelMethods testCaseDetailsMethods = new ExcelMethods();

	WebDriver driver;
	WebDriverWait wait;
	WebDriverWait Submitwait;
	WebDriverWait Popupwait;
	WebDriverWait premiseAddressWait;
	WebDriverWait OMWait;
	WebDriverWait showQuoteWait;
	Wait<WebDriver> fluentwait;
	Alert alert;
	Actions act;
	JavascriptExecutor executor;
	String CtrlAltk = "CtrlAltk";
	String AltEnter = "AltEnter";
	String CtrlDown = "CtrlDown";
	String CtrlEnd = "CtrlEnd";
	String AltQ = "AltQ";
	String CtrlHome = "CtrlHome";
	String CtrlS = "CtrlS";
	String Down = "Down";
	String Enter = "Enter";
	String Up = "Up";
	String Tab = "Tab";
	String pageUp = "pageUp";
	String pageDown = "pageDown";
	String space = "Space";// added by Shivam
	String backspace = "BackSpace";// added by Shivam
	ConfigReader config = new ConfigReader();
	String dbString;
	String element;
	Database database;
	String[] DataBaseString;
	CsvFileGeneration csv = new CsvFileGeneration();
	TestCaseDetails details;
	XMLgeneration xmlGeneration = new XMLgeneration();
	RequestToSOAP triggerXMLToSOAP = new RequestToSOAP();

	public BasePage(WebDriver driver, TestCaseDetails details) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		this.details = details;
		//System.out.println(this.details);
		//dbString = envDBString;
		act = new Actions(driver);
		executor = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, 200);
		OMWait = new WebDriverWait(driver, 15);
		//DataBaseString = dbString.split("&");
		System.out.println("Creating connection with database");
		database = new Database("jdbc:oracle:thin:@localhost:1521:sandeep2", "oracle.jdbc.driver.OracleDriver", "SYSTEM", "san123");
		}

	public String getShipmentXML(String orderId, String simNumber, String correlationId, String deviceItemId,
			String simItemId) {
		return xmlGeneration.getShipmentXML(orderId, simNumber, correlationId, deviceItemId, simItemId);

	}
	
	public String getCreditCheck(String CustomerNumber, String OrderNumber) {
		return xmlGeneration.getCreditCheckXML(CustomerNumber, OrderNumber);

	}

	public static String getPortOutTime() {
		DateFormat df = new SimpleDateFormat("HH:mm");
		Date dateobj = new Date();
		Date incrementedDate = DateUtils.addMinutes(dateobj, 30);
		return df.format(incrementedDate);
	}

	public void reload(int count) {
		for (int i = 0; i < count; i++) {
			driver.navigate().refresh();
		}
	}

	public void jsClick(WebElement we) {
		executor.executeScript("arguments[0].click();", we);
	}

	public void click(WebElement we, double time) {

		waitMethod(time);
		try {
			we.click();
		} catch (Exception e) {
			System.out.println("waiting for element to be visible");
			wait.until(ExpectedConditions.elementToBeClickable(we));
			we.click();
		}

	}

	public void OMClick(WebElement we, double time) {
		waitMethod(time);
		waitMethod(0.5);
		we.click();
	}

	public void OMType(WebElement we, String value) {
		waitMethod(0.5);
		we.clear();
		we.sendKeys(value);
	}

	public void alertBox(double time) {
		String alertText;
		alert = wait.until(ExpectedConditions.alertIsPresent());
		alertText = alert.getText();
		System.out.print("Validation - " + alertText);
		alert.accept();
		waitMethod(time);
	}

	public void elementIsDispalyed(WebElement we, double time) {

		waitMethod(time);
		we.isDisplayed();
		try {
			we.click();
		} catch (Exception e) {
			System.out.println("waiting for element to be visible");
			wait.until(ExpectedConditions.elementToBeClickable(we));
			we.click();
		}
	}

	public void waitForElementClickable(WebElement we) {
		System.out.println("waiting for element to be visible");
		wait.until(ExpectedConditions.elementToBeClickable(we));
		// System.out.println("found . . .");
	}

	public boolean checkForElementVisibility(WebElement we, double time) {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		boolean visible = false;
		try {
			waitMethod(time);
			visible = we.isDisplayed();
		} catch (Exception e) {
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return visible;
	}

	/*
	 * public boolean checkForElementClickability(WebElement we, double time) {
	 * driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
	 * String visible; try { waitMethod(time); visible = we.isEnabled();
	 * 
	 * } catch (Exception e) { } driver.manage().timeouts().implicitlyWait(50,
	 * TimeUnit.SECONDS); System.out.println(visible); return visible;
	 * 
	 * }
	 */

	public boolean checkForProduct(String product, double time) {
		driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
		boolean visible = false;
		try {
			waitMethod(time);
			WebElement we = driver.findElement(By.xpath("//td[@title='" + product + "' and contains(@id, 'l_Name')]"));
			visible = we.isEnabled();
		} catch (Exception e) {
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return visible;
	}

	public void sliderClick(WebElement we, double time) {
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		waitMethod(time);
		try {
			if (we.isDisplayed())
				we.click();
		} catch (Exception e) {
		}
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	public String getOtherServiceId(String orderNumber) {
		return dbSelect("select t2.SERVICE_NUM AS SERVICE_NUM"
				+ " from siebel.s_order t1 , siebel.s_order_item t2 ,siebel.s_prod_int t3 where t1.ORDER_NUM= '"
				+ orderNumber
				+ "' and t3.ROW_ID=t2.PROD_ID and t2.ORDER_ID=t1.ROOT_ORDER_ID and t3.name like '%Promotion%'")
						.get("SERVICE_NUM").get(1);
	}

	public void notClickable(WebElement we, double time) {

		try {
			waitMethod(time);
			wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(we)));
			System.out.println("not Clickable "
					+ we.toString().substring(we.toString().indexOf(">") + 1, we.toString().length() - 1));
		} catch (Exception e) {
			System.out.println("Waiting for "
					+ we.toString().substring(we.toString().indexOf(">") + 1, we.toString().length() - 1));
			fluentwait.until(ExpectedConditions.elementToBeClickable(we));
			wait.until(ExpectedConditions.not(ExpectedConditions.elementToBeClickable(we)));

		}

	}

	public void jsType(WebElement we, String value) { // sendKeys
		we.clear();
		executor.executeScript("arguments[0].value='" + value + "';", we);
	}

	public void jsScroll() { // sendKeys
		executor.executeScript("window.scrollBy(550,900)", "");
	}

	public void type(WebElement we, String value) { // sendKeys
		we.clear();
		we.sendKeys(value);
		
	}

	public void type1(WebElement we, String value) { // sendKeys
			we.sendKeys(value);
		
	}
	public void readValue(WebElement we, String name, int time) { // get
																	// attribute
		waitMethod(time);
		try {
			details.storeInformation(name, we.getAttribute("value"));
		} catch (Exception e) {
			System.out.println("waiting for element to be visible");
			wait.until(ExpectedConditions.elementToBeClickable(we));
			details.storeInformation(name, we.getAttribute("value"));
		}
	}

	public void clear(WebElement we) {
		we.clear();
	}

	public String createBPPCSV(String email, String dueDate, int totalOrder, List<String> simNumber) {
		return csv.writeBPPCsv(email, dueDate, totalOrder, simNumber, config.csvFilePath());
	}

	public void acceptAlert() {
		alert.accept();
		pressKey(Enter);
	}

	public void dismissAlert() {
		alert.dismiss();
	}

	public void readProvider(WebElement we, String name) { // gettext
		details.storeInformation(name, we.getAttribute("value"));
	}

	public void readText(WebElement we, String name) { // gettext
		wait.until(ExpectedConditions.elementToBeClickable(we));
		details.storeInformation(name, we.getText());
	}

	public void pageDown() {
		executor.executeScript("window.scrollBy(0,500)", "");
	}

	/* create csv file */
	public void createDigitalCOCSV(String SOType, String promotion, Boolean deviceflag, String device, String pofValue,
			String deffTerm, String insurance, String externalBatchId, String accountNumber, String serviceId,
			String Pofentitlement, String pricingentitlementId, String lineDesc, String ETFFlag, String subsidyAmt) {
		csv.writeDigitalChangeOfferCsv(SOType, promotion, deviceflag, device, pofValue, deffTerm, insurance,
				externalBatchId, accountNumber, serviceId, Pofentitlement, pricingentitlementId, lineDesc, ETFFlag,
				subsidyAmt, config.csvFilePath());
	}

	public void createDigitalCOCSVwithoutPOF(String SOType, String promotion, Boolean deviceflag, String device,
			String pofValue, String deffTerm, String insurance, String externalBatchId, String accountNumber,
			String serviceId, String lineDesc, String ETFFlag, String subsidyAmt) {
		csv.writeDigitalChangeOfferCsvNOPOF(SOType, promotion, deviceflag, device, pofValue, deffTerm, insurance,
				externalBatchId, accountNumber, serviceId, lineDesc, ETFFlag, subsidyAmt, config.csvFilePath());
	}

	/* create Terminate csv file */
	public String createSDCSV(String RequestType, String RequestSubType, String DueDate, String externalBatchId,
			String accountNumber, String MobileNumber, String simNumber, String SembelSim, String PrimaryOffer,
			String FirstName, String Lastname, String Email, String Comments, String LineDescription,
			String EntitlementRef) {
		return csv.writeSparkDigitalCsv(RequestType,  RequestSubType,  DueDate,  externalBatchId,
				 accountNumber, MobileNumber,  simNumber,  SembelSim,  PrimaryOffer,
				 FirstName,  Lastname,  Email,  Comments,  LineDescription,
				 EntitlementRef, config.terminatecsvFilePath());
	}

	/* create csv file */
	public String createWholesaleCSV(String RequestType, String RequestSubType, String DueDate, String externalBatchId,
			String Cust_MVNOName, String AccountNumber, String MobileNumber, String ChangedMobileNumber,
			String simNumber, String ProductOfferID, String ParentProductOfferID, String PrimaryOffer,
			String Add_Remove, String ContractTerm, String EntitlementRef, String GSPID, String LSPID,
			String LSPAccountNumber, String LSPSIMNumber, String SOMID, String APNProfile, String ContactFirstName,
			String ContactLastName, String ContactMobilePhone, String ContactEmailAddress, String Comments,
			String LineDescription) {
		return csv.writeWholesaleCsv(RequestType, RequestSubType, DueDate, externalBatchId, Cust_MVNOName,
				AccountNumber, MobileNumber, ChangedMobileNumber, simNumber, ProductOfferID, ParentProductOfferID,
				PrimaryOffer, Add_Remove, ContractTerm, EntitlementRef, GSPID, LSPID, LSPAccountNumber, LSPSIMNumber,
				SOMID, APNProfile, ContactFirstName, ContactLastName, ContactMobilePhone, ContactEmailAddress, Comments,
				LineDescription, config.csvFilePath());
	}

	// GetValue from DB
	public void DBGetValue(String Value) {
		return;

	}

	public HashMap<String, List<String>> dbSelect(String selectQuery) {
		System.out.println(selectQuery);
		return database.selectQuery(selectQuery);
		
	}

	/* Update query for database */
	public int dbUpdate(String updateQuery) {
		return database.updateQuery(updateQuery);
	}

	public void doubleClick(WebElement onElement) {
		act.doubleClick(onElement).perform();
	}

	public ArrayList<String> getAssetInfo() {
		return details.getAssetInfo();
	}

	/* Returns stored testcase details */

	public String getInfo(String infoName) {

		String value = null;
		try {
			value = details.getInformation(infoName);
		} catch (NullPointerException e) {
			value = "";
		}
		return value;
	}

	public HashMap<String, List<String>> getOrderDetails(String orderId) {
		return dbSelect(
				"select t1.root_order_item_id AS PARENTPRODUCT_ID, t1.x_tnz_promotion_id AS ROOTPRODUCT_ID,t1.SERVICE_NUM AS SERVICE_NUM,t3.ORDER_NUM AS ORDER_NUM,t3.ROW_ID AS ORDER_ID,t3.X_TNZ_ORDER_AIM AS ORDER_AIM,t2.name,t1.row_id,X_SHIPPABLE_FLG AS SHIPFLAG,t2.X_PROVISIONABLE_FLG AS PRFLAG,t1.asset_integ_id AS ASSET_ID,t1.action_cd AS ACTION"
						+ " from siebel.s_order_item t1, siebel.s_prod_int t2, siebel.s_order t3"
						+ " where t1.order_id= '" + orderId
						+ "' and t1.prod_id = t2.row_id and t1.ORDER_ID=t3.ROOT_ORDER_ID");
	}

	public String getServiceId(String orderNumber) {
		return dbSelect("select t2.SERVICE_NUM AS SERVICE_NUM"
				+ " from siebel.s_order t1 , siebel.s_order_item t2 ,siebel.s_prod_int t3 where t1.ORDER_NUM= '"
				+ orderNumber
				+ "' and t3.ROW_ID=t2.PROD_ID and t2.ORDER_ID=t1.ROOT_ORDER_ID and t3.name like '%Promotion%'")
						.get("SERVICE_NUM").get(0);
	}

	/* Returns a random number */
	public String getRandomNumber(String name) {
		String randomNumber = RandomStringUtils.randomNumeric(4);
		storeInfo(name, randomNumber);
		return randomNumber;
	}

	public String getTimestamp() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("kk:mm:ss");
		String formattedDate = sdf.format(date);
		return formattedDate;
	}

	public void Logout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void pressKey(String keyPressChord) {
		switch (keyPressChord) {

		case "pageUp":
			act.sendKeys(Keys.PAGE_UP).perform();
			break;

		case "pageDown":
			act.sendKeys(Keys.PAGE_DOWN).perform();
			break;

		case "CtrlAltk":
			act.keyDown(Keys.CONTROL).keyDown(Keys.ALT).sendKeys("k").keyUp(Keys.ALT).keyUp(Keys.CONTROL).perform();
			break;
		case "CtrlS":
			act.sendKeys(Keys.chord(Keys.CONTROL, "s")).perform();
			break;

		case "CtrlDown":
			// chord = "Keys.ALT";
			act.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).keyUp(Keys.CONTROL).perform();
			break;

		case "CtrlEnd":
			// chord = "Keys.ALT";
			act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).perform();
			break;

		case "AltQ":
			act.sendKeys(Keys.chord(Keys.ALT, "q")).perform();
			break;

		case "CtrlHome":
			// chord = "Keys.ALT";
			act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).perform();
			break;

		case "Down":
			// chord = "Keys.DOWN";
			act.sendKeys(Keys.DOWN).perform();
			break;
		case "AltEnter":
			// chord = "Keys.ALT";
			act.keyDown(Keys.ALT).sendKeys(Keys.ENTER).keyUp(Keys.ALT).perform();
			break;
		case "Space":
			// chord = "Keys.ENTER";
			act.sendKeys(Keys.SPACE).perform();// added by shivam
			break;

		case "BackSpace":
			// chord = "Keys.ENTER";
			act.sendKeys(Keys.BACK_SPACE).perform();// added by shivam
			break;
		case "Enter":
			// chord = "Keys.ENTER";
			act.sendKeys(Keys.ENTER).perform();
			break;
		case "Tab":
			// chord = "Keys.TAB";
			act.sendKeys(Keys.TAB).perform();
			break;
		case "Up":
			// chord = "Keys.UP";
			act.sendKeys(Keys.ARROW_UP).perform();
			break;
		default:
			break;
		}
	}

	public void readTestData() {
		/* Read test data from excel */
		 System.out.println("Loading testCasedetails Data File . . .");
		try {
			testCaseDetails = new ExcelReader(config.TestCaseDetails(), "ExecutionDetails");
			testCaseDetails.ColumnDictionary();
			testCaseDetailsMethods.readTestData(testCaseDetailsData, testCaseDetails);
		} catch (BiffException b) {
			System.err.println("Error : Loading Test Data");
			return;
		} catch (IOException e) {
			System.err.println("Error : Loading Test Data");
			return;
		} catch (NullPointerException e) {
			System.err.println("Error : Loading Test Data");
			return;
		}
	}

	/* appends method level logs in report */
	public void setReportLog(String msg) {
		Reporter.log("~Step~" + getTimestamp() + " " + this.getClass().getSimpleName() + " - "
				+ Thread.currentThread().getStackTrace()[2].getMethodName() + "~Pass");
	}

	public void storeAssetInfo(String lineItem) {
		details.storeAssetInfo(lineItem);
	}

	/* Stores testcase details */
	public void storeInfo(String name, String value) {
		details.storeInformation(name, value);
	}

	/* Explicit sleep */
	public void waitMethod(double time) {
		try {
			Thread.sleep((long) (time * 1000));
		} catch (Exception e) {
			Reporter.log(e.getMessage(), true);
		}
	}

	public void waitForPageLoad() {
		ExpectedCondition<Boolean> jQueryLoad = driver -> ((Long) ((JavascriptExecutor) driver)
				.executeScript("return jQuery.active") == 0);
		Boolean jQueryDefined = (Boolean) executor.executeScript("return jQuery.active==0");
		if (!jQueryDefined) {
			System.out.println("waiting for page load");
			wait.until(jQueryLoad);
			System.out.println("Page is loaded successfully");
		} else {
			System.out.println("waiting for page load");
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			System.out.println("Page is loaded successfully");
		}
	}

}
