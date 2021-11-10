package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InvokeChromeWebDriverManager {

	public static void main(String[] args) {

		WebDriver driver = null;

//		WebDriver driver1 = new WebDriver();//Wrong Statement

//		WebDriver driver1 = new WebDriver(ChromeDriver()); //Wrong Statement

//		WebDriver driver = WebDriver(new ChromeDriver()); //Right Statement

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		System.out.println("In test 1");

		driver.get("http://google.com");
		String expectedPageTitle = "Google";

		Assert.assertTrue(driver.getTitle().contains(expectedPageTitle), "Test Failed");

		if (driver != null)
			driver.quit();
	}
}
