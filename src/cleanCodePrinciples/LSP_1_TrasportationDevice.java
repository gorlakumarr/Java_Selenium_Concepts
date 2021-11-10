package cleanCodePrinciples;

public class LSP_1_TrasportationDevice {

	private String name;
	private double speed;

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

	@Override
	public String toString() {
		return "LSP_1_TrasportationDevice [name=" + name + ", speed=" + speed + "]";
	}
}
