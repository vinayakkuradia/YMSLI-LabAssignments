package question3.customerapp.layers.service;

import question3.customerapp.exceptions.DataAccessException;
import question3.customerapp.layers.dao.Customer;
import question3.customerapp.layers.dao.CustomerDaoImpl;

public class CustomerServiceImpl implements CustomerService {
	CustomerDaoImpl daoObject;
	public CustomerServiceImpl() {
		daoObject = new CustomerDaoImpl();
	}

	@Override
	public Customer addCustomer(Customer customer) throws DataAccessException {
		return daoObject.addCustomer(customer);
	}

	@Override
	public Customer getCustomerById(int id) throws DataAccessException {
		return daoObject.getCustomerById(id);
	}

}
