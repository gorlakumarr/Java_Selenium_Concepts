/**
 * 
 */
/**
 * @author e104399
 *
 */
package testNgListeners;

import org.junit.Assert;

public class Demo_RetryAnalyzer {

	@Test(retryAnalyzer = testNgListeners.ListenersTestNG_IRetryAnalyzer.class)
	public void TestOne() {
		Assert.assertTrue(false);
	}

	@Test
	public void TestTwo() {
		Assert.assertTrue(true);
	}
}