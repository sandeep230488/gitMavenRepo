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
	
	@FindBy(xpath = "//div[@aria-label='Create']")
	private WebElement CreateLink;
	
	@FindBy(xpath = "//a[@href='/groups/?category=create']")
	private WebElement GroupLink;
	
	@FindBy(xpath = "(//input[contains(@id,'jsc_c')])[1]")
	private WebElement NameInputTd;
	
	@FindBy(xpath = "(//span[text()='Group name'])[1]")
	private WebElement NameInput;
	
	
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
		waitForElementClickable(NameInput);
		jsClick(NameInput);
		jsType(NameInputTd, name);
		//click(Createbtn,0);
				
		Assert.assertEquals(dbSelect("select * from EMP").get("FIRSTNAME").get(1), "Sandeep1", "test failed");
		
		Reporter.log(
				"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ createGroup End ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~",
				true);
		setReportLog(reportMsg.toString());
		
	}
	
	
}
