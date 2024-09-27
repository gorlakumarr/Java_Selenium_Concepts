package selenium4;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeoLocation {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Map<String, Object> coordinates = new HashMap<String, Object>();

		coordinates.put("latitute", 40.730610);
		coordinates.put("longitude", -73.935242);

		((ChromeDriver) driver).executeCdpCommand("Emulation.setGeolocationOverride", coordinates);

		driver.get("https://oldnavy.gap.com/stores");

		Thread.sleep(Duration.ofSeconds(5));
		driver.quit();
	}
}
