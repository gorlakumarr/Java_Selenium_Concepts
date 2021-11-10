package testNgListeners;

import org.testng.annotations.Test;

public class Demo_IAnnotationTransformer {

	ListenersTestNG_IAnnotationTransformer_1 obj = new ListenersTestNG_IAnnotationTransformer_1();

	@Test(invocationCount = 5)
	public void changeInvocationCountOfMethod() {
		System.out.println("This method have invocation count set to 5 but at run time it shall become " + obj.counter);
	}
}