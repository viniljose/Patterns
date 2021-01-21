package creational.factorymethod;

public class PetFactoryImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Pet cat = PetFactory.getPet("Meow");
		String print =cat.speak();
System.out.println("--->"+print);
	}

}
