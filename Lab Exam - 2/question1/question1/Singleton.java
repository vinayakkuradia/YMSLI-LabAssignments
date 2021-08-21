package question1;

import java.io.Serializable;


public class Singleton implements Cloneable, Serializable {
	
	// Giving a serial version UID
	private static final long serialVersionUID = 7174510998683237057L;
	


	// Protection from Java Reflection
	private Singleton() {
		if(getInstance()!=null) {
			throw new IllegalStateException();
		}
	}

	
	// Making instance creation Thread-safe
	private static class InstanceHolder {
		private static Singleton singletonInstance = new Singleton();
	}

	public static Singleton getInstance() {
		return InstanceHolder.singletonInstance;
	}
	
	// Protection from Cloning
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	// Protection from Serialization
	
	protected Object readResolve() {
		return getInstance();
	}
	
}

