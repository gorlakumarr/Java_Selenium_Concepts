package cleanCodePrinciples;

public class LSP_1_DevieWithEngine extends LSP_1_TrasportationDevice {

	private String engine;

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public void startEngine() {
		System.out.println("Engine Running.....");
	}

	@Override
	public String toString() {
		return "LSP_1_DevieWithEngine [engine=" + engine + "]";
	}
}
