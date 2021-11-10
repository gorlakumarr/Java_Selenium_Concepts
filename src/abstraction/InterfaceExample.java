package abstraction;

public class InterfaceExample {
	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftSafetey();

		Car c = new BMW();
		c.start();
		c.stop();
		c.refuel();
	}
}
