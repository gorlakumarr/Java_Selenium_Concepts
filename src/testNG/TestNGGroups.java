package testNG;

import org.testng.annotations.Test;

public class TestNGGroups {
	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {
		System.out.println("\"functest\", \"checkintest\"");
	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod2() {
		System.out.println("\"functest\", \"checkintest\"");
	}

	@Test(groups = { "functest" })
	public void testMethod3() {
		System.out.println("functest");
	}
}
