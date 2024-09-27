package selenium4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeElementScreenShot {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");

		WebElement htmlTable = driver.findElement(By.id("customers"));

		WebElement pagetop = driver.findElement(By.id("pagetop"));
		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pagetop")));
		WebElement loginSection = driver.findElement(By.id("pagetop"));

		// Take Page/Full-Page Screenshot
		takePageScreenshot();
//		takeFullPageScreenshot();

		// Take Section Screenshot
		takeElementScreenShot(loginSection, "loginSection");

		// Take Element Screenshot & Section & Form & WebTable
		takeElementScreenShot(pagetop, "pagetop");
		takeElementScreenShotAlt(pagetop, "pagetop");
		takeElementScreenShot(htmlTable, "htmlTable");

		// Close Browser
		closeBrowser();
	}

	public static void takeElementScreenShot(WebElement webElement, String fileName) {
		File src = webElement.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/target/screenshots/" + fileName + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeElementScreenShotAlt(WebElement webElement, String fileName) {
		File src = ((TakesScreenshot) webElement).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/target/screenshots/" + fileName + "_1.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takeFullPageScreenshot() {
		File src = ((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/target/screenshots/FullPage.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void takePageScreenshot() {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir") + "/target/screenshots/Page.png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void closeBrowser() {
		driver.close();
		driver.quit();
	}

}
