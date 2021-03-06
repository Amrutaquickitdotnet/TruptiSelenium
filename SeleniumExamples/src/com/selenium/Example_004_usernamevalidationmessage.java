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
public class Example_004_usernamevalidationmessage {

	public static void main(String[] args) {
		launchBrowser();

	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();

		WebElement usernameValmsg = driver.findElement(By.id("spanMessage"));
		
		String developerResult = usernameValmsg.getText();

		String actualResult = "username is not valid";// client requistion

		if (developerResult.equalsIgnoreCase(actualResult)) {
			System.out.println("Validation for username is appeared");
		} else {
			System.out.println("Invalid usernamemessage");
		}

	}

}
