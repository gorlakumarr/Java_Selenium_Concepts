package selenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class NewSelenium4Test {
	private WebDriver driver;

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		System.out.println("@BeforeMethod");
	}

	@Test
	public void jsScript() {
		driver.get("https://www.google.com");
		WebElement buttonElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]"));

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		String str = (String) javascriptExecutor.executeScript("return arguments[0].innnerText;", buttonElement);
		System.out.println("text :" + str);

		javascriptExecutor.executeScript("console.log('Hello, GK')");
		javascriptExecutor.executeScript("arguments[0].click();", buttonElement);
	}

	@Ignore
	@Test(description = "Frames Checking Test")
	public void testNGTest1() {
		driver.get("https://demoqa.com/frames");
		driver.switchTo().frame("frame1");
		Assert.assertEquals(driver.findElement(By.id("sampleHeading")).getText().toString(), "This is a sample page");
		driver.switchTo().defaultContent();

	}

	@Ignore
	@Test(description = "First Selenium 4 Test")
	public void testNGTest2() {
		driver.get("https://www.selenium.dev/");
		String parentWindow = driver.getWindowHandle();

		driver.navigate().to("https://www.google.com");

		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		driver.navigate().refresh();

		// Switch to Windows
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().newWindow(WindowType.TAB);

		// Switch to Frames
		driver.switchTo().frame(1);
		System.out.println("@Test");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("@AfterMethod");
		driver.quit();
	}
}
