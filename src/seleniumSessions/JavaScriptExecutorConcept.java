package seleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	private static WebDriver driver;

	public static void main(String[] args) throws IOException {
		/*
		 * Methods In JavascriptExecutor
		 * 
		 * 1.Resize Window :
		 * 
		 * exe.executeScript("window.resizeTo("1024","500");");
		 * 
		 * Dimension d=new Dimension(100,500); driver.manage.window.setSize(d);
		 * 
		 * driver.manage.window.maximize();
		 * 
		 * driver.manage.window.minimize();
		 * 
		 * ChromeOptions options = new ChromeOptions();
		 * options.addArguments("window-size=1200,1200");
		 * 
		 * WebDriver driver = new ChromeDriver(options);
		 * 
		 * 
		 * 2.scrollto offset
		 * 
		 * exe.executeScript("window.scrollBy(0,-250)","");
		 * exe.executeScript("scroll(0,-250)","");
		 * 
		 * 
		 * 3.scrollPageDown
		 * 
		 * exe.executeScript("window.scrollTo(0,documnet.body.scrollHeight)");
		 * 
		 * 
		 * 4.scrollIntoView
		 * 
		 * exe.executeScript("arguments[0].scrollIntoView(true);",element);
		 * 
		 * 
		 * 5.Refreshes the Browser
		 * 
		 * exe.executeScript("history.go(0)");
		 * 
		 * driver.navigate().refresh();
		 * 
		 * driver.get(driver.getCurrentUrl());
		 * 
		 * driver.navigate().to(driver.getCurrentUrl());
		 * 
		 * driver.findElement(By.id("")).sendKeys(Keys.F5);
		 * 
		 * 
		 * 6.Click the WebElement
		 * 
		 * exe.executeScript("arguments[0].click()",element);
		 * 
		 * 
		 * 7.Get The Title of the webpage
		 * 
		 * exe.executeScript("return document.title;").toString();
		 *
		 *
		 * 8.get InnerText
		 *
		 * exe.executeScript("return document.documentElement.innerText;").toString();
		 * 
		 */

		driver = new ChromeDriver(); // launch chrome

		driver.get(driver.getCurrentUrl());
		driver.manage().window().maximize(); // maximize window
		driver.manage().deleteAllCookies(); // delete all the cookies

		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://www.freecrm.com"); // enter URL

		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@1234");
		// driver.findElement(By.xpath("//input[contains(@type,'submit')]")).click();

		// executeScript -- to execute JavaScript code

		resizeWindow("1024", "100");

		WebElement loginBtn = driver.findElement(By.xpath("//input[contains(@type,'submit')]")); // login button

		flash(loginBtn, driver); // highlight the element

		drawBorder(loginBtn, driver); // draw a border
		// take screenshot:
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src,
				new File("/Users/naveenkhunteta/Documents/workspace/MorningSessions/src/SeleniumSessions/element.png"));

		// generate Alert
		generateAlert(driver, "There is an issue with Login button on Login Page");

		// click on any element by using JS executor
		clickElementByJS(loginBtn, driver);

		// refresh the page:
		// 1. by using selenium:
		driver.navigate().refresh();

		// 2. by using JS executor:
		refreshBrowserByJS(driver);

		// get the tile of the page by JS:
		System.out.println(getTitleByJS(driver));

		// get the page text:
		System.out.println(getPageInnerText(driver));

		// scroll page down:
		// scrollPageDown(driver);

		WebElement forgotPwdLink = driver.findElement(By.xpath("//a[contains(text(),'Forgot Password?')]"));
		scrollIntoView(forgotPwdLink, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 10; i++) {
			changeColor("rgb(0,200,0)", element, driver);// 1
			changeColor(bgcolor, element, driver);// 2
		}
	}

	public static void scrollBy(String x, String y) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		/*
		 * Method 1
		 */
		executor.executeScript("window.scrollby(" + x + "," + y + ");", "");
		/*
		 * Method 2
		 */
		// executor.executeScript("scroll(" + x + "," + y + ");","");
	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor = '" + color + "'", element);

		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static void drawBorder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("alert('" + message + "')");

	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor executor = ((JavascriptExecutor) driver);
		executor.executeScript("arguments[0].click()", element);

	}

	public static void refreshBrowserByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}

	public static void resizeWindow(String x, String y) {
		((JavascriptExecutor) driver).executeScript("window.resizeTo(" + x + ", " + y + ");");
	}

	public static String getTitleByJS(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	public static void scrollPageDown(WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

	public static void scrollIntoView(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
}