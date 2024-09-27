package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGTemplate {
	private WebDriver driver;
	public WebElement element;
	public List<WebElement> elements;
	public String str;
	public String url;

	@Test
	public void f() throws InterruptedException {
		driver.get(url);

		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("@Test");
	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		System.out.println("@BeforeMethod");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("@AfterMethod");
		driver.quit();
	}

}
