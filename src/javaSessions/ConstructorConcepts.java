package javaSessions;

public class ConstructorConcepts {

	public ConstructorConcepts() {
		System.out.println("Default Constructor");
	}

	public ConstructorConcepts(int i) {
		System.out.println("Single Parameterized Constructor");
		System.out.println("Value of i :" + i);
	}

	public ConstructorConcepts(int i, int j) {
		System.out.println("Two Parameterized Constructor");
		System.out.println("Value of i :" + i + " and j :" + j);
	}

	public static void main(String[] args) {
		ConstructorConcepts obj = new ConstructorConcepts();
		ConstructorConcepts obj1 = new ConstructorConcepts(10);
		ConstructorConcepts obj2 = new ConstructorConcepts(10, 20);
	}
}
