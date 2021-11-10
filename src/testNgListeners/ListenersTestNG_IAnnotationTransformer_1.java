package testNgListeners;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class ListenersTestNG_IAnnotationTransformer_1 implements IAnnotationTransformer {

	int counter = 3;

	@Override
	public void transform(ITestAnnotation testAnnotation, Class testClass, Constructor testConstrutor,
			Method testMethod) {

		if (testMethod.getName().equals("ChangeInvocationCountOfMethod")) {
			System.out.println("Changing invocation for the following method: " + testMethod.getName());
			testAnnotation.setInvocationCount(counter);
		}
	}
}