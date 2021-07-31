package assignment4.question6;
import java.lang.Exception;

public class InputException extends Exception {
	private static final long serialVersionUID = 1L;
	public InputException(int n) {
		super("Number can’t be greater than ["+n+"]");
	}
}
