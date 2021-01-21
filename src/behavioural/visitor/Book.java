package behavioural.visitor;

public class Book extends Item {
	private String name = null;
	private double weight = 0;
	private double price = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
