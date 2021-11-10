package javaConcepts;

public class OverriddenExample {
	/**
	 * Whatever the methods aprent has by default avalable to the child through
	 * inheritence some times child may not satisfy with parent method
	 * implementation.the child is able to redefine the method on its reqeuirement.
	 * This process is called Overriding
	 * 
	 */
	public static void main(String[] args) {
		Child c = new Child();
		c.cash();
		c.money();

		Parent p = new Child();
		p.cash();
		
		/*								Overloading				Overriding
		 * 1.Methods Names				Should be same			Should be same
		 * 
		 * 2.Arguements Types			Must be different		must be same
		 * 
		 * 3.Return Type				No Restrictions			must be same
		 * 
		 * 4.Private,Static and Final methods->Can be overloaded-->Cannt be overridden
		 * 
		 * 5.Access Modifiers         :No Restrictions-			>we Cant reduce the scope, but we can increase
		 * 
		 * 6.throws class		      ->No Restrictions---		>If child class method throws any checked excepetion
		 * 														then parent class method should throw same or its parent exception
		 * 
		 * 
		 * 8.method resolution		>Always takes care by compiler-->always takes care by JVM based on runtime object
		 * 
		 * 9.Also known as--		>Compile time polymorphism or static binding or early binding--->Runtimepolymorphism or dynamic binding or late binding
		 */

	}
}