package cleanCodePrinciples;

public class WithOutISP_JohnDoe implements WithOutISP_Athlete {
	/*
	 * Suppose that John Doe is a swimming athlete. By implementing the Athlete
	 * interface, we have to implement methods like highJump and longJump, which
	 * JohnDoe will never use.
	 */

	@Override
	public void compete() {
		System.out.println("John Doe started competing");
	}

	@Override
	public void swim() {
		System.out.println("John Doe started swimming");
	}

	@Override
	public void highJump() {
	}

	@Override
	public void longJump() {
	}
}