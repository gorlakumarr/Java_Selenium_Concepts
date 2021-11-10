package javaProgrames;

import java.util.Arrays;

public class Array_Int_MaxMin {
	public static void main(String[] args) {

		int numbers[] = { -20, -100, 10, 20, 100 };

		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (largest < numbers[i]) {
				largest = numbers[i];
			}
			if (smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}

		System.out.println(Arrays.toString(numbers));
		System.out.println(largest);
		System.out.println(smallest);
	}
}
