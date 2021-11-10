package javaProgrames;

public class Array_Int_GivenNumber_SumOfPairs {

	public static void main(String[] args) {

		int numbers[] = { 4, 5, 7, 11, 9, 13, 8, 12 };
		int inputNumber = 20;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {

				if (numbers[i] + numbers[j] == inputNumber) {
					System.out.println(numbers[i] + " + " + numbers[j] + " = " + inputNumber);
				}
			}
		}
	}
}
