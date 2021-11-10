package cleanCodePrinciples;

public class ISP_JohnDoe implements ISP_SwimmingAthlete {

	@Override
	public void compete() {
		System.out.println("John Doe started competing");
	}

	@Override
	public void swim() {
		System.out.println("John Doe started swimming");
	}

}