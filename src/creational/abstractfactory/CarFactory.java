package creational.abstractfactory;

public class CarFactory {
	
	public static Car buildCar(CarType type,Location loc){
		Car car = null;
		switch(loc){
		case INDIA:
			car = IndiaCarFactory.buildCar(type);
			break;
		case USA:
			car = USACarFactory.buildCar(type);
			break;		
		default:
			break;
		}
		return car;
	
	}

}
