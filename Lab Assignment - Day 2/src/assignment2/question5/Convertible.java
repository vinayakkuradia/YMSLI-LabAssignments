package assignment2.question5;

public class Convertible extends Car {
	boolean isHoodOpen;
	
	Convertible(String make, int model, int noOfWheel, int noOfPassenger, int noOfDoor, boolean isHoodOpen) {
		super(make, model, noOfWheel, noOfPassenger, noOfDoor);
		this.isHoodOpen= isHoodOpen;
	}
	
	public void display() {
		System.out.println("--------------------");
		System.out.println(getMake()+" - "+getModel());
		System.out.println("--------------------");
		System.out.println("No. of Wheels: "+ getNoOfWheel());
		System.out.println("No. of Passengers: "+ getNoOfPassenger());
		System.out.println("No. of Doors: "+getNoOfDoor());
		System.out.println("Hood Open: "+ (isHoodOpen ? "Yes": "No"));
	}
}
