package creational.singleton;
/**
 * double-checked locking
 * Solves the below issue.
 * Suppose there are two threads T1 and T2. Both comes to create instance and execute “instance==null”, 
 * now both threads have identified instance variable to null thus assume they must create an instance. 
 * They sequentially goes to synchronized block and create the instances. 
 * At the end, we have two instances in our application.
 * @author SG0214210
 *
 */
public class LazySingleton {
	private static volatile LazySingleton instance = null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		if(instance == null){
			synchronized(LazySingleton.class){
				if(instance == null){
					instance = new LazySingleton();
				}
			}
		}
		
		return instance;
	}

}
