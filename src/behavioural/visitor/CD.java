package behavioural.visitor;

public class CD extends Item {
	private String name = null;	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	private double price = 0;

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
