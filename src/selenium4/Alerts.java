package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Alerts {
	private WebDriver driver;
	public WebElement element;
	public List<WebElement> elements;
	public String str;
	public String url = "https://the-internet.herokuapp.com/javascript_alerts";

	@Test
	public void f() throws InterruptedException {
		driver.get(url);
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		// JS Alert
		Alert alert = driver.switchTo().alert();
		Assert.assertEquals(alert.getText(), "I am a JS Alert");
		alert.accept();

		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

		// JS Alert Confirm
		Alert alert1 = driver.switchTo().alert();
		Assert.assertEquals(alert1.getText(), "I am a JS Confirm");
		alert1.accept();

		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

		// JS Alert Promt
		@SuppressWarnings("unused")
		Alert alert2 = driver.switchTo().alert();
		Assert.assertEquals(alert1.getText(), "I am a JS prompt");
		alert1.sendKeys("gk");
		alert1.accept();
		Assert.assertEquals(driver.findElement(By.id("result")).getText(), "You entered: gk");

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
