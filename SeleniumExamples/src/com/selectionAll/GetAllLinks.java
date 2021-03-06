package com.selectionAll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllLinks {
 static WebDriver driver;
	public static void main(String[] args) {
		launchbrowser();
		login();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getAllLinks();

	}
	public static void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");

	}

	public static void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	}
	
	public static void getAllLinks() {
	List<WebElement> allLinks =	driver.findElements(By.tagName("a"));
	for(WebElement linkList:allLinks) {
		System.out.println(linkList.getAttribute("href"));
	}
	}
}
