package lambda_javabrains;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import lambda_javabrains.Unit_1_Excecise_Solution_Java_7.Condition;

public class Unit_1_Excecise_Solution_Java_8 {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Charles", "Dickness", 60), new Person("Lewis", "Carol", 42),
				new Person("Thomas", "Carlyw", 51), new Person("Charlette", "Brante", 45),
				new Person("Muthnew", "Arlond", 39));

		// Step 1 :sort list by Last Name
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		// Step 2 :create method that prints all elements in the list
		System.out.println("Printing All Persons");
		System.out.println();

		printLastNameConditionally(people, p -> true);

		System.out.println();

		// Step 3 :Create a method that prints all people that have last name
		// beginning with C
		System.out.println("Printing Persons Starts With C");
		printLastNameConditionally(people, p -> p.getLastName().startsWith("C"));

		System.out.println();

		System.out.println("Printing Persons Starts With A");
		printLastNameConditionally(people, p -> p.getLastName().startsWith("A"));
	}

	private static void printLastNameConditionally(List<Person> people, Condition condition) {
		for (Person person : people) {
			if (condition.test(person))
				System.out.println(person);
		}
	}

}
