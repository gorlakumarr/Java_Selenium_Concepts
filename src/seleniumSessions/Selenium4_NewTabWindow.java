package seleniumSessions;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_NewTabWindow {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://spicejet.com/");
		System.out.println(driver.getTitle());

		ArrayList<String> windows = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(0));

		driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW);

		driver.close();

		driver.quit();
	}
}
