package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("http://www.google.com");

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Java");

		Thread.sleep(3000);
		List<WebElement> list = driver
				.findElements(By.xpath("//input[@title='Search']/following::div[@class='sbl1']/span"));

		System.out.println("total number of suggestions in search box:::===>" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("java")) {
				list.get(i).click();
				break;
			}
		}

		driver.close();
		driver.quit();
	}
}