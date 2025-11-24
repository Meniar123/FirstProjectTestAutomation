package training;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardEvent {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		String url = "https://demoqa.com/text-box";
		driver.get(url);	
		driver.manage().window().maximize();
		
		WebElement fullName = driver.findElement(By.id("userName"));
		WebElement email = driver.findElement(By.id("userEmail"));
		WebElement currentAddress = driver.findElement(By.id("currentAddress"));
		WebElement permanentAdress = driver.findElement(By.id("permanentAddress"));
		
		
		
		fullName.sendKeys("Meniar");
		email.sendKeys("minyar.lamine123@gmail.com");
		currentAddress.sendKeys("28 rue mauroice berteaux Bezons");
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "a"));
		currentAddress.sendKeys(Keys.chord(Keys.CONTROL, "c"));
		permanentAdress.sendKeys(Keys.chord(Keys.CONTROL, "v"));
		
		
		// force submit button with javascript executor
		
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", btnSubmit);
		
		driver.quit();
		

		
		
		

		
	}

}
