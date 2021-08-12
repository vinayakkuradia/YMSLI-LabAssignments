package java8.functionalinterface;

public class Main {

	public static void main(String[] args) {
		Calc c = (int a, int b) -> a+b;
		
		System.out.println(c.add(5, 6));;
	}

}
