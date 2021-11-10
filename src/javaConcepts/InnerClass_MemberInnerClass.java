package javaConcepts;

public class InnerClass_MemberInnerClass {
	int i;

	class Member {
		int j;
	}

	public static void main(String[] args) {
		InnerClass_MemberInnerClass obj = new InnerClass_MemberInnerClass();
		obj.i = 5;

		InnerClass_MemberInnerClass.Member obj2 = obj.new Member();
		obj2.j = 10;

		System.out.println(obj.i);
		System.out.println(obj2.j);

	}
}
