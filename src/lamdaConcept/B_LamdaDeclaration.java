package lamdaConcept;

public class B_LamdaDeclaration {
	/**
	 * SAM: Single Abstract Method
	 * 
	 */

	public static void main(String[] args) {

		// WebPage page = new WebPage() {
		//
		// @Override
		// public void header(String value) {
		// System.out.println(value);
		// }
		// };
		// page.header("Google");
		//
		// System.out.println();
		//
		// WebPage page2 = new WebPage() {
		//
		// @Override
		// public void header(String value) {
		// System.out.println(value);
		// }
		// };
		// page2.header("Amazon");

		/*
		 * Lambda Expression
		 */

		A_WebPage page3 = (value, age) -> {
			System.out.println(value.toUpperCase() + " " + age);
		};

		// WebPage page4 = (value) -> {
		// System.out.println(value.toLowerCase().length());
		// };

		page3.header("Kumar", 10);

		// page4.headerSpace("Kumar");
	}
}
