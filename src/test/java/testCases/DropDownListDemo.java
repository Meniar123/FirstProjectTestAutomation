package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownListDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		String url = "https://demoqa.com/select-menu";
		driver.get(url);
		driver.manage().window().maximize();
		
		WebElement dropDownList = driver.findElement(By.id("oldSelectMenu"));
		Select selectMenu = new Select(dropDownList);
		
		//Select the option By index
		//selectMenu.selectByIndex(5);
		
		//Select option By value
		//selectMenu.selectByValue("3");
		
		//Select option By text
		selectMenu.selectByVisibleText("Blue");
		
		
	}

}
