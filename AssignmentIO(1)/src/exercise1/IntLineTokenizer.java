package exercise1;
import java.util.StringTokenizer;
import java.util.Scanner;

/*
 * Write a Java program that reads a line of integers and then
 * displays each integer and the sum of all integers. (Use StringTokenizer class)?
 */

public class IntLineTokenizer {

	public static void main(String[] args) {
				Scanner scannerObj = new Scanner(System.in);
				String inputIntLine = scannerObj.nextLine(); scannerObj.close();
				StringTokenizer tokenizerObj = new StringTokenizer(inputIntLine);
				int sum=0;
				
				System.out.println("The entered numbers are: ");
				while(tokenizerObj.hasMoreTokens()) {
					String integerInStr = tokenizerObj.nextToken();
					try {
						sum+=Integer.parseInt(integerInStr);
					}
					catch (NumberFormatException numberFormatException) {
						System.out.print("Invalid input: ");
					}
					System.out.print(integerInStr);
					if(tokenizerObj.hasMoreTokens())
						System.out.print(", ");
				}
				
				System.out.println("\nThe sum of numbers is: "+sum);
	}

}
