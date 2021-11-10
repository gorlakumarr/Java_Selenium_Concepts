package testNGSessions;

import org.testng.annotations.Test;

public class GroupsDemo_2 {

	@Test(groups = { "windows.checkintest" })
	public void testWindowsOnly() {
	}

	@Test(groups = { "linux.checkintest" })
	public void testLinuxOnly() {
	}

	@Test(groups = { "windows.functest" })
	public void testWindowsToo() {

	}
}
