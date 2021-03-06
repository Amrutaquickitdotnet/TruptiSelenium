package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefination {
	static WebDriver driver;
	
	@Given("I need to enter proper url")
	public void i_need_to_enter_proper_url() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		driver.manage().window().maximize();
		
		
	}
	@When("and {string} and {string} being entered and click on login button")
	public void and_and_being_entered_and_click_on_login_button(String username, String password) {
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		driver.findElement(By.id("btnLogin")).click();
	}
		
	
	@Then("login should be successfully done")
	public void login_should_be_successfully_done() {
		System.out.println("Login done");
		driver.quit();
	    
	}
}
