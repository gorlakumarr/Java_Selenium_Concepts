package testNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListenerClass implements IRetryAnalyzer {
	private int retrycount = 0;
	private int maxRetryCount = 2;

	@Override
	public boolean retry(ITestResult result) {

		if (retrycount < maxRetryCount) {
			int status = result.getStatus();
			System.out.println("Retrying test" + result.getName() + " with status +" + status);
			retrycount++;
			return true;
		}
		return false;
	}

}
