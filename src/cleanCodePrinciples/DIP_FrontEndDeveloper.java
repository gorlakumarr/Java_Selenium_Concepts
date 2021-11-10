package cleanCodePrinciples;

public class DIP_FrontEndDeveloper implements DIP_Developer {

	@Override
	public void develop() {
		writeJavascript();
	}

	public void writeJavascript() {
		System.out.println("writeJavascript.....");
	}

}