package cleanCodePrinciples;

public class LSP_1_Demo {

	public static void main(String[] args) {

		LSP_1_DevieWithEngine car = new LSP_1_Car();
		car.startEngine();

		System.out.println("-----------------------");

		LSP_1_ByCycle cycle = new LSP_1_ByCycle();
		cycle.startMoving();
	}
}
