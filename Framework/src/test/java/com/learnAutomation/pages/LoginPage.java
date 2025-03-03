package com.learnAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	
	@FindBy(xpath="//input[@name='email']1111") WebElement uName;
	@FindBy(xpath="//input[@name='password']") WebElement pass;
	@FindBy(xpath="//div[contains(text(),'Login')]") WebElement loginButton;
	
	
	
	public void loginToCRM(String usernameApplication, String passwordApplication)
	{
		uName.sendKeys(usernameApplication);
		pass.sendKeys(passwordApplication);
		loginButton.click();
	}
	
}
