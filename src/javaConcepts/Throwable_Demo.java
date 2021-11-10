package javaConcepts;

public class Throwable_Demo {
	public static void main(String[] args) throws Exception {
		try {
			divide(1, 0);
		} catch (ArithmeticException e) {
			System.out.println("Exception Occured :" + e.toString());
			System.out.println("Exception Message :" + e.getMessage());
			System.out.println("Exception Localised Message :" + e.getLocalizedMessage());
		}
	}

	public static void divide(int a, int b) throws ArithmeticException {

		int c = a / b;
		System.out.println("Result:" + c);
	}
}
