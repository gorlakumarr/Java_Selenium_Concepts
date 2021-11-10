package seleniumSessions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		List<WebElement> list = driver.findElements(By.tagName("a"));

		int size = list.size();
		for (int i = 0; i < size; i++) {
			String linkText = list.get(i).getText();
			System.out.println(linkText);
		}

		Iterator<WebElement> iterator = list.iterator();
		while (iterator.hasNext()) {
			WebElement webElement = (WebElement) iterator.next();
			System.err.println(webElement.getText());

		}

		driver.close();
		driver.quit();
	}
}
