package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.switchTo().frame("0");

		/*
		 * Frame Locators:
		 * 
		 * 1.Id
		 * 
		 * 2.Name
		 * 
		 * 3.Index
		 * 
		 * 4.WebElement
		 */

		// Do Some Operations

		driver.switchTo().defaultContent();

		driver.close();
		driver.quit();

	}
}
