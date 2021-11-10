package lambda_javabrains;

import java.util.Arrays;
import java.util.List;

public class CollectionSteamsExample {
	/**
	 * Streams -> a sequence of elements supporting sequential and parallel
	 * aggregate operations
	 */

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		people.stream().filter(p -> p.getLastName().startsWith("C")).forEach(p -> System.out.println(p.getLastName()));
	}
}
