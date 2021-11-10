package javaConcepts;

public class MainOverridingExample {
	public static void main(String args[]) {
		MainOverridingExample obj = new MainOverridingExample();
		SuperClass.main(args);
		Sub.main(args);
	}
}