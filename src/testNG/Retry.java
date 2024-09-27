package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry {
	@Test(retryAnalyzer = RetryListenerClass.class)
	public void testing() {
		Assert.fail();
	}

}
