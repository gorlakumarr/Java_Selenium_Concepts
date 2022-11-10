package testNgListeners;

import org.testng.annotations.BeforeSuite;

public class Demo_IConfigurable {

	@BeforeSuite
	public void bf() {
		System.out.println("Before suite step");
	}

	@Test
	public void t() {
		System.out.println("Before @Test step");
	}
}