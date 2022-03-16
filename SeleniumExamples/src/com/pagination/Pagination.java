package com.pagination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.handler.codec.http.HttpHeaders.Names;

public class Pagination {

	
	public static WebDriver driver;

	public static void main(String[] args) {
	testData();

	}


	public static void testData() {
	driver = new ChromeDriver();
	driver.get("https://www.dice.com/jobs");
     int p=1;
     
	while(p!=7) {

	List<WebElement> names =driver.findElements(By.cssSelector("a.card-title-link.bold"));
	for(int i=0;i<names.size();i++) {
	System.out.println(names.get(i).getText());
	}
	System.out.println("--------------------------------------------------------------------------------");
	driver.findElement(By.xpath("//a[text()='"+(p+1)+"']")).click();
	p++;
	}
	}
	}


