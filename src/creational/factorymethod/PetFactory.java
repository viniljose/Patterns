package creational.factorymethod;

public class PetFactory {

	public static Pet getPet(String type){
		if("Bark".equalsIgnoreCase(type)){
			return new Dog();
		} else if ("Meow".equalsIgnoreCase(type)){
			return new Cat();
		} else {
			return null;
		}
	}
}
