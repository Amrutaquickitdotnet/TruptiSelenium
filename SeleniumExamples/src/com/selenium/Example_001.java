package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// First program represent how to open browser and launch google page.
// maximize google web Page
public class Example_001 {

	public static void main(String[] args) {
		launchBrowser();

	}

	public static void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");
		// Webdriver is an interface
		// Can not create copy of interface means we can not instantiate interfaces

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
