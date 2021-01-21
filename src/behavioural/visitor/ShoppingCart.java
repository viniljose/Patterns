package behavioural.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	public double totalShippingFee(List<Item> items){
		ShippingFeeVisitor visitor = new ShippingFeeVisitor();
		double fee =0;
		for(Item item :items ){
			item.accept(visitor);
			fee = fee +visitor.getShippingFee();
		}
		return fee;
	}
	
	public double totalCost(List<Item> items){
		CostVisitor visitor = new CostVisitor();
		double cost = 0;
		for(Item item :items ){
			item.accept(visitor);
			cost = cost + visitor.getCost();
		}
		return cost;
	}
	
	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Book book = new Book();
		book.setPrice(200);
		book.setWeight(200);
		
		CD cd = new CD();
		cd.setPrice(300);
		
		List<Item> items = new ArrayList<Item> ();
		items.add(book);
		items.add(cd);
		
		System.out.println("Total Shipping Fee Rs" + cart.totalShippingFee(items));
		System.out.println("Total Cost Rs" + cart.totalCost(items));
		
		
	}

}
