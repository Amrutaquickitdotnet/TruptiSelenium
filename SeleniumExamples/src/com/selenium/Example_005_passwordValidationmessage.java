package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

// First program represent how to open mozilla browser and launch google page.
// maximize google web Page
public class Example_005_passwordValidationmessage {

	public static void main(String[] args) {
		launchBrowser();

	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("btnLogin")).click();

		WebElement passwordValidationMessage = driver.findElement(By.id("spanMessage"));
		
		String developerResultForPassword = passwordValidationMessage.getText();

		final String  actualResult = "Password cannot be empty";// client requistion

		if (developerResultForPassword.equals(actualResult)) {
			System.out.println("Validation for password is appeared");
		} else {
			System.out.println("Invalid passwordmessage");
		}
        driver.close();
	}

}
