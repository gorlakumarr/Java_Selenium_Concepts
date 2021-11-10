package seleniumSessions;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Soft_Hard {

	@Test
	public void hardAssert() {
		assertTrue(true);
		assertTrue(false);
		assertTrue(true);
	}

	@Test
	public void softAssert() {
		SoftAssert a = new SoftAssert();
		a.assertTrue(true);
		a.assertTrue(false);
		a.assertTrue(true);
		a.assertAll();
	}
}
