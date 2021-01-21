package creational.abstractfactory;

public class LuxuryCar extends Car {
	
	public LuxuryCar(Location loc){
		super(CarType.LUXURY,loc);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("--------Creating a Luxury car-------for "+getLocation());

	}

}
