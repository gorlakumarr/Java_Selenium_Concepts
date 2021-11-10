/**
 * 
 */
/**
 * @author e104399
 *
 */
package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandle {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		// https://demoqa.com/alerts
		driver.findElement(By.name("proceed")).click();

		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		System.out.println("alertText is " + alertText.trim());

		if (alertText.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Valid Alert Message");
		} else {
			System.out.println("In Valid Alert Message");
		}
		alert.accept();
		/*
		 * Alert Methods:
		 * 
		 * 1.alert.accept();
		 * 
		 * 2.alert.dismiss();
		 * 
		 * 3.alert.sendKeys("Enter Text");
		 * 
		 * 4. alert.getText();
		 * 
		 *
		 */
		driver.close();
		driver.quit();
	}
}