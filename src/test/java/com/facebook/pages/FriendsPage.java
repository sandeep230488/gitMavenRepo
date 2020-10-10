package com.facebook.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import com.facebook.Generic.TestCaseDetails;
import com.facebook.page.BasePage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import org.testng.Assert;


public class FriendsPage extends BasePage {
	
	@FindBy(xpath = "//a[text()='Create']")
	private WebElement CreateLink;
	
	@FindBy(xpath = "//div[text()='Group ']")
	private WebElement GroupLink;
	
	@FindBy(xpath = "//input[@name='name']")
	private WebElement NameInput;
	
	@FindBy(xpath = "//button[text()='Create']")
	private WebElement Createbtn;
	
	
	public FriendsPage(WebDriver driver, TestCaseDetails details) {
		super(driver, details);

	}

	
	public void createGroup(String name)
	{
		Reporter.log(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ createGroup Start ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
				true);
		waitForElementClickable(CreateLink);
		click(CreateLink,1);
		click(GroupLink,1);
		click(NameInput,0.5);
		type(NameInput, name);
		click(Createbtn,0);
		
		Assert.assertEquals(dbSelect("select * from EMP").get("FIRSTNAME").get(1), "Sandeep1", "test failed");
		
		Reporter.log(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ createGroup End ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
				true);
		setReportLog(reportMsg.toString());
		
	}
	
	
}
