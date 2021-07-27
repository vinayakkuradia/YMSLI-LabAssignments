package assignment2.question1;

public class CircleTest {

	public static void main(String[] args) {
		Circle circle = new Circle(55), circle2 = new Circle();
		System.out.println("The radius of circle is: "+ circle.getRadius());
		System.out.println("The area of circle is: " + circle.getArea());
		System.out.println("The radius of circle is: "+ circle2.getRadius());
		System.out.println("The area of circle is: " + circle2.getArea());
	}

}
