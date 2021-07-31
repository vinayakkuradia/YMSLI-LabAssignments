package assignment3.question2;

public class CommissionEmployee extends Employee {
	double totalWeeklySale=0;
	static employeeCategory category = assignment3.question2.employeeCategory.Comission;
	
	public CommissionEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}

	public double getSalary(String a) {
		return 0;
	}
	
	public void setSalary(double salary) {
		
	}
	
	double getTotalWeeklySale() {
		return totalWeeklySale;
	}

	void setTotalWeeklySale(double totalWeeklySale) {
		this.totalWeeklySale = totalWeeklySale;
	}

	
	public void displayEmployeeDetails() {
		
	}
}
