package training;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class DoubleClick_1 {

	public static void main(String[] args) {

		// Open Chrome browser 
		WebDriver driver = new ChromeDriver();
		
		// maximize browser
		driver.manage().window().maximize();

		// Open NopCommerce Application
		driver.get("https://demoqa.com/buttons");
		
		//instantiate action class
		Actions action = new Actions(driver);
		
		//retrieve webEelemnt to perform doucleClick
		WebElement btnDoubleClick = driver.findElement(By.id("doubleClickBtn"));
		action.doubleClick(btnDoubleClick).perform();
		System.out.println("button is double clicked");
		
		String DoubleClickMessage = driver.findElement(By.id("doubleClickMessage")).getText();
		Assert.assertEquals(DoubleClickMessage,"You have done a double click");
		
		driver.close();
		driver.quit();
	}

}
