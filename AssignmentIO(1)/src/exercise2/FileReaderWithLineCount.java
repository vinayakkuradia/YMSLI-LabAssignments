package exercise2;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Write a Java program that reads a file and displays the file on the screen,
 * with a line number before each line?
 */

public class FileReaderWithLineCount {

	
	public static void readFileWithLineCount(String fileName) {
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));
			int lineCount = 1;
			
			String line;
			while((line = bufferedReader.readLine()) != null)
				System.out.println(lineCount++ + ": " +line);
			
			bufferedReader.close();
		} catch (Exception exc) {
			System.out.println("Exception occurred: "+exc.getLocalizedMessage());
		}
	}
	
	public static void readFileWithLineCount2(String fileName) {
		try {
			Scanner scanner = new Scanner(new FileReader(new File(fileName)));
			int lineCount = 1;

			while(scanner.hasNextLine())
				System.out.println(lineCount++ + ": " +scanner.nextLine());
			
			scanner.close();
		} catch (Exception exc) {
			System.out.println("Exception occurred: "+exc.getLocalizedMessage());
		}
	}
	
	public static void main(String[] args) {
		readFileWithLineCount("file.txt");
		//readFileWithLineCount2("file.txt");
	}

}
