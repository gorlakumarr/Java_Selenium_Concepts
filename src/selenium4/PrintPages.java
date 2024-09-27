package selenium4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.print.PrintOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrintPages {
	private WebDriver driver;
	public WebElement element;
	public List<WebElement> elements;
	public String str;
	public String url = "https://www.selenium.dev";

	@Test
	public void f() throws InterruptedException {
		driver.get(url);

		PrintsPage printer = (PrintsPage) driver;

		PrintOptions printOptions = new PrintOptions();
		printOptions.setPageRanges("1-2");

		Pdf pdf = printer.print(printOptions);
		String content = pdf.getContent();
		System.out.println("Content -->" + content);

		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("@Test");
	}

	@BeforeMethod
	public void beforeMethod() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(2));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		System.out.println("@BeforeMethod");

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("@AfterMethod");
		driver.quit();
	}
}
