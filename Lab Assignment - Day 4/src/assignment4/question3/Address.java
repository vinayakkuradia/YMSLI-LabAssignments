package assignment4.question3;
import java.io.Serializable;

public class Address implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String buildingNumber, streetName, city, state;
	int pinCode;
	
	Address(String buildingNumber, String streetName, String city, String state, int pinCode) {
		this.buildingNumber = buildingNumber;
		this.streetName = streetName;
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
	
	String getAddress() {
		return ("Building No.: "+ buildingNumber+", Street: "+streetName+"\nCity: "+city+", State: "+state+", PIN: "+pinCode);
	}
}
