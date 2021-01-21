package structural.decorator;

public class HoneyDecorator extends IcecreamDecorator{

	public HoneyDecorator(Icecream icecream) {
		super(icecream);		
	}
	public String makeIcecream(){
		return icecream.makeIcecream() + addHoney();
	}
	
	public String addHoney(){
		return " adding Honey\n";
	}

}
