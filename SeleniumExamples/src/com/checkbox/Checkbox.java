package com.checkbox;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchbrowser();
		login();
		// selectAllCheckboxes();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// firstTwocheckbox();
		// lastTwocheckbox();
		multiscenario();
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

	public static void selectAllCheckboxes() {

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectAll']"));
		checkbox.click();
		System.out.println("Checkbox was selected " + checkbox.isSelected());
		checkbox.click();// deselection

		System.out.println("Checkbox is now disabled " + checkbox.isSelected());
	}

	public static void firstTwocheckbox() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		int count = checkboxes.size();

		for (int i = 0; i < count; i++) {

			if (i <= 3) {
				checkboxes.get(i).click();
			}
		}
	}

	public static void lastTwocheckbox() {

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy", 1200);

		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		int count = checkboxes.size();

		for (int i = count - 2; i < count; i++) {

			checkboxes.get(i).click();

		}
	}

	public static void multiscenario() {
		List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id='resultTable']/tbody//input"));
		int count = checkboxes.size();

		for (WebElement chBox : checkboxes) {
			WebElement jobTitle = chBox.findElement((By.xpath("../../td[5]")));
			String jobTitleName = jobTitle.getText();
			String desiredJobTitle = jobTitleName.trim().toLowerCase();
			/*
			 * if (desiredJobTitle.startsWith("SALES".toLowerCase()) ||
			 * desiredJobTitle.contains("hr associate".toLowerCase())) { chBox.click();
			 */
				if (desiredJobTitle.contains("IT Manager".toLowerCase())) {
					chBox.click();
			}
		}
	}
}
