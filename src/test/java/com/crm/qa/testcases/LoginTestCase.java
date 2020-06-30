package com.crm.qa.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginTestCase extends TestBase { 

	@Test
	public void initializaiton() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		loginpage.clickSignin();
		loginpage.setUsername(prop.getProperty("username"));
		loginpage.setUsername(prop.getProperty("password"));
		loginpage.clickLogin();
	}
}
