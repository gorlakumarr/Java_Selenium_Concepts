package seleniumSessions;

import java.util.Base64;
import java.util.HashMap;
import java.util.Optional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v88.network.Network;
import org.openqa.selenium.devtools.v88.network.model.Headers;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicAuthHandle {
	private static final String username = "admin";
	private static final String password = "admin";

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));

		HashMap<String, Object> headers = new HashMap<>();
		String basicAuth = "Basic "
				+ new String(new Base64().encode(String.format("%s:%s", username, password).getBytes()));
		headers.put("Authorization", basicAuth);
		devTools.send(Network.setExtraHTTPHeaders(new Headers(headers)));
		driver.get("Respective URL");
		driver.close();
		driver.quit();
	}
}
