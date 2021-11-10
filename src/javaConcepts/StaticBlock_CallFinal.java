package javaConcepts;

public class StaticBlock_CallFinal {
	/**
	 * if its final : it will not load the main class. Directly call 100
	 * 
	 * if its not final : it will give load the call so then static block
	 * 
	 * get to know by decompiler online
	 */
	public static void main(String[] args) {
		System.out.println(Main.x);

	}
}

class Main {
	public static final int x = 100;
	static {
		System.out.println("main -- class static block");
	}
}
