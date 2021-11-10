package javaProgrames;

public class Array_Int_Equilibrium {

	public static void main(String[] args) {

		int[] inputArray = { 3, 3, 6, 2, 4, 0 };
		int i, j, element = 0;
		int leftSum, rightSum;

		for (i = 0; i < inputArray.length; i++) {

			leftSum = 0;
			for (j = 0; j < i; j++) {
				leftSum = leftSum + inputArray[j];
			}

			rightSum = 0;
			for (j = j + 1; j < inputArray.length; j++) {
				rightSum = rightSum + inputArray[j];
			}

			if (rightSum == leftSum) {
				element = i;
			}
		}
		System.out.println(inputArray[element]);
	}
}
