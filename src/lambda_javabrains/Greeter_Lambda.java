package lambda_javabrains;

public class Greeter_Lambda {

	public void greeting(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter_Lambda greeter = new Greeter_Lambda();
//		Greeting greeting = new Greeting_Demo();

		Greeting greetingLambda = () -> System.out.println("Gretting...");

		Greeting greetingAnonymous = new Greeting() {

			@Override
			public void perform() {
				System.out.println("Greeting...");
			}
		};

//		greeting.perform();
		greetingLambda.perform();
		greetingAnonymous.perform();

//		greeter.greeting(greetingLambda);
		greeter.greeting(()->System.out.println("Greeting..."));
		greeter.greeting(greetingAnonymous);

		// MyAdd addFunction = (int a, int b) -> a + b;
	}
}

/*
 * interface MyLambda { void s(); }
 * 
 * interface MyAdd { int add(int a, int b); }
 */