package testNgListeners;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo_ISuiteListener_1 {

	@BeforeSuite
	public void bsuite() {
		System.out.println("BeforeSuite method started for the first IsuiteListener example class");
	}

	@Test
	public void test() {
		System.out.println("Test method started for the first IsuiteListener example class");
	}

	@AfterSuite
	public void asuite() {
		System.out.println("AfterSuite method started for the first IsuiteListener example class");
	}

}