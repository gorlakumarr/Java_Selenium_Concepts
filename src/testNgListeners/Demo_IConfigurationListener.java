package testNgListeners;

import java.util.Arrays;

import org.testng.TestNG;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;

@Listeners(value = ListenersTestNG_IConfigurationListener.class)
public class Demo_IConfigurationListener {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite");
	}

	@Test
	public void t() {
		System.out.println("test method t");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}

	public static void main(String[] args) {
		TestNG testNG = new TestNG();
		testNG.setTestSuites(Arrays.asList("test/com/javacodegeeks/testng/configurationListenerTestng.xml"));
		testNG.run();
	}
}