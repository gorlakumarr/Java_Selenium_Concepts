package selenium4;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZoomInOut {
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void f() throws InterruptedException {
		driver.get("https://naveenautomationlabs.com/opencart/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='10%'");

		Thread.sleep(Duration.ofSeconds(5));
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
