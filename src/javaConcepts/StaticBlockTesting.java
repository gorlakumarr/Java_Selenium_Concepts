package javaConcepts;

public class StaticBlockTesting {
	public static void main(String[] args) {
		int i = StaticBlock4.createObject();
		System.out.println(i);

		// is it possible to compile and run java programe without using main() method?

		// StaticBlock4 block4 = new StaticBlock4();

		System.out.println(StaticBlock5.age);
	}
}
