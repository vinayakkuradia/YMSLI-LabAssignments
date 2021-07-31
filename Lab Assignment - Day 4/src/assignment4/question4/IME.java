package assignment4.question4;
import java.util.Scanner;
import java.util.InputMismatchException;

public class IME {
	private static int n=0;
	static Scanner sc = new Scanner(System.in);
	
	public static void EvenOdd() {
		
		while(n!=-1) {
			System.out.println("Please enter a number or enter ‘-1’ if you want to quit");
			try {
				n = sc.nextInt();
				
				if(n==-1) 
					continue;
				else if(n%2==0)
					System.out.println("You have entered an even number\n");
				else
					System.out.println("You have entered an odd number\n");
			
		}catch (InputMismatchException e) {
			System.out.println("You must enter an integer.\n");
			sc.nextLine();
			continue;
		}
		}
		
	}

	public static void main(String[] args) {
		EvenOdd();
	}
		

}
