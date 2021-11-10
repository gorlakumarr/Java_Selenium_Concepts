package cleanCodePrinciples;

public class WithOutLSP_TrasportationDevice {
	private String name;
	private double speed;
	private String engine;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	void startEngine() {
		System.out.println("Start Engine.....");
	}
}
