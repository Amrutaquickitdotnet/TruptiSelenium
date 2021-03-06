package com.stepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
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
	@When("user enter crendentials to login")
	public void user_enter_crendentials_to_login(io.cucumber.datatable.DataTable usercredentials) {
	    
		List<List<String>> data =	usercredentials.asLists();
		driver.findElement(By.id("txtUsername")).sendKeys(data.get(1).get(0));
		driver.findElement(By.id("txtPassword")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("btnLogin")).click();
	}
	
	@Then("login should be successfully done")
	public void login_should_be_successfully_done() {
		System.out.println("Login done");
		driver.quit();
	}


	

}
