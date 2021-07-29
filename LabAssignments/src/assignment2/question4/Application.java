package assignment2.question4;
import java.util.Scanner;

public class Application {
	
	static int studentArrayIndex = -1, arrayMaxLimit=5;
	static Student [] studentArray = new Student[arrayMaxLimit];
	
	
	static Scanner sc = new Scanner(System.in);
	static boolean run =true;
	
	public static void createStudentObject(Scanner sc) {
		boolean addSuccess=false;
		if(studentArrayIndex<arrayMaxLimit-1) {
			System.out.println("Please selet details you wish to enter:\n1.Id  2.Id, Name  3.Id, Name, Grade");
			
			switch(sc.nextInt()) {
				case 1:
					System.out.println("Enter Id: ");
					studentArray[++studentArrayIndex] = new Student(sc.next());
					addSuccess=true;
					break;
				case 2:
					System.out.println("Enter Id, Name (without spaces), (respectively): ");
					studentArray[++studentArrayIndex] = new Student(sc.next(), sc.next());
					addSuccess=true;
					break;
				case 3:
					System.out.println("Enter Id, Name (without spaces), Grade (respectively): ");
					studentArray[++studentArrayIndex] = new Student(sc.next(), sc.next(), sc.nextDouble());
					addSuccess=true;
					break;
				default:
					System.out.println("Invalid choice!");
					break;
			}
			
			if(addSuccess) {
				System.out.println("Record successfully added!");
			}
			else
				System.out.println("Something went wrong!");
		}
		
		else
			System.out.println("Sorry, Not enough space to add records!");
	}
	
	public static void displayStudentsList(Scanner sc) {
		System.out.println("Please enter id: ");
		String id = sc.next(); int i;
		boolean available=false;
		
		for(i=0; i<=studentArrayIndex; i++) {
			if(id.equals(studentArray[i].getId())) {
				available=true;
				break;
			}
		}
		
		if(available) {
			System.out.println("Enter the year (Enter 0 to skip):");
			int year = sc.nextInt();
			
			if(year==0) 
				studentArray[i].display();
			else
				studentArray[i].display(year);
		}
		else
			System.out.println("No records found!");
		
	}
	
	public static void selectionProcessor(int selection, Scanner sc) {
			if(selection==1) {
				createStudentObject(sc);
			}
			else if(selection==2) {
				displayStudentsList(sc);
			}
			else if(selection==0) 
				run=false;
			else 
				System.out.println("Wrong input!");
	}
	
	public static void main(String[] args) {
		
		while(run) {
			System.out.println("Please select an option:\n1.Create Student Profile   2.Display Student Info   0.Exit");
			int selection = sc.nextInt();
			selectionProcessor(selection, sc);
		}
		sc.close();
		System.out.println("Exit!");
	}

}
