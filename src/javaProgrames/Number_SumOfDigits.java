package javaProgrames;

public class Number_SumOfDigits {
	public static void main(String[] args) {
		System.out.println(sum(123));
	}

	public static int sum(int num) {
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		return sum;
	}
}
