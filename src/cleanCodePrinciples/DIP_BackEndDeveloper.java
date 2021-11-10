package cleanCodePrinciples;

public class DIP_BackEndDeveloper implements DIP_Developer {

	@Override
	public void develop() {
		writeJava();
	}

	private void writeJava() {
		System.out.println("writeJava.....");
	}

}