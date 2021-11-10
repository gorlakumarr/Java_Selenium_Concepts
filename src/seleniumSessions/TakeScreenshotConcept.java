package seleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotConcept {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("http://www.google.com");
//		File file = ((TakesScreenshot) WebElement instance).getScreenshotAs(OutputType.FILE);
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("C:\\GK_Work\\codebase\\Selenium Tutorial\\Google.png"));
	}
}
