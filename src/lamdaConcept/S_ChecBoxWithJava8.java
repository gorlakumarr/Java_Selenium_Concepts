package lamdaConcept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S_ChecBoxWithJava8 {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");

		List<WebElement> list = driver.findElements(By.xpath("//td[@class=' select-checkbox']"));
		System.out.println(list.size());

		list.stream().forEach(ele -> ele.click());

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
