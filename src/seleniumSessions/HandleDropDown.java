package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://demoqa.com/select-menu");

		Select select = new Select(driver.findElement(By.xpath("//*[@id='oldSelectMenu']")));

		/*
		 * select.selectByIndex(0);
		 * 
		 * select.selectByValue("Value");
		 * 
		 * select.selectByVisibleText("Visbile Text");
		 * 
		 * select.deselectByIndex(0);
		 * 
		 * select.deselectByValue("Value");
		 * 
		 * select.deselectByVisibleText("Visbile Text");
		 * 
		 * select.deselectAll();
		 * 
		 */

		List<WebElement> list = select.getOptions();

		for (int i = 0; i < list.size(); i++) {
			System.err.println(list.get(i).getText());
		}
		System.out.println("getOptions" + select.getAllSelectedOptions());
		List<WebElement> list1 = select.getAllSelectedOptions();

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i).getText());
		}

		driver.close();
		driver.quit();

	}
}
