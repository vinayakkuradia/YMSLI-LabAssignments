package assignment2.question5;

public class Car extends Vehicle {
	int noOfDoor;
	
	Car(String make, int model, int noOfWheel, int noOfPassenger, int noOfDoor) {
		super(make, model, noOfWheel, noOfPassenger);
		this.noOfDoor = noOfDoor;
	}
	
	int getNoOfDoor() {
		return noOfDoor;
	}

	void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		System.out.println("--------------------");
		System.out.println(getMake()+" - "+getModel());
		System.out.println("--------------------");
		System.out.println("No. of Wheels: "+ getNoOfWheel());
		System.out.println("No. of Passengers: "+ getNoOfPassenger());
		System.out.println("No. of Doors: "+getNoOfDoor());
	}
}
