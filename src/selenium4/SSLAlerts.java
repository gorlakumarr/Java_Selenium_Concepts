package selenium4;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLAlerts {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().deleteAllCookies();
		driver.get("https://expired.badssl.com/");

		System.out.println("Title --> " + driver.getTitle());

		Thread.sleep(Duration.ofSeconds(2));
		driver.quit();
	}
}
