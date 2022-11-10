package testNGSessions;

public class GroupsDemo_1 {

	@Test(groups = { "functest", "checkintest" })
	public void testMethod1() {

	}

	@Test(groups = { "functest", "checkintest" })
	public void testMethod2() {

	}

	@Test(groups = { "functest" })
	public void testMethod3() {

	}
}
