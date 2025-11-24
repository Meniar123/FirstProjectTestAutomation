package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(url);
		driver.manage().window().maximize();
		
		String titlePage = driver.getTitle();
		int titleLength = titlePage.length();
		System.out.println("Title of the page is: "  +titlePage);
		System.out.println("Title length is : " +titleLength);
		
		String actualUrl = driver.getCurrentUrl();
		if (actualUrl.equals(url)) {
			System.out.println(" Verification Successuful the correct URL is opened ");

		} else {
			System.out.println("verification failed an incorrect URL is opened");
		}

		System.out.println("Actual URL is : " + actualUrl);
		System.out.println("Expected URL is : " + url);

		String sourcePage = driver.getPageSource();
		int lengthsourcePage = sourcePage.length();
		System.out.println("length of the source page is : " + lengthsourcePage);

		driver.quit();
	}

}
