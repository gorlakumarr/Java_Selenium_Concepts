package javaConcepts;

public class Equals {
	/**
	 * == Reference Comparison/Address Comparision
	 * 
	 * .equals() meant for Content Comparision
	 * 
	 * .equals() -->Present in Object Class also meant for reference comparison only
	 * based on our requirement we can override for content comparison.
	 * 
	 * In String class,All wrapper class and all collection classes .equals() method
	 * is overrideen for content comparison
	 * 
	 */
	public static void main(String[] args) {

		String s1 = new String("Kumar");
		String s2 = new String("Kumar");
		System.out.println(s1 == s2); // False :s1 s2 have different referecnes point's
		System.out.println(s1.equals(s2));// True : s1 s2 have same content

	}
}
