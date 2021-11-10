package javaProgrames;

public class Array_Int_ElementEvenOddPostion {
	public static void main(String args[]) {
		int array[] = { 1, 2, 9, 4, 5, 6, 7 };
		evenOddPostion("even", array);
		// evenOddPostion("odd", array);
	}

	public static void evenOddPostion(String condition, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (condition.equalsIgnoreCase("even")) {
				if (i != 0) {
					if (i % 2 == 0) {
						System.out.println(array[i]);
					}
				} else {
					if (i % 2 != 0) {
						System.out.println(array[i]);
					}
				}
			}
		}
	}
}
