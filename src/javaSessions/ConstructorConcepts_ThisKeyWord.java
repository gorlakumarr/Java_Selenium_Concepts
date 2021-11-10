package javaSessions;

public class ConstructorConcepts_ThisKeyWord {

	// Class Variables
	String name;
	int age;

	public ConstructorConcepts_ThisKeyWord(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name);
		System.out.println(this.age);
	}

	public static void main(String[] args) {
		ConstructorConcepts_ThisKeyWord obj = new ConstructorConcepts_ThisKeyWord("Gk", 29);
	}
}
