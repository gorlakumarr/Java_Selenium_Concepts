package javaConcepts;

public class AutoBoxingUnBoxing {
	public static void main(String[] args) {
		// AutoBoxing : Primitive to Object Wrapper Class
		// Auto Un Boxing : Object Wrapper Class To Primitive

		int i = 10;// Primitive Value

		// Auto Boxing
		Integer integer = Integer.valueOf(i); // Object Wrapper Class
		System.out.println(integer);

		System.out.println();

		// Auto Un Boxing
		int j = integer;
		System.out.println(j);

		System.out.println();

		// AutoBox
		char a='a';
		Character chatObj = a;
		char ch = chatObj;
		System.out.println("Value Of ch : " + ch);
		System.out.println("Value Of charObj : " + chatObj);

	}
}
