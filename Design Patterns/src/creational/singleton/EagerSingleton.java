package creational.singleton;

public class EagerSingleton {
	
	public static volatile EagerSingleton singletonObject = new EagerSingleton();	
	
	private EagerSingleton() {
		// private constructor
	}

	public static EagerSingleton getInstance() {
		return singletonObject;
	}
}
