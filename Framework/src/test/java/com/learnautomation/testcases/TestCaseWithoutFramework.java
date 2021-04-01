package com.learnautomation.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCaseWithoutFramework {
	
	@Test
	public void loginTest()
	{
		//new test without a framework 
		//do I need to send it?
		
		System.setProperty("webdriver.chrome.driver", "C:\\PS_QA\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://usdemo.vee24.com/#/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector("#mat-input-0")).sendKeys("test@testmail.com");
		driver.findElement(By.cssSelector("#mat-input-1")).sendKeys("Demo123");
		driver.findElement(By.cssSelector("form > button > span")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.close();
	}

}
