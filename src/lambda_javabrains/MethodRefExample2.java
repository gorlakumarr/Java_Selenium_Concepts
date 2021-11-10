package lambda_javabrains;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MethodRefExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		System.out.println("Printing All Persons ");
		printLastNameConditionally(people, p -> true, System.out::println);// p->method(p)
	}

	private static void printLastNameConditionally(List<Person> people, Predicate<Person> predicate,
			Consumer<Person> consumer) {
		for (Person person : people) {
			if (predicate.test(person))
				consumer.accept(person);
		}
	}
}
