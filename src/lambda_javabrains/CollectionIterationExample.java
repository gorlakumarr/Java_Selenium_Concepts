package lambda_javabrains;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		System.out.println("--------External Iterators---------------------------------------------------");

		for (int i = 0; i < people.size(); i++) {
			System.out.println(people.get(i));
		}

		System.out.println("--------External Iterators---------------------------------------------------");

		for (Person person : people) {
			System.out.println(person);
		}

		System.out.println(
				"--------Internal Iterators---For Each Java 8------------------------------------------------");
		people.forEach(p -> System.out.println(p));

		System.out.println("--------Method Reference-----Java 8----------------------------------------------");

		people.forEach(System.out::println);// Method Reference
	}
}
