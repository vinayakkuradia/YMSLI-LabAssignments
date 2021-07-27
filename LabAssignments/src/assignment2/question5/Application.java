package assignment2.question5;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you choice: ");
		System.out.println("1.Vehicle 2.Car 3.Convertible 4.SportCar");

		Vehicle v;

		switch (input.nextInt()) {
		case 1:
			v = new Vehicle();
			v.display();
			break;
		case 2:
			v = new Car();
			v.display();
			break;
		case 3:
			v = new Convertible();
			v.display();
			break;
		case 4:
			v = new SportCar();
			v.display();
			break;
		}

		input.close();
	}

}
