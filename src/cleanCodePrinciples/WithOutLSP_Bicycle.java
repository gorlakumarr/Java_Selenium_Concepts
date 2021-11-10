package cleanCodePrinciples;

/**
 * Everything isn’t going as planned now! Yes, a bicycle is a transportation
 * device, however, it does not have an engine and hence, the method
 * startEngine() cannot be implemented.These are the kinds of problems that
 * violation of Liskov Substitution Principle leads to, and they can most
 * usually be recognized by a method that does nothing, or even can’t be
 * implemented.
 * 
 * @author e104399
 *
 */

public class WithOutLSP_Bicycle extends WithOutLSP_TrasportationDevice {
	@Override
	void startEngine() {
		System.out.println("");/* problem! */

	}
}