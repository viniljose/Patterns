package structural.decorator;

public class NutsDecorator extends IcecreamDecorator{

	public NutsDecorator(Icecream icecream) {
		super(icecream);		
	}
	
	public String makeIcecream(){
		return icecream.makeIcecream() + addNuts();
	}
	
	public String addNuts(){
		return " adding Nuts\n";
	}

}
