package creational.prototype;

import creational.prototype.PrototypeFactory.ModelType;

public class PrototypeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.println(PrototypeFactory.getInstance(ModelType.MOVIE));
			System.out.println(PrototypeFactory.getInstance(ModelType.ALBUM));
			System.out.println(PrototypeFactory.getInstance(ModelType.STAGESHOW));
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
