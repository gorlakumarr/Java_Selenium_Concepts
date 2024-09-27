package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectClass {
	private WebDriver driver;
	public WebElement element;
	public List<WebElement> elements;
	public String str;
	public String url = "https://trytestingthis.netlify.app/";

	@Test
	public void f() throws InterruptedException {
		driver.get(url);
		element = driver.findElement(By.id("owc"));

		Select select = new Select(element);

		System.out.println(select.isMultiple());

		select.selectByIndex(0);

		System.out.println(select.getAllSelectedOptions());

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
