package selenium4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangleMethod {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='100%'");

		driver.manage().window().minimize();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.get("https://app.hubspot.com/login");

		WebElement loginBtn = driver.findElement(By.id("loginBtn"));

		// Selenium 3
		Dimension loginBtnSize = loginBtn.getSize();
		System.out.println("Height  = " + loginBtnSize.getHeight());
		System.out.println("Width  = " + loginBtnSize.getWidth());

		Point p = loginBtn.getLocation();
		System.out.println("X Coordinates = " + p.getX());
		System.out.println("X Coordinates = " + p.getY());

		// Selenium 4
		Rectangle loginBtnSiz = loginBtn.getRect();
		System.out.println("Height  = " + loginBtnSiz.getHeight());
		System.out.println("Width  = " + loginBtnSiz.getWidth());

		System.out.println("X Coordinates = " + loginBtnSiz.getX());
		System.out.println("X Coordinates = " + loginBtnSiz.getY());

		driver.manage().window().setSize(new Dimension(100, 200));

		// Quit Browser
		driver.quit();
	}
}
