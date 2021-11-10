package designPattern_factory;

public class CarFactory {

	public static Car buildCar(CarType model) {
		Car car = null;

		switch (model) {
		case SMALL:
			car = new SmallCar();
			break;
		case LUXURY:
			car = new LuxuryCar();
			break;
		case SEDAN:
			car = new SedanCar();
			break;
		default:
			break;
		}
		return car;
	}
}
