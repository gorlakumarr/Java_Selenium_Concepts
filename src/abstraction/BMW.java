package abstraction;

public class BMW implements Car {
	public void start() {
		System.out.println("BMW--start");
	}

	public void stop() {
		System.out.println("BMW--stop");
	}

	public void refuel() {
		System.out.println("BMW--refuel");
	}

	// Non overridden methods
	public void theftSafetey() {
		System.out.println("BMW--refuel Non Abstract Theft Method");
	}
}
