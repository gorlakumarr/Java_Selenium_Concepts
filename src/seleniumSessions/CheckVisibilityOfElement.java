package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckVisibilityOfElement {
	/**
	 * 
	 * Learn difference between: isDisplayed() v/s isEnabled() v/s isSelected()
	 * 
	 * Notes:
	 * 
	 * isDisplayed() is the method used to verify presence of a web element within
	 * the web page. The method returns a “true” value if the specified web element
	 * is present on the web page and a “false” value if the web element is not
	 * present on the web page.
	 * 
	 * isDisplayed() is capable to check for the presence of all kinds of web
	 * elements available.
	 * 
	 * isEnabled() is the method used to verify if the web element is enabled or
	 * disabled within the webpage. • isEnabled() is primarily used with buttons.
	 * 
	 * isSelected() is the method used to verify if the web element is selected or
	 * not. isSelected() method is pre-dominantly used with radio buttons, dropdowns
	 * and checkboxes.
	 * 
	 */

	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); // Launch the URL

		driver.manage().window().maximize();// Maximize the Window
		driver.manage().deleteAllCookies(); // Delete All Cookies

		WebElement element = driver.findElement(By.name("proceed"));

		// IsDisplayed()
		System.out.println(element.isDisplayed());

		// IsEnabled()
		System.out.println(element.isEnabled());

		// IsSelected()
		System.out.println(driver.findElement(By.id("remember")).isSelected());

		/*
		 * Closing Driver Seesion Which were opened as a part of this execution
		 * 
		 */
		driver.close();
		driver.quit();
	}
}