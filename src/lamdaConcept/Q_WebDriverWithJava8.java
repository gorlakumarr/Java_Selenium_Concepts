package lamdaConcept;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_WebDriverWithJava8 {
	private static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.amazon.in/");

		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());

		for (WebElement webElement : list) {
			System.out.println(webElement.getText());
		}

		// 1
		list.forEach(ele -> System.out.println(ele.getText()));

		// 2
		List<WebElement> l = list.stream().filter(ele -> !ele.getText().equals("")).collect(Collectors.toList());
		l.forEach(ele -> System.out.println(ele.getText()));

		// 3.
		String str = list.stream().filter(ele -> !ele.getText().equals("")).findFirst().get().getText();
		System.out.println(str);

		// 4
		String str1 = list.stream().filter(ele -> !ele.getText().equals("")).findAny().get().getText();
		System.out.println(str1);

		// 5.exclude blank texts and which starts with Amazon
		List<String> ll = list.stream().filter(ele -> !ele.getText().equals("") && ele.getText().contains("Amazon"))
				.map(ele -> ele.getText()).collect(Collectors.toList());

		ll.forEach(ele -> System.out.println(ele));

		// Another way

		List<String> ll1 = list.stream().filter(ele -> !ele.getText().equals(""))
				.filter(ele -> ele.getText().contains("Amazon")).map(ele -> ele.getText()).collect(Collectors.toList());

		ll1.forEach(ele -> System.out.println(ele));

		// 6. Remove Space Text and Empty Text
		List<String> l1 = list.stream().filter(ele -> !ele.getText().isEmpty()).filter(ele -> !ele.getText().equals(""))
				.map(ele -> ele.getText().trim()).collect(Collectors.toList());
		l1.forEach(ele -> System.out.println(ele));

		driver.close();
		driver.quit();
	}
}
