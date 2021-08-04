package assignment4.question2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.FileWriter;

public class CharBufferRW {

	public static String readInput() {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			return bufferedReader.readLine();
			
		} catch (Exception exc) {
			System.out.println("Error occurred: "+exc.getMessage());
		}
		return null;
	}
	
	public static void writeFile(String fileName, String fileData) {
		try {
			FileWriter fileWriter = new FileWriter(fileName);
			BufferedWriter b = new BufferedWriter(fileWriter);
			b.write(fileData);
			b.close();
		} catch (Exception exc) {
			System.out.println("Error occurred: "+exc.getMessage());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter your input: ");
		String inputFromUser = readInput();
		System.out.println("Your input is: \n"+inputFromUser);
		
		writeFile("myfile.txt", inputFromUser);
	}

}
