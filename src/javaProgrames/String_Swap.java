package javaProgrames;

public class String_Swap {
	public static void main(String[] args) {

		String firstName = "Kumar";
		String lastName = "Gorla";

		System.out.println(firstName);
		System.out.println(lastName);

		// Appened
		firstName = firstName + lastName; // KumarGorla
		lastName = firstName.substring(0, firstName.length() - lastName.length());
		firstName = firstName.substring(lastName.length());

		System.out.println(firstName);
		System.out.println(lastName);
	}

}
