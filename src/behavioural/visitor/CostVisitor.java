package behavioural.visitor;

public class CostVisitor implements Visitor {
	private double cost =0;

	public double getCost() {
		return cost;
	}

	@Override
	public void visit(Book book) {
		cost = book.getPrice();
	}

	@Override
	public void visit(CD cd) {
		cost = cd.getPrice();
	}

}
