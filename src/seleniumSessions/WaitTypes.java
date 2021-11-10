package seleniumSessions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class WaitTypes {

	protected WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test
	public void ImplicitWait() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", ".\\Selenium And Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//
//		// Implicitly Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().deleteAllCookies();
//
//		driver.get("http://demo.guru99.com/test/guru99home/");
//
//		// Explicitly Wait
//		WebDriverWait wait = new WebDriverWait(driver, 20);
//		WebElement ele = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
//		ele.sendKeys(Keys.ENTER);
//		ele.sendKeys(Keys.SPACE);
//		ele.clear();
//		ele.click();
//
//		// Fluent Wait
//		FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver);
//		wait1.withTimeout(50, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS)
//				.ignoring(NoSuchElementException.class);
//
//		wait.until(new Function<WebDriver, WebElement>() {
//
//			@Override
//			public WebElement apply(WebDriver t) {
//				WebElement el = driver.findElement(By.xpath(""));
//				return el;
//			}
//		});
//
//		driver.close();
//		driver.quit();

	}
}