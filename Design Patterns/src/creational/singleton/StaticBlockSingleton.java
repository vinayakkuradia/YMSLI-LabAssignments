package creational.singleton;

public class StaticBlockSingleton {
	public static StaticBlockSingleton instance;

	private StaticBlockSingleton() {
		// private constructor
	}
	
	{
		instance = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
