package javaProgrames;

public class Array_Int_Sum {
	public static void main(String[] args) {

		int numbers[] = { -20, -100, 10, 20, 100 };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		System.out.println(sum);
	}
}
