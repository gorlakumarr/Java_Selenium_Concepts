package cleanCodePrinciples;

import java.util.List;

public class DIP_Demo {

	private List<DIP_Developer> developers;

	public DIP_Demo(List<DIP_Developer> developers) {
		this.developers = developers;
	}

	public void implement() {

		developers.forEach(d -> d.develop());
	}

	public static void main(String[] args) {

		DIP_Demo demo = new DIP_Demo(null);
		demo.implement();
	}
}