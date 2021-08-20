package question3.customerapp.exceptions;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 332163413350727993L;

	public CustomerNotFoundException() {
	}
	
	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}
