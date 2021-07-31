package assignment3.question2;

enum employeeCategory {Salaried, Hourly, Comission};

public abstract class Employee {
	double salary;
	String nameOfEmployee;
	employeeCategory employeeCategory;
	
	Employee(String nameOfEmployee, double salary, employeeCategory employeeCategory) {
		this.nameOfEmployee = nameOfEmployee;
		this.salary = salary;
		this.employeeCategory = employeeCategory; 
	}
	
	//public abstract double getSalary();
	//public abstract void setSalary(double salary);
	
	
	String getNameOfEmployee() {
		return nameOfEmployee;
	}

	employeeCategory getEmployeeCategory() {
		return employeeCategory;
	}
}
