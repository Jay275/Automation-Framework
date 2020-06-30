package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy (how=How.XPATH, using = "//*[@id=\"loginButton\"]") WebElement Signin;
	@FindBy (how=How.XPATH, using = "//*[@id=\"username\"]") WebElement username;
	@FindBy (how=How.XPATH, using = "//*[@id=\"password\"]") WebElement password;
	@FindBy (how=How.XPATH, using = "//*[@id=\"login\"]") WebElement login;
	
	public void clickSignin() {
		Signin.click();
		
	}
	public void setUsername (String strEmail) {
		username.sendKeys(strEmail);
	}
	public void setPassword (String strPassword) {
		password.sendKeys(strPassword);
	}
	public void clickLogin() {
		login.click();
	}

}
