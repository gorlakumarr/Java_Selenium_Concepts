package testNgListeners;

import java.util.ArrayList;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

public class ListenersTestNG_IMethodInterceptor implements IMethodInterceptor {

	@Override
	public List<IMethodInstance> intercept(List<IMethodInstance> methodsInstance, ITestContext testContext) {
		List<IMethodInstance> result = new ArrayList<IMethodInstance>();
		for (IMethodInstance method : methodsInstance) {
			Test testMethod = method.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Test.class);
			if (testMethod.priority() == 1) {
				result.add(method);
			}
		}
		return result;
	}
}