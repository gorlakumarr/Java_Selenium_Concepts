package javaProgrames;

public class Number_OddEven {
	public static void main(String[] args) {
		oddEven(123456789);
	}

	public static void oddEven(int num) {
		int evenCount = 0;
		int oddCount = 0;

		while (num > 0) {
			if (num % 10 % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			num = num / 10;
		}
		System.out.println("oddCount :" + oddCount + ": evenCount :" + evenCount);

	}
}
