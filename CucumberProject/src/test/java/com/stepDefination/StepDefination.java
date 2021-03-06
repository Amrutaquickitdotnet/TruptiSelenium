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
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
	}
	@When("username and password being entered and click on login button")
	public void username_and_password_being_entered_and_click_on_login_button() {
		driver.findElement(By.id("email")).sendKeys("8652457999");
		driver.findElement(By.id("pass")).sendKeys("Amruta@1981");
		driver.findElement(By.linkText("Log In")).click();
	}
	@Then("login should be successfully done")
	public void login_should_be_successfully_done() {
		System.out.println("Login done");
		driver.quit();
	    
	}
}
