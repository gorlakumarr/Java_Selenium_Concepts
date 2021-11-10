package abstraction;

public interface Car {
	/**
	 * Always Defines only Abstract Methods
	 * 
	 * No Method Body
	 * 
	 * We can achieve 100% abstraction
	 *
	 * Can not create the object of interface
	 *
	 * only final and static variables defined here
	 */

	int wheels = 4;

	public void start();

	public void stop();

	public void refuel();
}
