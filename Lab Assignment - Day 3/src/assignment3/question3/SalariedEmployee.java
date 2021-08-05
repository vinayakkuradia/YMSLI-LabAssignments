package assignment3.question3;

public class SalariedEmployee extends Employee {
	
	SalariedEmployee(double salary) {
		super(salary);
	}
	
	@Override
	double getSalary() {
		return salary;
	}

	@Override
	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getPayment() {
		System.out.println("Rate of Salary: "+salary+" Total Salary: ");	
		return 0;
	}
}
