package lamdaConcept;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class R_LinksWithJava8 {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.freshworks.com/");

		List<WebElement> footerList = driver.findElements(By.xpath("//div[@class='footer-main']/following::a"));
		System.out.println(footerList.size());

		footerList.stream().filter(ele -> !ele.getText().isBlank()).forEach(ele -> System.out.println(ele.getText()));

		List<String> newFooterList = new ArrayList<String>();
		footerList.stream().filter(ele -> !ele.getText().isEmpty()).forEach(ele -> newFooterList.add(ele.getText()));
		newFooterList.forEach(System.out::println);

		driver.close();
		driver.quit();
	}

}
