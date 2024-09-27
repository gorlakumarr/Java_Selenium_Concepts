package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class ElementLocators {
	private WebDriver driver;
	public List<WebElement> elements;
	public WebElement element;
	public String str;

	@Test
	public void relativeLocators() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		element = driver.findElement(By.name("username"));

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));

		Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);

		wait2.until(ExpectedConditions.visibilityOf(element));

		element.sendKeys("username");

		str = driver.findElement(RelativeLocator.with(By.tagName("button")).below(element)).getText().toString();
		System.out.println("text --> " + str);

		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("@Test");
	}

	@Ignore
	@Test
	public void f1() throws InterruptedException {
		driver.get("https://trytestingthis.netlify.app/");
		elements = driver.findElements(By.xpath("//input[@type='radio']/following-sibling::label"));

		for (WebElement webElement : elements) {
			System.out.println(webElement.getText().toString());
		}

		System.out.println("Tag ==> " + driver.findElements(By.tagName("p")).get(0).getText().trim());
		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("@Test");
	}

	@Ignore
	@Test
	public void f() throws InterruptedException {
		driver.get("https://www.google.com");
		element = driver.findElement(By.name("q"));
		element.sendKeys("GK", Keys.ENTER);

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
