package testNgListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ListenersTestNG_IRetryAnalyzer implements IRetryAnalyzer {
	private int count = 0;
	private int maxLimit = 3;

	@Override
	public boolean retry(ITestResult iTestResult) {
		if (!iTestResult.isSuccess()) {
			if (count < maxLimit) {
				count++;
				iTestResult.setStatus(ITestResult.FAILURE);
				return true;
			} else {
				iTestResult.setStatus(ITestResult.FAILURE);
			}
		} else {
			iTestResult.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}
}
