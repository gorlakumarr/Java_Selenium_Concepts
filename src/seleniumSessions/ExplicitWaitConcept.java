package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitConcept {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		waitMethod(10, "login");

		WebElement ele = driver.findElement(By.xpath("//div[contains(text(),'email address')]"));
		if (ele.getText().contains("email address")) {
			System.out.println("Click Happned");
		}

		driver.close();
		driver.quit();
	}

	public static void waitMethod(int timeout, String locator) {
//		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class)
//				.until(ExpectedConditions.elementToBeClickable(By.name(locator))).click();

	}
}