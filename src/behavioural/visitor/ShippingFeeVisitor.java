package behavioural.visitor;

public class ShippingFeeVisitor implements Visitor {
	private double shippingFee = 0;

	public double getShippingFee() {
		return shippingFee;
	}

	@Override
	public void visit(Book book) {
		if(book.getWeight() > 100){
			shippingFee = 25;
		} else {
			shippingFee = 10;
		}
			
	}

	@Override
	public void visit(CD cd) {
		shippingFee = 10;
	}

}
