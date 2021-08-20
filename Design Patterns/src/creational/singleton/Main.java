package creational.singleton;

public class Main {
	public static void main(String[] args) {
		UnbreachableSingleton instance = UnbreachableSingleton.getInstance();
		System.out.println(instance);
	}
}
