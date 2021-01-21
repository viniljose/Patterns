package creational.abstractfactory;

public class IndiaCarFactory {
	
	public static Car buildCar(CarType type){
		Car car = null;
		switch(type){
		case HATCHPACK:
			car = new HatchPack(Location.INDIA);
			break;
		case SEDAN:
			car = new Sedan(Location.INDIA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.INDIA);
			break;
		default:
			break;
		}
		return car;
	}

}
