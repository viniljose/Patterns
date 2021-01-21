package creational.abstractfactory;

public class USACarFactory {
	
	public static Car buildCar(CarType type){
		Car car = null;
		switch(type){
		case HATCHPACK:
			car = new HatchPack(Location.USA);
			break;
		case SEDAN:
			car = new Sedan(Location.USA);
			break;
		case LUXURY:
			car = new LuxuryCar(Location.USA);
			break;
		default:
			break;
		}
		return car;
	}


}
