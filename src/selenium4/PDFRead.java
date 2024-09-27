package selenium4;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.Duration;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PDFRead {
	private static WebDriver driver;
	private String url = "https://www.adobe.com/support/products/enterprise/knowledgecenter/media/c4611_sample_explain.pdf";

	@BeforeTest
	public void setUp() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless=new");
		driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(url);
	}

	@Test
	public void readPDF() throws IOException {
		URL pdfURL = new URL(url);
		InputStream ip = pdfURL.openStream();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(ip);
		PDDocument pdfDocument = Loader.loadPDF(bufferedInputStream.readAllBytes());

		// Page Count
		System.out.println("Number of Pages = " + pdfDocument.getNumberOfPages());
		Assert.assertEquals(pdfDocument.getNumberOfPages(), 4);

		// PDF Content
		PDFTextStripper pdfTextStripper = new PDFTextStripper();
		pdfTextStripper.getText(pdfDocument);
		System.out.println("PDF Content " + pdfTextStripper.getText(pdfDocument));

		// Set The Page And get the text
		pdfTextStripper.setStartPage(3);
		pdfTextStripper.setStartPage(4);
		System.out.println("PDF Content 3 rd page" + pdfTextStripper.getText(pdfDocument));

	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
