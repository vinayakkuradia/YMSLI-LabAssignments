package assignment3.question3;

import java.util.Scanner;

public class Application {
	private static Employee employeeList[] = new Employee[10];
	private static int employeeCount = -1;
	private static boolean exit=false;

	public static void menu(Scanner scannerObject) {
		System.out.println("Please select an option: 1.New Employee   2.Existing   0.Exit");
		switch (scannerObject.nextInt()) {
		case 0:
			exit=true;
			break;
		case 1:
			if (employeeCount < employeeList.length) {
				System.out.println("Choose category: 1.Salaried   2.Hourly  3.Comision");
				switch (scannerObject.nextInt()) {
				case 1:
					System.out.println("Enter salary: ");
					employeeList[++employeeCount] = new SalariedEmployee(scannerObject.nextDouble());
					System.out.println("Empolyee No. is: " + employeeCount);
					break;
				case 2:
					System.out.println("Enter hourly salary and no. of working hours:");
					employeeList[++employeeCount] = new HourlyEmployee(scannerObject.nextDouble(),
							scannerObject.nextDouble());
					System.out.println("Empolyee No. is: " + employeeCount);
					break;
				case 3:
					System.out.println("Enter percent share of sale and total sales value: ");
					employeeList[++employeeCount] = new CommissionEmployee(scannerObject.nextDouble(),
							scannerObject.nextDouble());
					System.out.println("Empolyee No. is: " + employeeCount);
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			} else
				System.out.println("Records space full");
			break;

		case 2:
			System.out.println("Enter employee no.: ");
			int empNum = scannerObject.nextInt();
			Employee empTemp = employeeList[empNum];
			if (empNum <= employeeCount) {
				System.out.println("Select option: 1.Set Salary 2.Get Salary 3.Increase Salary");
				switch (scannerObject.nextInt()) {
				case 1:
					System.out.println("Enter new salary: ");
					empTemp.setSalary(scannerObject.nextDouble());
					break;
				case 2:
					System.out.print("Salary: ");
					System.out.print(empTemp.getSalary());
					break;
				case 3:
					System.out.println("Enter percent increase: ");
					empTemp.increaseSalary(scannerObject.nextDouble());
				default:
					break;
				}
			} else
				System.out.println("No recoed found");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scannerObject = new Scanner(System.in);
		while(!exit) {
			menu(scannerObject);
		}

	}
}