package parallelTesting;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {
	public static void main(String[] args) throws MalformedURLException {

		// 1. Define Des Cap
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);

		// 2.Chrome Options Definitions
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.merge(capabilities);

		String hubURL = "http://192.160.0.102:4444/wd/hub";

		WebDriver driver = new RemoteWebDriver(new URL(hubURL), chromeOptions);
		driver.get("https://www.google.co.in");
		System.out.println(driver.getTitle());
	}
}
