package testNG;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertions {
	@Test(expectedExceptions = NoSuchElementException.class)
	public void f() {
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(1, 2);
		softAssert.assertEquals(1, 1);
		throw new NoSuchElementException("");
//		softAssert.assertAll();

	}
}
