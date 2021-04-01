package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;



public class TestAcmeBankLogin extends BaseClass {
		
	@Test
	public void loginAppTest()
	{
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.loginToAcmeBank("test@testmail.com", "Demo123");	
	}
	
}
