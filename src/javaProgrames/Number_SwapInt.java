package javaProgrames;

public class Number_SwapInt {
	public static void main(String[] args) {
		int x = 5;
		int y = 10;

		// 1.With using Third variable
		int t;
		t = x;
		x = y;
		y = t;

		System.out.println(x);
		System.out.println(y);

		// 2.Without using Third variable
		x = x + y; // x=15
		y = x - y; // y=5
		x = x - y;// x=10
		System.out.println(x);
		System.out.println(y);

		// 3.With Multiplication
		x = x * y;// x=50
		y = x / y;// y=5
		x = x / y; // x=10

		// 4.Bitwise XOR Operator
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;

		System.out.println(x);	
		System.out.println(y);

		// Single line
		y = x + y - (x = y);

		System.out.println(x);
		System.out.println(y);

	}

}
