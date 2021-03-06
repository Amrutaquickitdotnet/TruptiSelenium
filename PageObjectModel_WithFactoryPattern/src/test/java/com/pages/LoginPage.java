package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
//Define locators
	@FindBy(id="txtUsername")
	WebElement username;
	
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginButtonElement;
	
	//Assign locators
	
	public void enteruserusername(String user) {
		username.sendKeys(user);
	}
	
	public void enterpasswordname(String pass) {
	password.sendKeys(pass);
	}
	public void loginButton() {
		loginButtonElement.click();
		}
}
