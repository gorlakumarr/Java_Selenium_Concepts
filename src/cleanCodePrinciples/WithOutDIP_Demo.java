package cleanCodePrinciples;

public class WithOutDIP_Demo {
	/**
	 * Dependency Inversion is one of the last principles we are going to look at.
	 * The principle states that:
	 * 
	 * High-level modules should not depend on low-level modules. Both should depend
	 * on abstractions.
	 * 
	 * Abstractions should not depend on details. Details should depend on
	 * abstractions.
	 * 
	 */
	private WithOutDIP_BackEndDeveloper backEndDeveloper = new WithOutDIP_BackEndDeveloper();
	private WithOutDIP_FrontEndDeveloper frontEndDeveloper = new WithOutDIP_FrontEndDeveloper();

	public void implement() {

		backEndDeveloper.writeJava();
		frontEndDeveloper.writeJavascript();
	}

	public static void main(String[] args) {
		WithOutDIP_Demo demo = new WithOutDIP_Demo();
		demo.implement();
	}

	/*
	 * 1. So as we can see, the WithOutDIP_Demo class is a high-level module, and it
	 * depends on low-level modules such as BackEndDeveloper and FrontEndDeveloper.
	 * We are actually violating the first part of the dependency inversion
	 * principle.
	 * 
	 * 2.Also, by inspecting the implement function of WithOutDIP_Demo.class, we
	 * realize that the methods writeJava and writeJavascript are methods bound to
	 * the corresponding classes. Regarding the project scope, those are details
	 * since, in both cases, they are forms of development. Thus, the second part of
	 * the dependency inversion principle is violated.
	 */

}