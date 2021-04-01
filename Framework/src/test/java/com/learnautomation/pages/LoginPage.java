package com.learnautomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver Ldriver)
	{
		this.driver = Ldriver;
	}
	
	@FindBy(css="#mat-input-0") WebElement userName;
	@FindBy(css="#mat-input-1") WebElement passWord;
	@FindBy(css="form > button > span") WebElement loginButton;
	
	public void loginToAcmeBank(String username, String pass)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		userName.sendKeys(username);
		passWord.sendKeys(pass);
		loginButton.click();
	}
}
