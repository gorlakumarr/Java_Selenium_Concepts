package javaConcepts;

public class StaticAndInstance {
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instanct Initialization Block");
	}

	StaticAndInstance() {
		System.out.println("Constructor");
	}

	public static void main(String[] args) {
		System.out.println("Main Method");
		/*
		 * Static Block
		 * 
		 * Main Method
		 * 
		 */
		new StaticAndInstance();
		/*
		 * Static Block
		 * 
		 * Main Method
		 * 
		 * Instanct Initialization
		 * 
		 * Block Constructor
		 */
	}
}
