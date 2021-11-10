package javaConcepts;

public class MainMethodOverload2 {
//original main() method  
	public static void main(String args[]) {
		MainMethodOverload2 mmo = new MainMethodOverload2();
//calling overloaded main() method from the original main() method  
		mmo.main();
	}

//overloaded main() method  
	public static void main() {
		System.out.println("Overloaded main() method invoked");
	}
}