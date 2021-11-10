package parallelTesting;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SauceLabsBaseTest extends BaseTest {
	private static String alertText;

	public void setUpLogin() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert = driver.switchTo().alert();
		alertText = alert.getText();
		System.out.println("alertText is " + alertText.trim());
	}

	@Test
	public void checkMessage() {
		setUpLogin();
		if (alertText.equalsIgnoreCase("Please enter a valid user name")) {
			System.out.println("Valid Alert Message");
		} else {
			System.out.println("In Valid Alert Message");
		}
	}
}
