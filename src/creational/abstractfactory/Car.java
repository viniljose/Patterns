package creational.abstractfactory;

public abstract class Car {
	
	protected Car(CarType type ,Location loc){
		this.location=loc;
		this.model=type;
	}
	
	private CarType model;
	public CarType getModel() {
		return model;
	}
	public void setModel(CarType model) {
		this.model = model;
	}
	
	private Location location;
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}

	
	
	protected abstract void construct();

}
