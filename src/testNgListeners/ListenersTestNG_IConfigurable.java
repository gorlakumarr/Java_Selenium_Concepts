package testNgListeners;

import org.testng.IConfigurable;
import org.testng.IConfigureCallBack;
import org.testng.ITestResult;

public class ListenersTestNG_IConfigurable implements IConfigurable {

	@Override
	public void run(IConfigureCallBack cb, ITestResult itr) {
		System.out.println("Execute this before any configuration steps gets executed");
		cb.runConfigurationMethod(itr);
	}
}