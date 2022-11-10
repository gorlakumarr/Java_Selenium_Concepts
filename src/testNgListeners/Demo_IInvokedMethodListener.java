package testNgListeners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Demo_IInvokedMethodListener {

	@BeforeSuite
	public void method1() {
		System.out.println("before suite");
	}

	@BeforeMethod
	public void method2() {
		System.out.println("before method");
	}

	@Test
	public void method3() {
		System.out.println("test method 1 ");
	}

	@Test
	public void method4() {
		System.out.println("test method 2 ");
	}

	@AfterMethod
	public void method5() {
		System.out.println("after method");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("after suite");
	}
}