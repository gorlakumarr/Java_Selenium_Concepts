package javaConcepts;

public class StringStringBufferBuilder {
	/**
	 * String Objects are Immutable(Non Changeable)
	 * 
	 * StringBuffer objects are mutable
	 * 
	 * Once we create a string object we cant perform any changes in the existing
	 * object.If we try are trying to perform any changes with those changes a new
	 * object will be created.This non changeable nature is nothing but immutability
	 * 
	 * Once we create StringBuffer object we can perfrom any type of changes in the
	 * existing object. This changeableis nothing but mutability of the stringbuffer
	 * object
	 * 
	 * Difference B/W : SBuffer and SBuilder
	 * 
	 * Both can be used where mutability is there
	 * 
	 * In StringBuffer every method is synchronized. every time only single thread
	 * is allowed to operate. So Time execution is more. which performance wise not
	 * required
	 *
	 * 1.If the content is fixed and won't change frequently then we should go for
	 * String
	 *
	 * 2.If the content is not fixed and keep on changing but threadsafety is
	 * required then we should go for String Buffer
	 * 
	 * 3.If the content is not fixed and keeps on changing Thread Safety is not
	 * required then we should go for String Builder
	 * 
	 */
	public static void main(String[] args) {
		String s = new String("Kumar");
		s.concat("Gorla"); // New Object Created
		System.out.println(s);

		StringBuffer buffer = new StringBuffer("Kumar");
		buffer.append("Gorla");
		System.out.println(buffer);

		StringBuilder builder = new StringBuilder("Kumar");
		builder.append("Gorla");
		System.out.println(builder);
	}
}
