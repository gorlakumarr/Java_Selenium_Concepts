package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://spicejet.com/");

		WebElement element = driver.findElement(By.xpath(""));

		Actions actions = new Actions(driver);

		actions.click();
		actions.clickAndHold();
		actions.contextClick();
		actions.doubleClick();
		actions.dragAndDrop(element, element).perform();
		int xOffset = 0;
		int yOffset = 0;
		actions.dragAndDropBy(element, xOffset, yOffset);
		actions.keyDown(Keys.DOWN);
		actions.keyUp(Keys.DOWN);
		actions.keyDown(Keys.DOWN);
		actions.keyDown(Keys.DOWN);
		actions.moveToElement(element);
		actions.pause(10);
		actions.release();
		actions.build().perform();
	}
}
