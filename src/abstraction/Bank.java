package abstraction;

public abstract class Bank {
	/*
	 * This one Partial Abstraction
	 * 
	 * Hiding the Implementationn logic is called "Abstraction"
	 *
	 * it can have abstract methods and non abstract methods
	 * 
	 */

	{

	}
	static {

	}
	int amt = 100;
	final int rate = 10;
	static int loanRate = 5;

	public abstract void loan(); // Abstract Method. It doesnt have any method body

	public abstract void interest();

	/**
	 * Non Abstact Methods
	 */
	public void credit() {
		System.out.println("Non Abstract Credit Method");
	}

	public void debit() {
		System.out.println("Non Abstract Debit Method");
	}
}
