package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/alerts";
		driver.get(url);
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement mouseHover = driver.findElement(By.xpath("//*[@id=\"nav\"]/li2[]/a"));
		action.moveToElement(mouseHover).perform();
		
		
		
	}

}
