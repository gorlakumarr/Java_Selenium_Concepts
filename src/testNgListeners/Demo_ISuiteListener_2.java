package testNgListeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Demo_ISuiteListener_2 {

	@BeforeSuite
	public void bsuite() {
		System.out.println("BeforeSuite method started for the first IsuiteListener example 2 class");
	}

	@Test
	public void test() {
		System.out.println("Test method started for the first IsuiteListener example 2 class");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("AfterSuite method started for the first IsuiteListener example 2 class");
	}

}