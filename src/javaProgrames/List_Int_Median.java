package javaProgrames;

import java.util.ArrayList;
import java.util.Arrays;

public class List_Int_Median {
	private static double median;

	public static void main(String[] args) {

		ArrayList<Integer> l = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

		int n = l.size();

		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = l.get(i).intValue();
			System.out.println("Values  at " + i + "th position " + a[i]);
		}
		System.out.println("n/2 postion = " + a[n / 2]);
		System.out.println("n/2 = " + n / 2);

		if (n % 2 != 0) {
			median = a[n / 2];
			System.out.println(median);
		} else {
			median = (a[(n / 2) - 1] + a[n / 2]);
			System.out.println(median);
			System.out.println(median / 2);
		}
		System.out.println();

		for (int i : l) {
			if (n % 2 != 0) {
				median = l.get(n / 2);
			} else {
				median = ((l.get((n / 2) - 1) + l.get(n / 2))) / 2.0;
			}
		}
		System.out.println(median);
	}
}
