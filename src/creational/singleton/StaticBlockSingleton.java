package creational.singleton;

public class StaticBlockSingleton {
	private static final StaticBlockSingleton INSTANCE;

	private StaticBlockSingleton() {
		
	}
	static {
		try {
		INSTANCE = new StaticBlockSingleton();
		} catch (Exception e){
			throw new RuntimeException(e);
		}
	}
	
	public static StaticBlockSingleton getInstance(){
		return INSTANCE;
	}
}
