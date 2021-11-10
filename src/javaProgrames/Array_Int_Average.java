package javaProgrames;

import java.util.Arrays;
import java.util.OptionalDouble;

import com.google.common.math.DoubleMath;

public class Array_Int_Average {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// 1
		int total = 0;
		for (int i : num) {
			total = total + i;
		}
		System.out.println(total / num.length);

		// 2
		OptionalDouble optional = Arrays.stream(num).average();
		System.out.println(optional.getAsDouble());

		// 3
		System.out.println(DoubleMath.mean(num));
	}
}
