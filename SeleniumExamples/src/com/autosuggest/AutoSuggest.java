package com.autosuggest;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoSuggest {

	static WebDriver driver;

	public static void main(String[] args) {
		suggestion();
	}
	
	
	
	public static void suggestion() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("p")).sendKeys("Selenium");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
	    List<WebElement>list = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
	    System.out.println("Size of AutoSuggest List are :"+ list.size());
	    
	    
	    for(int i =0; i<list.size(); i++) {
	    	System.out.println(list.get(i).getText());
	    	System.out.println(list.get(i).getText());
	    	if(list.get(i).getText().equalsIgnoreCase("selenium interview questions".toLowerCase().trim())) {
	    		list.get(i).click();
	    		try {
					Thread.sleep(7000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	    		driver.findElement(By.xpath("//body/div[@id='doc']/div[@id='bd']/div[@id='results']/div[@id='cols']/div[@id='left']/div[1]/div[1]/div[1]/div[1]/ol[1]/li[2]/div[1]/div[1]/h3[1]/a[1]")).click();
	    		break;
	    		
	    		
	    	}
	    }
	
	}
}
