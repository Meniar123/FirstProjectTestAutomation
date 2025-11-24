package testCases;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleclickDemo {

	public static void main(String[] args) {
	


		// Open Chrome browser 
		WebDriver driver = new ChromeDriver();
		
	    // Maximize browser
		driver.manage().window().maximize();
			
		// Open NopCommerce Application
		driver.get("https://demoqa.com/buttons");
		
		// Instantiate action class
		
		Actions action = new Actions(driver);
		
		// Retrieve WebElement to perform double click
		
		WebElement btndoubleclick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btndoubleclick).perform();
		System.out.println("Button is double clicked");
		
		// compare
		String messageDoubleClick = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(messageDoubleClick, "You have done a double click");
		
		//driver.close();
		driver.close();
		driver.quit();	}

}
