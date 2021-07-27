package assignment2.question5;

public class Car extends Vehicle {
	int noOfDoor;
	
	int getNoOfDoor() {
		return noOfDoor;
	}

	void setNoOfDoor(int noOfDoor) {
		this.noOfDoor = noOfDoor;
	}

	public void display() {
		System.out.println(getMake()+": "+getModel());
		System.out.println("No. of Doors: "+getNoOfDoor());
	}
}
