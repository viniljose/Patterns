package creational.abstractfactory;

public class HatchPack extends Car {
	
	public HatchPack(Location loc){
		super(CarType.HATCHPACK,loc);
		construct();
	}

	@Override
	protected void construct() {
		System.out.println("--------Creating a HATCHPACK car-------for "+getLocation());

	}

}
