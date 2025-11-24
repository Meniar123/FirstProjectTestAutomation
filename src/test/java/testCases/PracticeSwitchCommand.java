package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeSwitchCommand {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
		
		String url = "https://demo.guru99.com/test/guru99home/";
		driver.get(url);	
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		driver.switchTo().frame("a077aa5e");
		WebElement iFramebtn = driver.findElement(By.xpath("html/body/a/img"));
		System.out.println("we are switch to the Iframe");
		
		iFramebtn.click();
		System.out.println("we are done");
		
		driver.close();
	}

}


