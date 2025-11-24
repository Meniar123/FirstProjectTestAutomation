package testCases;

import java.time.Duration;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SuperCalculator {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		

		String url = "https://juliemr.github.io/protractor-demo/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		
		WebElement premierNombre1 = driver.findElement(By.xpath("//input[@ng-model='first']"));
		premierNombre1.sendKeys("5");
		
		WebElement deuxiemeNombre2 = driver.findElement(By.xpath("//input[@ng-model='second']"));
		deuxiemeNombre2.sendKeys("7");
		
		WebElement gobtn = driver.findElement(By.xpath("//button[@id='gobutton']"));
		gobtn.click();
		
        
		WebElement result = driver.findElement(By.tagName("h2)"));
		System.out.println("la somme des deux nombres est de :"  +result.getText());
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Pattern pattern = Pattern.compile("\\d+");
		wait.until(ExpectedConditions.textMatches(By.tagName("h2"), pattern));
		System.out.println("the result is :  "+result.getText());
		
		driver.quit();
		
		
		
		
		

	}

}
