package javaProgrames;

public class Array_Int_PushZero_Start_End {

	public static void main(String[] args) {

		int array[] = { 5, 0, 2, 0, 3, 6 };
		int n = array.length;
		String postion = "Start";
		pushZerosToStartEnd(array, n, postion);

		System.out.println("Array after pushing zeros to the " + postion + " :");
		for (int i = 0; i < n; i++)
			System.out.print(array[i] + " ");
	}

	static void pushZerosToStartEnd(int array[], int n, String position) {

		if (position.equalsIgnoreCase("end")) {
			int count = 0;
			for (int i = 0; i < n; i++) {
				if (array[i] != 0) {
					array[count] = array[i];
					count++;
				}
			}
			System.out.println(count);
			while (count < n) {
				array[count++] = 0;
			}
		} else {
			int current = n - 1;
			for (int i = current; i >= 0; i--) {
				if (array[i] != 0) {
					array[current] = array[i];
					current--;
				}
			}
			while (current >= 0) {
				array[current] = 0;
				current--;
			}
		}
	}

}