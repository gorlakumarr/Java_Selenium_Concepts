package lambda_javabrains;

public class TypeRefExample {
	public static void main(String[] args) {
		printLambda(s -> s.length());
	}

	public static void printLambda(StringLengthLambda lambda) {
		System.out.println(lambda.getLength("Greeting"));
	}
}

interface StringLengthLambda {
	int getLength(String s);
}