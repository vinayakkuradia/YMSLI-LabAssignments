package question3.customerapp.layers.dao;

import question3.customerapp.exceptions.DataAccessException;


public interface CutomerDao {
	public Customer addCustomer(Customer customer) throws DataAccessException;
	public Customer getCustomerById(int id) throws DataAccessException;
}
