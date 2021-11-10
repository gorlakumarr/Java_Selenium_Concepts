package javaConcepts;

public class Sysout {
	public static void main(String[] args) {
		System.out.println("Kumar");

		/*
		 * ** Don't let anyone instantiate this class private System() { } out will be
		 * initialized by jvm by setout menthod in System class.this will be called
		 * native method.in system.c with JNI api call it will be print the text
		 * 
		 * out from -->java.lang.System---Variable in static
		 * 
		 * println()---> java.io.PrintStream --Method
		 * 
		 * 
		 * we can't create object the of the system.why because constructor is private
		 * 
		 */
	}
}
