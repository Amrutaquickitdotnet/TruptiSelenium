package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public  LoginPage(WebDriver driver) {
		this.driver= driver;
	}
//Define locators
	By username = By.id("txtUsername");
	
	By password = By.id("txtPassword");
	
	By loginButton = By.id("btnLogin");
	
	//Assign locators
	
	public void enteruserusername(String user) {
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterpasswordname(String pass) {
	driver.findElement(password).sendKeys(pass);
	}
	public void loginButton() {
		driver.findElement(loginButton).click();
		}
}
