package javaSessions;

public class ConstructorConcepts_SuperKeyWord_B extends ConstructorConcepts_SuperKeyWord_A {

	public ConstructorConcepts_SuperKeyWord_B() {
		super(10);
		System.out.println("Child Class Contructor");
	}

	public static void main(String[] args) {
		ConstructorConcepts_SuperKeyWord_B obj = new ConstructorConcepts_SuperKeyWord_B();
	}
}
