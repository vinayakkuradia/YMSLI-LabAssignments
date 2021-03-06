package assignment2.question5;

public class Vehicle {
	int noOfWheel, noOfPassenger, model;
	String make;
	
	Vehicle(String make, int model, int noOfWheel, int noOfPassenger){
		this.make = make;
		this.model = model;
		this.noOfWheel = noOfWheel;
		this.noOfPassenger = noOfPassenger;
	}
	
	int getNoOfWheel() {
		return noOfWheel;
	}



	void setNoOfWheel(int noOfWheel) {
		this.noOfWheel = noOfWheel;
	}



	int getNoOfPassenger() {
		return noOfPassenger;
	}



	void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}



	int getModel() {
		return model;
	}



	void setModel(int model) {
		this.model = model;
	}



	String getMake() {
		return make;
	}



	void setMake(String make) {
		this.make = make;
	}



	public void display() {
		System.out.println("--------------------");
		System.out.println(getMake()+" - "+getModel());
		System.out.println("--------------------");
		System.out.println("No. of Wheels: "+ getNoOfWheel());
		System.out.println("No. of Passengers: "+ getNoOfPassenger());
	}
}
