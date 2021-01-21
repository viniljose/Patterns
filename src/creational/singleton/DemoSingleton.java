package creational.singleton;

/**
 * http://howtodoinjava.com/2012/10/22/singleton-design-pattern-in-java/
 * Issues solved
 * 1.Lets say your application is distributed and it frequently serialize the objects in file system,
 *  only to read them later when required. 
 * Please note that, de-serialization always creates a new instance.
 * readResolve()
 * 2. when you class structure can change in between you serialize the instance and go again to de-serialize it. 
 *  Changed structure of class will cause JVM to give exception while de-serializing process.
 *  serialVersionUID
 * @author SG0214210
 *
 */
public class DemoSingleton {
	private static final long serialVersionUID = 1l;
	
	private DemoSingleton(){
		
	}
	
	private static class LazyLoad{
		private static DemoSingleton INSTANCE = new DemoSingleton();
	}
	
	public static DemoSingleton getInstance(){
		return LazyLoad.INSTANCE;
	}
	
	protected Object readResolve(){
		return getInstance();
	}
	
	private int value =10;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	

}
