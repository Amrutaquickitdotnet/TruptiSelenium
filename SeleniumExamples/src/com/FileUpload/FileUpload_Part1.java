package com.FileUpload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Part1 {
static WebDriver driver;
	public static void main(String[] args) {
		launchBrowser();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fileUpload();
	}
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/addEmployee");
	}
	public static void fileUpload() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	WebElement photoUpload =	driver.findElement(By.name("photofile"));
	photoUpload.sendKeys("G:\\Trupti\\FileHandling\\abstraction.txt");
	}

}
