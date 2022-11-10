package seleniumSessions;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4_GetRect {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver(); // launch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("http://spicejet.com/");

		WebElement element = driver.findElement(By.xpath(""));

		// Selenium 3
		Dimension dimension = element.getSize();
		System.out.println(dimension.getHeight());
		System.out.println(dimension.getWidth());

		// Another way
		Point p = element.getLocation();
		System.out.println(p.x);
		System.out.println(p.y);

		// Selenium 4
		Rectangle rectangle = element.getRect();
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getWidth());
	}
}
