package lambda_javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit_1_Excecise_Solution_Java_7 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		// Step 1 :sort list by Last Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		// Step 2 :create method that prints all elements in the list
		System.out.println("Printing All Persons");
		System.out.println();

		printall(people);

		// Step 3 :Create a method that prints all people that have last name
		// beginning with C
		System.out.println("Printing Persons Starts With C");
		System.out.println();
		printLastNameConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
		});
		System.out.println("Printing Persons Starts With T");
		System.out.println();
		printLastNameConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("T");
			}
		});
	}

	private static void printLastNameConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}
	}

	private static void printall(List<Person> people) {
		for (Person person : people) {
			System.out.println(person);
		}
	}

	interface Condition {
		boolean test(Person p);
	}
}
