package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileAploadDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		String url = "https://demo.guru99.com/test/upload/";
		driver.get(url);
		driver.manage().window().maximize();
		
	    WebElement btnUpload = driver.findElement(By.id("uploadfile_0"));
	    btnUpload.sendKeys("C:\\Users\\mlamine\\Desktop\\FormationSelenium\\Selenium_Level_1\\image.png");
	    driver.quit();

	}

}
