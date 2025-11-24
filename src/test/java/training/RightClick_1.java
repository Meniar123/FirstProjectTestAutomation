package training;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_1 {

	public static void main(String[] args) {
		
		// Open Chrome browser 
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// Open NopCommerce Application
		driver.get("https://demoqa.com/buttons");

		//instantiate action class
	Actions action = new Actions(driver);
		
		//retrieve webEelemnt to perform RightClick
	WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
	action.contextClick(btnRightClick).perform();
	 
	String RightClickMessage = driver.findElement(By.id("rightClickMessage")).getText();
	Assert.assertEquals(RightClickMessage, "You have done a right click");
	
      
		driver.close();
		driver.quit();





	}

}
