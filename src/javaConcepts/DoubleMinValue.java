package javaConcepts;

public class DoubleMinValue {
	public static void main(String[] args) {
		/**
		 * What's the value of Double MIN_VALUE
		 * 
		 * Which one is bigger --> Double MIN_VALUE or 0.0d?
		 * 
		 * which one is bigger --> Double MIN_VALUE or NEGATIVE_INFINITY ?
		 * 
		 */

		System.out.println(Double.MIN_VALUE); // Postive Number
		System.out.println(Float.MIN_VALUE); // Postive Number
		System.out.println(Long.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);

		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Float.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0d));

		System.out.println(Double.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));

	}

}
