package exercise7;

import java.util.Scanner;

public class UsernameValidation {

	public static boolean validateUsername(String username) {
		if(username.substring(username.length()-4).equals("_job")) {
			if(username.substring(0, username.length()-4).length()>=8)
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println("Please enter username: ");
		Scanner scannerObject = new Scanner(System.in);
		System.out.println(validateUsername(scannerObject.next()));
		scannerObject.close();
	}

}
