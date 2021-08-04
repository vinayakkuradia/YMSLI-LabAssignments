package assignment4.question3;
import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	String name, id;
	Address address;
	transient double salary;
	
	Employee(String name, String id, Address address, double salary) {
		this.name = name;
		this.id = id;
		this.address = address;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Id: "+id+", Name: "+name+"\nSalary: "+salary+"\nAddress: "+address.getAddress());;
	}
}
