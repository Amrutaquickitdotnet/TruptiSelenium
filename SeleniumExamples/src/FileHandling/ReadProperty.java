package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadProperty {

	static FileInputStream  fs;
	static Properties prop;
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO call method readData
		readData();
	}
	
	public static void readData() {
		prop = new Properties();// prop 
		String path ="G:\\Trupti\\FileHandling\\Data.properties";
		
		// 2 classes in java 
		// FileInputStream => InputStream => Read 
		//FileOutputStream => OutStream => Write
		
		try {
			  fs = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			prop.load(fs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.get(prop.getProperty("url"));
		driver.findElement(By.name(prop.getProperty("usernamelocator"))).sendKeys(prop.getProperty("usernameValue"));
		driver.findElement(By.name(prop.getProperty("passwordLocator"))).sendKeys(prop.getProperty("passwordValue"));
		driver.findElement(By.xpath(prop.getProperty("LoginButtonLocator"))).click();
	}

}
