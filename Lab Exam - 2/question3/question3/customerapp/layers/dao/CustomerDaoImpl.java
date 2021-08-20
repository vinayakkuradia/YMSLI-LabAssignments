package question3.customerapp.layers.dao;

import java.sql.Connection;

import question3.customerapp.exceptions.DataAccessException;
import question3.customerapp.layers.dao.factory.JDBCConnectionFactory;

public class CustomerDaoImpl implements CutomerDao {

	Connection connection;
	public CustomerDaoImpl() {
		connection = JDBCConnectionFactory.getConnection();
	}
	@Override
	public Customer addCustomer(Customer customer) throws DataAccessException {
		return null;
	}
	@Override
	public Customer getCustomerById(int id) throws DataAccessException {
		return null;
	}

}
