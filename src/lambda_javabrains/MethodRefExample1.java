package lambda_javabrains;

public class MethodRefExample1 {
	public static void main(String[] args) {

		Thread thread = new Thread(MethodRefExample1::printMsg); // Method Reference :()->method()
		thread.start();

		/*
		 * Thread t = new Thread(() -> printMsg()); t.start();
		 */
	}

	public static void printMsg() {
		System.out.println("Hello");
	}
}
