package lambda_javabrains;

public class Greeter_Functional {

	public void greeting(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter_Functional greeter_Functional = new Greeter_Functional();
		Greeting_Demo demo = new Greeting_Demo();
		greeter_Functional.greeting(demo);
	}
}