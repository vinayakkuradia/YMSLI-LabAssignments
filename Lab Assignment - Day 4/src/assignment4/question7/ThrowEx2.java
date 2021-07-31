package assignment4.question7;
import assignment4.question6.InputException;
import java.io.IOException;
public class ThrowEx2 {
	
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
		} catch (InputException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

//One or Two catch blocks both are possible
//One if we want to catch and handle in a single catch block
//Two if we want to catch and handle them separately