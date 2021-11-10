package javaConcepts;

public class TryCatchCombinations {
	/**
	 * 1.Whenever we are writing try block compulsory we should write catch or
	 * finally.
	 * 
	 * 2.Whenever we are writing catch block compulsory we should write try block
	 * that is catch without try is invalid
	 * 
	 * 3.Whenever we are writing finally block compulsory we should write try block.
	 * 
	 * 4.try catch finally --order is important
	 * 
	 * 5.try with multiple catch block is okay but we should have (child -->parent)
	 * exception order
	 * 
	 * 6.we shouldn't handle same exception in both catch blocks
	 * 
	 * 7.we can take try catch finally blocks in try and catch and finaly blocks
	 * 
	 * 8.curly braces are mandatory for try catch finally
	 * 
	 */
	public static void main(String[] args) {

		// 1-Valid
		try {
		} catch (Exception e) {
		}

		// 2 -Invalid
		try {

		} catch (Exception e) {

		}
		/*
		 * Unreachable catch block for Exception. It is already handled by the catch
		 * block for Exception
		 */
		// catch (Exception e) {
		//
		// }

		// 3 - Valid
		try {
		} catch (ArithmeticException e) {// Child Exception

		} catch (Exception e) {// Parent Exception

		}

		// 4 - Invalid
		/*
		 * Unreachable catch block for ArithmeticException. It is already handled by the
		 * catch block for Exception
		 */
		// try {
		//
		// } catch (Exception e) {// Child Exception
		//
		// } catch (ArithmeticException e) {// Parent Exception
		//
		// }

		// 5- Valid
		try {
		} catch (ArithmeticException e) {
		} catch (Exception e) {
		}

		// 6-Invalid
		/*
		 * Syntax error, insert "Finally" to complete TryStatement
		 */
		// try {}

		// 7.Invalid
		/*
		 * Catch With out Try
		 */

		// catch (ExceptionInInitializerError e) {
		// }

		// 8- Invalid
		/*
		 * Finally with out try
		 */

		// finally {}

		// 9.Valid

		try {
		} finally {
		}

		// 10.Invalid
		/*
		 * Syntax error on token "catch", ( expected
		 */
		// try {}
		// System.out.println();
		// catch(Exception e){}

		// 11.Invalid
		/*
		 * Syntax error on token "catch", ( expected
		 */

		// try {
		// } catch (Exception e) {
		// }
		// System.out.println();
		// catch(Exception e) {}

		// 12.Invalid
		/*
		 * Syntax error on token "finally", delete this token
		 */

		// try {
		// } catch (Exception e) {
		// }System.out.println();
		// finally {}

		// 13.Valid

		try {
		} catch (Exception e) {
		}
		try {
		} finally {
		}

		// 14.Invalid

		/*
		 * Syntax error on token "catch", ( expected
		 */

		// try {}finally {}catch(Exception e) {}

		// 15.Invalid
		/*
		 * Syntax error on token "finally", delete this token
		 */

		// try {
		// } catch (Exception e) {
		// } finally {
		// }finally {}

		// 16.Valid
		try {
			try {
			} catch (Exception e) {
			} finally {
			}
		} catch (Exception e) {
		}

		// 17.Valid

		try {
		} catch (Exception e) {
			try {
			} finally {
			}
		}

		// 18.Valid

		try {
		} catch (Exception e) {
		} finally {
			try {
			} finally {
			}
		}

		// 19.Invalid

		/*
		 * Syntax error, insert "Finally" to complete BlockStatements
		 */

		// try {try{}}catch(Exception e) {}

		// 20.

		/*
		 * Curly braces are mandatory
		 */

		// try
		// System.out.println();
		// catch(Exception e) {}

	}
}
