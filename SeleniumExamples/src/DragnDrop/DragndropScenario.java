package DragnDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

// First program represent how to open mozilla browser and launch google page.
// maximize google web Page
public class DragndropScenario {

	public static void main(String[] args) {
		launchBrowser();

	}

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "G:\\Trupti\\jarfiles\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
	WebElement draggable =	driver.findElement(By.xpath("//*[@id='draggable']"));
	
	WebElement droppable = driver.findElement(By.xpath("//*[@id='droppable']"));
	//mouse movement Actions Class
	Actions act = new Actions(driver);
	act.dragAndDrop(draggable, droppable).build().perform();
			
	
	
	

	}

}
