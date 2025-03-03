package com.learnAutomation.testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	
	@Test
	public void test1() 
	{
	   WebDriver driver=new ChromeDriver();	
	   driver.get("https://ui.cogmento.com/?lang=en");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  driver.findElement(By.xpath("//input[@name='email']")).sendKeys("UserName");
	  driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
	  driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
	  driver.quit();
		
	}

}
