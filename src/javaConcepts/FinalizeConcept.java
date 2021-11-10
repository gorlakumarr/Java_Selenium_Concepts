package javaConcepts;

public class FinalizeConcept {
	/**
	 * Is A Method belongs to Object Class
	 * 
	 * Its methods which is always invoked by garbage collector just before
	 * destroying an object to perform clean up activities related to object
	 * 
	 * 
	 */
	public static void main(String[] args) {
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		f1 = null;
		f2 = null;
		System.gc();
	}

	public void finalize() {
		System.out.println("Finalize Method");
	}
}
