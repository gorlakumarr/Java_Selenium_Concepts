package javaConcepts;

class InnerClass {
	public void show() {
		System.out.println("Sample");
	}
}

public class InnerClass_AnonumousClass {
	public static void main(String[] args) {
		InnerClass s = new InnerClass() {
			public void show() {
				System.out.println("Class");
			}
		};
		s.show();
	}
}
