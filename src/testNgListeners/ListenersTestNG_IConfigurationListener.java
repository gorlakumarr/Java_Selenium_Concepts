package testNgListeners;

import org.testng.IConfigurationListener;
import org.testng.ITestResult;

public class ListenersTestNG_IConfigurationListener implements IConfigurationListener {

	@Override
	public void onConfigurationSuccess(ITestResult tr) {
		System.out.println("on configuration success");
	}

	@Override
	public void onConfigurationFailure(ITestResult tr) {
		System.out.println("on configuration failure");
	}

	@Override
	public void onConfigurationSkip(ITestResult tr) {
		System.out.println("on configuration skip");
	}

	@Override
	public void beforeConfiguration(ITestResult tr) {
		System.out.println("called before the configuration method is invoked");
	}
}