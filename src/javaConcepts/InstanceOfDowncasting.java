package javaConcepts;

public class InstanceOfDowncasting extends Parent {
	static void method(Parent parent) {
		if (parent instanceof InstanceOfDowncasting) {// if you dont use this: you will get Exception in thread "main"
														// java.lang.ClassCastException: class javaConcepts.Parent
														// cannot be cast to class javaConcepts.InstanceOfDowncasting
														// (javaConcepts.Parent and javaConcepts.InstanceOfDown
			InstanceOfDowncasting child_New = (InstanceOfDowncasting) parent;// Downcasting
			System.out.println("ok downcasting performed >" + child_New.toString());
		}
	}

	public static void main(String[] args) {
		Parent parent = new InstanceOfDowncasting();
		InstanceOfDowncasting.method(parent);

		Parent parent2 = new Parent();
		InstanceOfDowncasting.method(parent2);
	}
}
