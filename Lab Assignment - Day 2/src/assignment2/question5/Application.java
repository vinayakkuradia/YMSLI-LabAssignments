package assignment2.question5;

import java.util.Scanner;

public class Application {
	
	private static Vehicle askVehicleDetails() {
		Scanner sc = new Scanner(System.in);
		int noOfWheel, noOfPassenger, model;
		String make;
		System.out.println("Enter Brand/Make: ");
		make = sc.next();
		System.out.println("Enter Model: ");
		model = sc.nextInt();
		System.out.println("Enter Wheels Count: ");
		noOfWheel = sc.nextInt();
		System.out.println("Enter Passengers Capacity: ");
		noOfPassenger = sc.nextInt();
		sc.close();
		return new Vehicle(make, model, noOfWheel, noOfPassenger);
	}
	
	private static Car askCarDetails() {
		Scanner sc = new Scanner(System.in);
		int noOfWheel, noOfPassenger, model, noOfDoor;
		String make;
		System.out.println("Enter Brand/Make: ");
		make = sc.next();
		System.out.println("Enter Model: ");
		model = sc.nextInt();
		System.out.println("Enter Wheels Count: ");
		noOfWheel = sc.nextInt();
		System.out.println("Enter Passengers Capacity: ");
		noOfPassenger = sc.nextInt();
		System.out.println("Enter No. of Doors: ");
		noOfDoor = sc.nextInt();
		sc.close();
		return new Car(make, model, noOfWheel, noOfPassenger, noOfDoor);
	}
	
	private static Convertible askConvertibleDetails() {
		Scanner sc = new Scanner(System.in);
		int noOfWheel, noOfPassenger, model, noOfDoor;
		String make; boolean isHoodOpen;
		System.out.println("Enter Brand/Make: ");
		make = sc.next();
		System.out.println("Enter Model: ");
		model = sc.nextInt();
		System.out.println("Enter Wheels Count: ");
		noOfWheel = sc.nextInt();
		System.out.println("Enter Passengers Capacity: ");
		noOfPassenger = sc.nextInt();
		System.out.println("Enter No. of Doors: ");
		noOfDoor = sc.nextInt();
		System.out.println("Enter Hood Open Condition: ");
		isHoodOpen = sc.nextBoolean();
		sc.close();
		return new Convertible(make, model, noOfWheel, noOfPassenger, noOfDoor, isHoodOpen);
	}
	
	private static SportCar askSportCarDetails() {
		Scanner sc = new Scanner(System.in);
		int noOfWheel, noOfPassenger, model;
		String make;
		System.out.println("Enter Brand/Make: ");
		make = sc.next();
		System.out.println("Enter Model: ");
		model = sc.nextInt();
		System.out.println("Enter Wheels Count: ");
		noOfWheel = sc.nextInt();
		System.out.println("Enter Passengers Capacity: ");
		noOfPassenger = sc.nextInt();
		sc.close();
		return new SportCar(make, model, noOfWheel, noOfPassenger);
	}
	
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter you choice: ");
		System.out.println("1.Vehicle 2.Car 3.Convertible 4.SportCar");

		Vehicle v;

		switch (input.nextInt()) {
		case 1:
			v = askVehicleDetails();
			v.display();
			break;
		case 2:
			v = askCarDetails();
			v.display();
			break;
		case 3:
			v = askConvertibleDetails();
			v.display();
			break;
		case 4:
			v = askSportCarDetails();
			v.display();
			break;
		}

		input.close();
	}

}
