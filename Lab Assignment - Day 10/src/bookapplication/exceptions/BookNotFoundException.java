package bookapplication.exceptions;

public class BookNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1100799595557332082L;

	public BookNotFoundException(String message) {
		super(message);
	}

}
