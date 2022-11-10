package parallelTesting;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserStackBaseTest {

	WebDriver driver;
	public static final String USERNAME = "kumargorla_bWciVJ";
	public static final String AUTOMATE_KEY = "agmFstpXY5n4Cx8YZ2Dk";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	@Parameters({ "browser", "browser_version", "os", "os_version" })
	@BeforeMethod
	public void setUp(String browserName, String browser_version, String os, String os_version, Method name) {

		System.out.println("browser name is : " + browserName);
		String methodName = name.getName();

		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability("os", os);
		caps.setCapability("os_version", os_version);
		caps.setCapability("browser_version", browser_version);
		caps.setCapability("name", methodName);

		if (browserName.equals("Chrome")) {
			WebDriverManager.chromedriver().setup();
			caps.setCapability("browser", "Chrome");
		} else if (browserName.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			caps.setCapability("browser", "Firefox");
		}
		try {
			driver = new RemoteWebDriver(new java.net.URL(URL), caps);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		driver.quit();
	}
}
