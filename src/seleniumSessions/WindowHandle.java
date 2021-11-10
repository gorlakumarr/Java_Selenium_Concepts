package seleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WindowHandle {
	private static WebDriver driver;
	private static boolean condition;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		System.out.println("Session Id" + ((RemoteWebDriver) driver).getSessionId());

		driver.get("https://demoqa.com/browser-windows");

		String parentWindow = driver.getWindowHandle();
		System.out.println("parentWindow :" + parentWindow);

		driver.findElement(By.id("messageWindowButton")).click();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> iterator = s.iterator();

		while (iterator.hasNext()) {
			String child_window = iterator.next();
			System.err.println("windows :" + iterator.next());
			if (!parentWindow.equals(child_window)) {
				driver.switchTo().window(child_window);

				if (driver.findElement(By.tagName("body")).getText().contains("Knowledge")) {
					System.out.println("Child is ON");
					condition = true;
					Assert.assertTrue(condition);
					driver.close();
				} else {
					Assert.assertTrue(condition);
				}
			}
		}
		driver.switchTo().window(parentWindow);

		if (driver.getTitle().equals("ToolsQA")) {
			System.out.println("Parent Window Active");
		}
		driver.close();
		driver.quit();
	}

}
