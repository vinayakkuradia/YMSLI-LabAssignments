package assignment3.question3;

public class CommissionEmployee extends Employee {
	double totalSales;
	
	public CommissionEmployee(double salary, double totalSales) {
		super(salary);
		this.totalSales = totalSales;
	}

	@Override
	double getSalary() {
		return salary/100*totalSales;
	}

	@Override
	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getPayment() {
		System.out.println();
		return 0;
	}
}
