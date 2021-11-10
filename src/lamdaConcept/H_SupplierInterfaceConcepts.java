package lamdaConcept;

import java.util.function.Supplier;

public class H_SupplierInterfaceConcepts {
	public static void main(String[] args) {
		/**
		 * Represents an operation that accepts No argument and returns result
		 * 
		 */
		getText(() -> "Kumar");
		getText(() -> "Gk");
		getText(() -> "Test");

		// Another example
		Supplier<String> supplier = () -> "Java is fun";
		System.out.println(supplier.get().length());
	}

	public static void getText(Supplier<String> txt) {
		System.out.println(txt.get().length());
	}

}
