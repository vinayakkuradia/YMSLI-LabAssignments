package question3.customerapp.controller;

import java.util.Date;

import question3.customerapp.layers.dao.Customer;
import question3.customerapp.layers.service.CustomerServiceImpl;

public class Main {

	public static void main(String[] args) {
		CustomerServiceImpl customerService = new CustomerServiceImpl();
		Customer newCustomer = customerService.addCustomer(new Customer("Vinayak Kuradia", "Kota, Raj", "8239540487", new Date()));
		System.out.println(newCustomer.getId());	
		System.out.println(customerService.getCustomerById(1));
	}

}
