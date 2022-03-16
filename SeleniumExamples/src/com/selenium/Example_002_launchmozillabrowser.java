package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

// First program represent how to open mozilla browser and launch google page.
// maximize google web Page
public class Example_002_launchmozillabrowser {

	public static void main(String[] args) {
		launchBrowser();

	}

	public static void launchBrowser() {

		System.setProperty("webdriver.gecko.driver", "G:\\Trupti\\jarfiles\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		// Webdriver is an interface
		// Can not create copy of interface means we can not instantiate interfaces

		WebDriver driver = new FirefoxDriver();
		//WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();

	}

}
