package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropConcept {

	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		/*
		 * build() method in Actions class is used to create the chain of action or
		 * operations to be performed.
		 * 	
		 * perform() method in Actions Class is used to execute the chain of action
		 * created using build() method
		 */

		driver = new ChromeDriver(); // launch chrome

		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		driver.get("https://jqueryui.com/droppable/");

		Actions actions = new Actions(driver);

		actions.clickAndHold(driver.findElement(By.xpath("//*[@id='draggable']")))
				.moveToElement(driver.findElement(By.xpath("//*[@id='droppable']"))).release().build().perform();

		// actions.dragAndDrop(source, destination).perform();

		driver.close();
		driver.quit();
	}

}
