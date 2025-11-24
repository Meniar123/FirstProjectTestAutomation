package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class RightClickDemo {

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
				WebElement rightclick = driver.findElement(By.id("rightClickBtn"));
				action.contextClick(rightclick).perform();
				System.out.println("Right click is clicked");
				
				String messageRightClick = driver.findElement(By.id("rightClickBtn")).getText();
				Assert.assertEquals(messageRightClick,"Right Click Me");
			
				
				
				
	}

}
