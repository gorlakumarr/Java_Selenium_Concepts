package seleniumSessions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium4_TakeScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.toolsqa.com/selenium-webdriver/webdrivermanager/");
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"post-41679\"]/div[1]/div/div[2]/div"));
		File srcFile = ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("./target/screenshots/element.png"));
		driver.close();
		driver.quit();
	}
}
