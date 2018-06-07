package com.crm.qa.pageobjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.crm.qa.generic.BaseLib;
import com.crm.qa.generic.ScreenshotHandle;
import com.crm.qa.generic.WaitStatementLib;

public class HomePage extends BaseLib {

	@FindBy(xpath = "//td[starts-with(text(),'  User: Naveen K')]")
	WebElement userNameLabel;

	@FindBy(xpath = "//*[contains(text(),'CRMPRO')]")
	WebElement crmlogo;

	@FindBy(xpath = "//a[@title='Calendar']")
	WebElement calendartab;

	public HomePage(WebDriver driver) throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}

//	public void verifyHomePageLogo(WebDriver driver) throws IOException {
//		// String colour = userNameLabel.getCssValue("font color");
//		// System.out.println(colour);
//		// String userlabeltext = userNameLabel.getText();
//		String attr1 = crmlogo.getTagName();
//		// WaitStatementLib.implicitWaitForSeconds(driver, 10);
//
//		System.out.println(attr1);
//		System.out.println("tag name printed");
//		String logo = crmlogo.getText();
//		System.out.println(logo);
//	}

	public void clickOnCalenderTab(WebDriver driver) {
		calendartab.click();
	}

}
