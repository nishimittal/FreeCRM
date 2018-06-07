package com.crm.qa.scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import com.crm.qa.generic.BaseLib;
import com.crm.qa.generic.ExcelUtils;
import com.crm.qa.generic.ScreenshotHandle;
import com.crm.qa.pageobjects.HomePage;
import com.crm.qa.pageobjects.LoginPage;

public class LoginPageTest extends BaseLib {

	@Test(priority = 1)
	public void loginPageTitleTest() throws IOException, InterruptedException {
		LoginPage loginpage = new LoginPage(driver);
		loginpage.validateLoginPageTitle(driver);
		loginpage.validateCRMImage(driver);
		// loginpage.login(prop.getProperty("username"),
		// prop.getProperty("password"),driver);
		String username = ExcelUtils.readData("Sheet1", 1, 1);
		String password = ExcelUtils.readData("Sheet1", 1, 2);
		loginpage.login(username, password, driver);
		ScreenshotHandle.takeScreenshot("loginpage", driver);

		HomePage hp = new HomePage(driver);
		//hp.verifyHomePageLogo(driver);
		hp.clickOnCalenderTab(driver);
	}
}
