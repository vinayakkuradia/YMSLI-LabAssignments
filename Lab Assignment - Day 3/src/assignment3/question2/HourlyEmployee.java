package assignment3.question2;

public class HourlyEmployee extends Employee {
	double noOfWorkingHours=1;
	static employeeCategory category = assignment3.question2.employeeCategory.Hourly;

	HourlyEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}
	
	double getNoOfWorkingHours() {
		return noOfWorkingHours;
	}

	void setNoOfWorkingHours(double noOfWorkingHours) {
		this.noOfWorkingHours = noOfWorkingHours;
	}

}
