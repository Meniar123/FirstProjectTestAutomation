package testCases;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

public class VerifyColor1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		String url = "https://dev.eudonet.com/app/";
		driver.get(url);
		driver.manage().window().maximize();
		
		
		String color = driver.findElement(By.xpath("//div[@onclick='authUser();']")).getCssValue("background-color");
		Color color1 = Color.fromString(color);
		String actualColor = color1.asHex();
		Assert.assertEquals("#79BE0B", actualColor);
		System.out.println("The background color of the button is : "  +actualColor);
		
		driver.quit();
	}

}
