package com.learnAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.learnAutomation.utility.BrowserFactory;
import com.learnAutomation.utility.ConfigDataProvider;
import com.learnAutomation.utility.ExcelDataProvider;
import com.learnAutomation.utility.Helper;


public class BaseClass {

	public WebDriver driver;
	public ExcelDataProvider excel;
	public ConfigDataProvider config;

	@BeforeSuite
	public void setupSuite() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}

	
	////https://ui.cogmento.com/?lang=en
	@Parameters({"browser","urlToBeTested"})
	@BeforeClass
	public void setUp(String browser,String url) {
		//driver = BrowserFactory.startApplication(driver, config.getBrowserName(), config.getURL());
		driver = BrowserFactory.startApplication(driver, browser, url);
	}

	//@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}

	@AfterMethod()
	public void getScreenshot(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			Helper.captureScreenshot(driver);
		}
	}

}
