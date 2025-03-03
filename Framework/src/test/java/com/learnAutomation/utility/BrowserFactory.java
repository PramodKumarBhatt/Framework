package com.learnAutomation.utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	WebDriver driver;
	public static WebDriver startApplication(WebDriver driver,String BrowserName,String appURL) {
		if(BrowserName.equalsIgnoreCase("Chrome"))
		{
			 driver=new ChromeDriver();	
		}else if(BrowserName.equalsIgnoreCase("Firefox"))
		{
			driver=new FirefoxDriver();	
		}else if(BrowserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("Please provide a correct browser");
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.manage().window().maximize();
		 driver.get("https://ui.cogmento.com/?lang=en");
		 return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
