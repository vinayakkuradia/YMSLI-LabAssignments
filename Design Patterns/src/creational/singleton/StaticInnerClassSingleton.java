package creational.singleton;

public class StaticInnerClassSingleton {
	
	private StaticInnerClassSingleton() {
		
	}
	
	private static class ObjectHolder {
		static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return ObjectHolder.instance;
	}
}
