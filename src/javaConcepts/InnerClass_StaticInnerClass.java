package javaConcepts;

public class InnerClass_StaticInnerClass {
	static int i;

	static class Member {
		int j;
	}

	public static void main(String[] args) {

		InnerClass_StaticInnerClass.i = 5;

		InnerClass_StaticInnerClass.Member obj=new InnerClass_StaticInnerClass.Member();
		obj.j=10;

		System.out.println(InnerClass_StaticInnerClass.i);
		System.out.println(obj.j);

	}
}
