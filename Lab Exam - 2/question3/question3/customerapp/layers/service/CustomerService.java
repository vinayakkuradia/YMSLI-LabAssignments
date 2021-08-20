package question3.customerapp.layers.service;

import question3.customerapp.exceptions.DataAccessException;
import question3.customerapp.layers.dao.Customer;

public interface CustomerService {
	public Customer addCustomer(Customer customer) throws DataAccessException;
	public Customer getCustomerById(int id) throws DataAccessException;
}
