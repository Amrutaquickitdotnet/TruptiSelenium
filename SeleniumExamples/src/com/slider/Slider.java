package com.slider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Slider {
static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getUrl();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		slider();
	}
	public static void getUrl() {
	System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

	 driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://jqueryui.com/slider/");

	
	}
	
	public static void slider() {
		driver.switchTo().frame(0);
		
	WebElement slider =	driver.findElement(By.xpath("//*[@id = 'slider']/span"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	
	Actions act = new Actions(driver);
	
	act.dragAndDropBy(slider, 0, 350).build().perform();

	
	}

}
