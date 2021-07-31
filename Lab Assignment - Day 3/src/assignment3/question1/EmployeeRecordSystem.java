package assignment3.question1;

public class EmployeeRecordSystem {
	static int maxArrayCapacity=10;
	
	public static void main(String[] args) {
		
		Employee [] employeeArray = new Employee[maxArrayCapacity];
		employeeArray[0] = new SalariedEmployee("Vinayak Kuradia", 20000);
		employeeArray[0].displayEmployeeDetails();
		((SalariedEmployee) employeeArray[0]).setNoOfWorkingWeeks(5.5);
		employeeArray[0].displayEmployeeDetails();
	}

}
