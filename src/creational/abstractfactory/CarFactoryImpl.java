package creational.abstractfactory;

public class CarFactoryImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CarFactory.buildCar(CarType.HATCHPACK, Location.INDIA);
		CarFactory.buildCar(CarType.HATCHPACK, Location.USA);
		CarFactory.buildCar(CarType.SEDAN, Location.INDIA);
		CarFactory.buildCar(CarType.SEDAN, Location.USA);
		CarFactory.buildCar(CarType.LUXURY, Location.INDIA);
		CarFactory.buildCar(CarType.LUXURY, Location.USA);

	}

}
