package com.crm.qa.pageobjects;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

import com.crm.qa.generic.BaseLib;
import com.crm.qa.generic.ScreenshotHandle;

public class LoginPage extends BaseLib {

	@FindBy(name = "username")
	WebElement unTxtBx;

	@FindBy(name = "password")
	WebElement pwdTxtBx;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[text()='Sign Up']")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	public LoginPage(WebDriver driver) throws IOException {
		super();
		PageFactory.initElements(driver, this);
		System.out.println(driver.getCurrentUrl());
	}

	public void validateLoginPageTitle(WebDriver driver) throws IOException {

		String act = driver.getTitle();
		System.out.println(act);
		String exp = "Free CRM software in the cloud powers sales and customer service";
		Assert.assertEquals(act, exp);
		Reporter.log("CRM page title is verified", true);
		// ScreenshotHandle.takeScreenshot("loginpage");
	}

	public void validateCRMImage(WebDriver driver) {
		boolean logo = crmLogo.isDisplayed();
		System.out.println(logo);
	}

	public void login(String uname, String pwd, WebDriver driver) {
		unTxtBx.sendKeys(uname);
		// System.out.println(unTxtBx);
		pwdTxtBx.sendKeys(pwd);
		// System.out.println(pwdTxtBx);
		loginBtn.click();

	}

}
