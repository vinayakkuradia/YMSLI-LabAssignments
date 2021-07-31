package assignment3.question1;

public class CommissionEmployee extends Employee {
	double totalWeeklySale=0;
	static employeeCategory category = assignment3.question1.employeeCategory.Comission;
	
	public CommissionEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}

	double getTotalWeeklySale() {
		return totalWeeklySale;
	}

	void setTotalWeeklySale(double totalWeeklySale) {
		this.totalWeeklySale = totalWeeklySale;
	}

	public double weeklySalaryCalculator() {
		return (getTotalWeeklySale()*getRateOfSalary()/100);
	}
	
	public void displayEmployeeDetails() {
		System.out.println(getNameOfEmployee()+" - "+getEmployeeCategory()+" - "+weeklySalaryCalculator()+" - "+getRateOfSalaryReadable()+" - "+getTotalWeeklySale());
	}
}
