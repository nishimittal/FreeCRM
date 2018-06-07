package com.crm.qa.generic;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseLib {
	public WebDriver driver; // final driver
	public static Properties prop;

	@BeforeTest
	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", ".\\exefiles\\chromedriver.exe");
//		driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", ".\\exefiles\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		WaitStatementLib.implicitWaitForSeconds(driver, 10);
		driver.get(GetPropertyValues.getValue("url"));
		Reporter.log("Navigating to url", true);
	}
}
