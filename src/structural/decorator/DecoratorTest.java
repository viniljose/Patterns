package structural.decorator;

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HoneyDecorator icecream = new HoneyDecorator(new NutsDecorator(new SimpleIcecream()));
		System.out.println(icecream.makeIcecream());
	}

}
