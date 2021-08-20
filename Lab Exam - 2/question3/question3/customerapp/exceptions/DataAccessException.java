package question3.customerapp.exceptions;

public class DataAccessException extends RuntimeException {

	private static final long serialVersionUID = 3829262453393189666L;

	public DataAccessException() {
	}
	
	public DataAccessException(String msg) {
		super(msg);
	}

}
