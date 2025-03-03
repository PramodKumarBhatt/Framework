package com.learnAutomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnAutomation.pages.BaseClass;
import com.learnAutomation.pages.LoginPage;
import com.learnAutomation.utility.ExcelDataProvider;
import com.learnAutomation.utility.Helper;

public class LoginTestCRM extends BaseClass{

	@Test
	public void loginApp() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.loginToCRM(excel.getStringData("Login", 0, 0),excel.getStringData("Login", 0, 1));
	}
}
