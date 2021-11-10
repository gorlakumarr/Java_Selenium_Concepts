package lamdaConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class G_ConsumerInterfaceConcepts {
	public static void main(String[] args) {
		/**
		 * Represents an operation that accepts single input argument and returns no
		 * result
		 * 
		 */

		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("Kumar");

		System.out.println("-----------------------------");

		List<Integer> l = new ArrayList<Integer>(Arrays.asList(1, 3, 5, 7, 9));
		l.forEach(x -> System.out.println(x));
//		l.forEach(x -> System.out.println(x + 1));

		System.out.println("-----------------------------");

		l.forEach(System.out::println);

		// Another example
		Consumer<String> consumer2 = x -> System.out.println(x.toUpperCase());
		consumer2.accept("kumar");
	}
}
