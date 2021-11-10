package lambda_javabrains;

import lambda_javabrains.ClosuresExample.Process;

public class ThisRefExample {

	public static void main(String[] args) {
		ThisRefExample thisRefExample = new ThisRefExample();
		thisRefExample.doProcess(10, i -> {
			System.out.println("Vaulue of i is " + i);
//			System.out.println(this);// Cannot use this in a static context
		});

		thisRefExample.execute();

		/*
		 * thisRefExample.doProcess(10, new Process() {
		 * 
		 * @Override public void process(int i) { System.out.println("Vaulue of i is " +
		 * i); System.out.println(this); }
		 * 
		 * public String toString() { return "This is Anonymous Inner Class"; } });
		 */
	}

	public void execute() {
		doProcess(10, i -> {
			System.out.println("Vaulue of i is " + i);
			System.out.println(this);
		});
	}

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public String toString() {
		return "This is thisRefExample Class";
	}
}
