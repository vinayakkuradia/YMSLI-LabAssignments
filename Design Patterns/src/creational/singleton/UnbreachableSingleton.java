package creational.singleton;

import java.io.Serializable;

public class UnbreachableSingleton implements Cloneable, Serializable {
	
	private static final long serialVersionUID = 5169676425258025015L;

	private UnbreachableSingleton() {
		if (InstanceHolder.instance!=null) {
			throw new IllegalStateException();
		}
	}
	
	private static class InstanceHolder {
		final static UnbreachableSingleton instance = new UnbreachableSingleton();
	}
	
	public static UnbreachableSingleton getInstance() {
		return InstanceHolder.instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	protected Object readResolve() {
		return getInstance();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UnbreachableSingleton [toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
