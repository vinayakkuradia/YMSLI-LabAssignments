package assignment3.question3;

public abstract class Employee implements Payable {
	double salary;
	
	Employee(double salary) {
		this.salary = salary;
	}

	abstract double getSalary();
	abstract void setSalary(double salary);
	
	void increaseSalary(double percentRaise) {
		this.salary = salary * percentRaise /100;
	}
}
