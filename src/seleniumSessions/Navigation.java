package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("http://www.google.com");

		driver.navigate().to("");

		// Refreshes The Browser
		driver.navigate().refresh();
		driver.navigate().to(driver.getCurrentUrl());
		driver.get(driver.getCurrentUrl());
		driver.findElement(By.xpath("")).sendKeys(Keys.F5);

		driver.close();
		driver.quit();
	}
}