package training;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Open browser Chrome
		WebDriver driver = new ChromeDriver();
		
		//Implicit wait
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		
		//delete cookies
		driver.manage().deleteAllCookies();
		
		//open application
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
        //maximize browser
		driver.manage().window().maximize();	
		
		//wait 3sec
		
	    Thread.sleep(3000);
	
		
		//clear login
		driver.findElement(By.id("Email")).clear();
		
		//clear password
		driver.findElement(By.id("Password")).clear();
		
		//fill login
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		
		//fill password
		driver.findElement(By.id("Password")).sendKeys("admin");
		
		//click btn login
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//explicit wait on the login button
		 WebElement btnLogin;
		 btnLogin = wait.until (ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']")));
		 btnLogin.click();
		
		
		//Successuful message
		System.out.println("Successufully Authentification");
		
		//close browser
		driver.close();
		driver.quit();		
		
		
	}

}
