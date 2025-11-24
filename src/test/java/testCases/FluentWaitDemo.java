package testCases;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
        //open Driver 
		WebDriver driver = new ChromeDriver();

		//open application
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		//maximize browser
		driver.manage().window().maximize();	


		//clear login
		driver.findElement(By.id("Email")).clear();

		//clear password
		driver.findElement(By.id("Password")).clear();

		//fill login
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");

		//fill password
		driver.findElement(By.id("Password")).sendKeys("admin");

        // fluent wait on log button

		Wait wait = new FluentWait (driver)							
				.withTimeout(30, TimeUnit.SECONDS) 			
				.pollingEvery(5, TimeUnit.SECONDS) 			
				.ignoring(NoSuchElementException.class);
		WebElement btnlog = wait.until(new Function<WebDriver, WebElement>
		
	}

}
