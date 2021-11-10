package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']"))
				.sendKeys("C:\\GK_Work\\codebase\\Selenium Tutorial\\Screenshot.png");
		Thread.sleep(2000);

		driver.close();
		driver.quit();
	}
}