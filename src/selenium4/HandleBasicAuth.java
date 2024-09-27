package selenium4;

import java.net.URI;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.apache.commons.codec.binary.Base64;
import org.openqa.selenium.By;
import org.openqa.selenium.Credentials;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v85.network.Network;
import org.openqa.selenium.devtools.v85.network.model.Headers;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HandleBasicAuth {

	private static WebDriver driver;
	private String url = "https://the-internet.herokuapp.com/basic_auth";

	@BeforeTest
	public void setUp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("@BeforeTest");
	}

	@Test
	public void basicAuth() throws InterruptedException {
		String username = "admin";
		String password = "admin";

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.of(100000), Optional.of(100000), Optional.of(100000)));

		Map<String, Object> headers = new HashMap<String, Object>();
		String basiAuth = "Basic "
				+ new String(new Base64().encode(String.format("%s:%s", username, password).getBytes()));
		headers.put("Authorization", basiAuth);

		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));

		driver.get(url);

		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']//h3")).getText().trim(), "Basic Auth");

		Thread.sleep(Duration.ofSeconds(5));
		System.out.println("@basicAuth");
	}

	@Test
	public void basicAuth1() throws InterruptedException {
		Predicate<URI> uriPredicate = uri -> uri.toString().contains("herokuapp.com");
		Supplier<Credentials> authentication = UsernameAndPassword.of("admin", "admin");
		((HasAuthentication) driver).register(uriPredicate, authentication);

		driver.get(url);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='content']//h3")).getText().trim(), "Basic Auth");

		Thread.sleep(Duration.ofSeconds(5));

		System.out.println("@basicAuth1");
	}

	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("@AfterTest");
	}
}
