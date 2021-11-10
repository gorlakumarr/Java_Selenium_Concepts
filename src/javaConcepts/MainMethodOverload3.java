package javaConcepts;

public class MainMethodOverload3 {
//Overloaded main() method 1   
	public static void main(boolean args) {
		if (args) {
			System.out.println("First overloaded main() method executed");
			System.out.println(args);
		}
	}

//Overloaded main method 2   
	public static void main(String str) {
		System.out.println("Second overloaded main() method executed");
		System.out.println(str);
	}

//Overloaded main method 3   
	public static void main(int args) {
		System.out.println("Third overloaded main() method executed");
		System.out.println(args);
	}

//Original main() method  
	public static void main(String[] args) {
		System.out.println("Original main() method executed");
		System.out.println("Hello");
//invoking overloaded main() method 1   
		MainMethodOverload3.main(true);
//invoking overloaded main() method 2  
		MainMethodOverload3.main("mango");
//invoking overloaded main() method 3   
		MainMethodOverload3.main(112);
	}
}