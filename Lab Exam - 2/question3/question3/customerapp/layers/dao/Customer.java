package question3.customerapp.layers.dao;

import java.util.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phonenumber;
	private Date dob;
	
	
	
	public Customer(String name, String address, String phonenumber, Date dob) {
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.dob = dob;
	}
	
	public Customer(int id, String name, String address, String phonenumber, Date dob) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.phonenumber = phonenumber;
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Date getDob() {
		return dob;
	}
	void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phonenumber=");
		builder.append(phonenumber);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}
	
	
}
