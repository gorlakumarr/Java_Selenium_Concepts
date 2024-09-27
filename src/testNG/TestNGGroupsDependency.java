package testNG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGGroupsDependency {
	@Test(groups = { "smoke" })
	public void testMethod1() {
		System.out.println("smoke");
		assertTrue(true);
	}

	@Test(groups = { "sanity" })
	public void testMethod2() {
		System.out.println("sanity");
		assertTrue(false);
	}

	@Test(groups = { "regression" }, dependsOnMethods = { "testMethod2" })
	public void testMethod3() {
		System.out.println("regression");
	}

	@Test(groups = { "systemtest" }, dependsOnGroups = { "smoke" }, alwaysRun = true)
	public void testMethod4() {
		System.out.println("systemtest");
	}
}
