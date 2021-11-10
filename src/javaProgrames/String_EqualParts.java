package javaProgrames;

public class String_EqualParts {
	public static void main(String[] args) {
		String input = "AAAABBBBCCCC";
		int noOfParts = 3;
		equalParts(input, noOfParts);
	}

	public static void equalParts(String str, int n) {

		if (str.length() == 0) {
			System.out.println("String is Null");
		} else if (str.length() % n != 0) {
			System.out.println("String is not divided into equal parts");
		} else if (str.length() % n == 0) {
			for (int i = 0; i < n; i++) {
				System.out.println(str.substring(str.length() / n * i, (str.length() / n * i) + str.length() / n));
			}
		}
	}
}