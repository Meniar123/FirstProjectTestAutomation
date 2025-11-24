package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement btnClicMe = driver.findElement(By.id("alertButton"));
		btnClicMe.click();
		
		//Accept Alert
		driver.switchTo().alert().accept();
		String title = driver.getTitle();
		System.out.println("Title of the application is : " +title );
		
		driver.quit();
		

	}

}
