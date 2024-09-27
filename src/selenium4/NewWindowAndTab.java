package selenium4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowAndTab {

	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.body.style.zoom='100%'");

		driver.manage().window().maximize();
		driver.get("https://google.com");

		System.out.println("Title of the page is " + driver.getTitle());

		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://www.facebook.com/");
		System.out.println("Title of the page is " + driver.getTitle());

		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://x.com/");
		System.out.println("Title of the page is " + driver.getTitle());

		Set<String> windows = driver.getWindowHandles();
		List<String> ls = new ArrayList<String>(windows);

		Object[] obj = driver.getWindowHandles().toArray();
		driver.switchTo().window((String) obj[1]);

		System.out.println("Parent Window Id " + ls.get(0));
		System.out.println("Child 1 Window Id " + ls.get(1));
		System.out.println("Child 2 Window Id " + ls.get(2));

		try {
			Thread.sleep(Duration.ofSeconds(2));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();
		driver.switchTo().window(ls.get(1));
		System.out.println("Title of the page is " + driver.getTitle());

		driver.close();
		driver.switchTo().window(ls.get(0));
		System.out.println("Title of the page is " + driver.getTitle());

		driver.close();
//		driver.quit();
	}
}
