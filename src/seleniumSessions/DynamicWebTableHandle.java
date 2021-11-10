package seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableHandle {
	private static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();

		WebElement tBody = driver.findElement(By.xpath("//table[@class='dataTable']/tbody"));

		List<WebElement> rows = tBody.findElements(By.tagName("tr"));

		System.out.println("Rows Size :" + rows.size());

		for (int row = 1; row < rows.size(); row++) {
			List<WebElement> columns = rows.get(row).findElements(By.tagName("td"));
			for (int column = 0; column < columns.size(); column++) {
				/*
				 * System.out.println("Cell Values of Row Number is " + row +
				 * " and column number is " + column + " is " + columns.get(column).getText());
				 */

				if (columns.get(column).getTagName().equals("a")
						|| columns.get(column).getText().contains("Gopala Polyplast")) {
					columns.get(column).click();
					if (driver.getTitle().contains("GOPALA POLYPLAST")) {
						System.out.print("Link Opned Successfully");

					} else {
						System.out.print("Link Opned Not Successfully");
					}

				}
			}
		}

		driver.close();
		driver.quit();

	}

}
