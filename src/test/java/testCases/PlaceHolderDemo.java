package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PlaceHolderDemo {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		String url = "https://demoqa.com/tool-tips/";
		driver.manage().window().maximize();
		driver.get(url);	
		
		WebElement placeHolder = driver.findElement(By.id("toolTipTextField"));
		String textplaceHolder = placeHolder.getAttribute("placeHolder");
		System.out.println("placeHolder is : " + textplaceHolder);
		
		driver.quit();
		
		
	}

}
