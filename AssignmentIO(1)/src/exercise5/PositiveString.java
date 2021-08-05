package exercise5;
import java.util.Arrays;

public class PositiveString {

	public static boolean PSChecker(String string) {
	char [] characterArray =  string.toLowerCase().toCharArray();
	Arrays.sort(characterArray);
	return string.toLowerCase().equals(new String(characterArray));
	}
	
	public static void main(String[] args) {
		System.out.println(PSChecker("ANT"));
		System.out.println(PSChecker("ATN"));
	}

}
