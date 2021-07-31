package assignment3.question1;

public class HourlyEmployee extends Employee {
	double noOfWorkingHours=1;
	static employeeCategory category = assignment3.question1.employeeCategory.Hourly;

	HourlyEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}
	
	double getNoOfWorkingHours() {
		return noOfWorkingHours;
	}

	void setNoOfWorkingHours(double noOfWorkingHours) {
		this.noOfWorkingHours = noOfWorkingHours;
	}

	public double weeklySalaryCalculator() {
		return getNoOfWorkingHours()*getRateOfSalary();
	}
	
	public void displayEmployeeDetails() {
		System.out.println(getNameOfEmployee()+" - "+getEmployeeCategory()+" - "+weeklySalaryCalculator()+" - "+getRateOfSalaryReadable()+" - "+getNoOfWorkingHours());
	}
}
