package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysUsingJvaScriptExecutor {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		
		//sendkeys using java script

		WebElement fullName = driver.findElement(By.id("userName"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('username').value='meniar';") ;
		

	}

}
