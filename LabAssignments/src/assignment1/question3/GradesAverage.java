package assignment1.question3;
import java.util.Scanner;

public class GradesAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int numStudents=sc.nextInt();
		float sum=0f;
		int [] grades= new int[numStudents];
		
		for(int i=1; i<=numStudents; i++) {
			System.out.println("Enter the grade for student "+i+": ");
			int temp = sc.nextInt();
			if (temp>=0 && temp<=100) {
				grades[i-1] = temp;
				sum += temp;
			}
			else {
				System.out.println("Invalid grade, try again...");
				i--;
			}
		}
		sc.close();
		System.out.println("The average is:"+sum/numStudents);

	}
}
