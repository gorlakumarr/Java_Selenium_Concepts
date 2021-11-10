package javaConcepts;

public class Overloading {
	/**
	 * Two methods are said to be overloaded if and only if both methdos having the
	 * same name but different arguents types
	 * 
	 */
	public void m1(String s) {
		System.out.println(s);
	}

	public void m1(int s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		Overloading overloading = new Overloading();
		overloading.m1(1);
		// overloading.m1("kumar");
	}
}
