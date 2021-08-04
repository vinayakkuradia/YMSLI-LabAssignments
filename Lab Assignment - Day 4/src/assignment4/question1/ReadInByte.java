package assignment4.question1;
import java.io.FileInputStream;
import java.io.File;


public class ReadInByte {

	public static void main(String[] args) {
		try {
			
			FileInputStream fileInputStream  = new FileInputStream(new File("file.txt"));
			byte[] byteArray = fileInputStream.readAllBytes();
			System.out.println("Data in byte format: ");
			for (byte eachByte: byteArray) {
				System.out.print(eachByte + " ");
			}
		} catch (Exception e) {
			System.out.println("Error occurred: "+e.getMessage());
		}

	}

}
