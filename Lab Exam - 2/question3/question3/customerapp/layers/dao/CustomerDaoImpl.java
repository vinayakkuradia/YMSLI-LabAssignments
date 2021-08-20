package question3.customerapp.layers.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.mysql.jdbc.Statement;

import question3.customerapp.exceptions.CustomerNotFoundException;
import question3.customerapp.exceptions.DataAccessException;
import question3.customerapp.layers.dao.factory.JDBCConnectionFactory;

public class CustomerDaoImpl implements CutomerDao {

	private static final String INSERT_INTO_CUSTOMER = "insert into Customer (Name, Address, PhoneNumber, DOB) values (?, ?, ?, ?)";
	static final String ROWS_AFFECTED = " rows affected.";
	static final String WHERE_CUST_ID = " where CustID=?";
	static final String SELECT_FROM_CUSTOMER = "select * from Customer";

	private Connection connectionToDB;

	public CustomerDaoImpl() {
		this.connectionToDB = JDBCConnectionFactory.getConnection();
	}

	@Override
	public Customer addCustomer(Customer customer) throws DataAccessException {
		try {
			System.out.println("Creating cutomer object...");
			PreparedStatement insertStatement = connectionToDB.prepareStatement(INSERT_INTO_CUSTOMER, Statement.RETURN_GENERATED_KEYS);
			insertStatement.setString(1, customer.getName());
			insertStatement.setString(2, customer.getAddress());
			insertStatement.setString(3, customer.getPhonenumber());
			insertStatement.setDate(4, (Date) customer.getDob());
			insertStatement.executeUpdate();
			int noOfRowsAffected = insertStatement.getUpdateCount();
			System.out.println(noOfRowsAffected + ROWS_AFFECTED);
			int id = insertStatement.getGeneratedKeys().getInt(0);
			customer.setId(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return customer;
	}

	@Override
	public Customer getCustomerById(int id) throws CustomerNotFoundException {
		System.out.println("Searching customer with id=" + id);
		Optional<Customer> requestedCustomerObj = Optional.ofNullable(null);
		try {
			PreparedStatement selectByIdStatement = connectionToDB
					.prepareStatement(SELECT_FROM_CUSTOMER + WHERE_CUST_ID);
			ResultSet obtainedResultSet = selectByIdStatement.executeQuery();

			obtainedResultSet.next();
			requestedCustomerObj = Optional.ofNullable(new Customer(obtainedResultSet.getInt("Id"),
					obtainedResultSet.getString("Name"), obtainedResultSet.getString("Address"),
					obtainedResultSet.getString("PhoneNumber"), obtainedResultSet.getDate("DOB")));
		} catch (SQLException e) {
			throw new DataAccessException(e.getLocalizedMessage());
		}
		return requestedCustomerObj.orElseThrow(CustomerNotFoundException::new);
	}

}
