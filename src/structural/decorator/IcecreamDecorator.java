package structural.decorator;

public abstract class IcecreamDecorator implements Icecream{
	protected Icecream icecream;
	public IcecreamDecorator(Icecream icecream){
		this.icecream = icecream;
	}
	public String makeIcecream(){
		return icecream.makeIcecream();
	}

}
