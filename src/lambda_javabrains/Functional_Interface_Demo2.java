package lambda_javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Functional_Interface_Demo2 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		// Step 1 :sort list by Last Name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 :create method that prints all elements in the list
		System.out.println("Printing All Persons ");
		System.out.println();

		performConditionally(people, p -> true, p -> System.out.println(p));

		System.out.println();

		// Step 3 :Create a method that prints all people that have last name
		// beginning with C
		System.out.println("Printing Persons Starts With C");
		performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p.getFirstName()));

		System.out.println();

		System.out.println("Printing Persons Starts With A");
		performConditionally(people, p -> p.getLastName().startsWith("A"), p -> System.out.println(p.getFirstName()));
	}

	private static void performConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}

}
