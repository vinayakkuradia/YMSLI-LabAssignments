package creational.singleton;

public class LazySingleton {
	
	public static volatile LazySingleton instance;	
	
	private LazySingleton() {
		// private constructor
	}
	
	public static LazySingleton getInstance() {
		if(instance==null) {
			synchronized(LazySingleton.class) {
				if (instance==null) {
					instance = new LazySingleton();
				}
			}
		}
		return instance;
	}
	
}
