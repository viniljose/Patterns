package creational.abstractfactory;

public class Sedan extends Car {
	
	public Sedan(Location loc){
		super(CarType.SEDAN,loc);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("--------Creating a Sedan car-------for "+getLocation());

	}

}
