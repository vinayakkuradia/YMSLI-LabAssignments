package assignment4.question7;
import assignment4.question6.InputException;
import java.io.IOException;
public class ThrowEx {
	
	public static void throwException() throws InputException, IOException {
		int n=0;
		if(n%2==0)
			throw new InputException(100);
		else
			throw new IOException();
	}
	
	public static void main(String[] args) {
		try {
			throwException();
		} catch (InputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
