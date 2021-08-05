package exercise4;
import java.io.File;
import java.util.Scanner;

public class FileInfo {

	static String status(boolean state) {
		return (state ? "Yes" : "No");
	}
	
	static String extensionExtractor(String fileName) {
		int indexOfDot = fileName.indexOf('.');
		if(indexOfDot>-1) {
			return fileName.substring(indexOfDot+1);
		}
		return "Unidentified";
	}
	
	static void checkFileInfo(String fileName) {
		File file = new File(fileName);
		System.out.println("-----File Information-----");
		System.out.println("Exist Condition: "+ status(file.exists()));
		if(file.exists()) {
			System.out.println("Read Permission: "+ status(file.canRead()));
			System.out.println("Write Permission: "+ status(file.canWrite()));
			System.out.println("Type: "+ extensionExtractor(fileName));
			System.out.println("length(in bytes): "+ file.length());
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter file name: ");
		Scanner scannerObject = new Scanner(System.in);
		checkFileInfo(scannerObject.next());
		scannerObject.close();
	}

}
