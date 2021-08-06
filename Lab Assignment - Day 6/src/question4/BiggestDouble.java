package question4;
import java.io.*;
import java.util.Scanner;

public class BiggestDouble {

	public static double biggestFinder1(String fileName) {
		double biggest=-1;
		try {
			BufferedReader reader = new BufferedReader(new FileReader(new File("data.txt")));
			String line=null;
			while((line=reader.readLine())!=null) {
				if(biggest<Double.parseDouble(line))
					biggest = Double.parseDouble(line);
			}
			reader.close();
			return biggest;
		} catch (FileNotFoundException e) {
			System.out.println("Exception occurred: " + e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
		return biggest;
	}
	
	public static double biggestFinder2(String fileName) {
		double biggest=-1, tempStore=0;
		Scanner scannerObj;
		try {
			scannerObj = new Scanner(new File(fileName));
			while(scannerObj.hasNextDouble()) {
				tempStore = scannerObj.nextDouble();
				if(biggest<tempStore)
					biggest = tempStore;
			}
			scannerObj.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return biggest;
	}
	
	public static void main(String[] args) {
		System.out.println("The biggest double: "+biggestFinder1("data.txt"));
		System.out.println("The biggest double: "+biggestFinder2("data.txt"));
	}

}
