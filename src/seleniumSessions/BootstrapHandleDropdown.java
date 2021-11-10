package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapHandleDropdown {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get(
				"https://www.jqueryscript.net/demo/jQuery-Multiple-Select-Plugin-For-Bootstrap-Bootstrap-Multiselect/");
		// enter URL

		driver.findElement(By.xpath("//*[@id='example2']/../div/button")).click();

		List<WebElement> list = driver.findElements(
				By.xpath("//*[@id='example2']/../div/button[@type='button']/following-sibling::ul/li/a/label"));
		System.out.println("List Size :" + list.size());

		// for (int i = 0; i < list.size(); i++) {
		// System.out.println(list.get(i).getText());
		// if (!list.get(i).isSelected()) {
		// list.get(i).click();
		// }
		// }

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains(" Mushrooms")) {
				list.get(i).click();
				break;
			}
		}

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
