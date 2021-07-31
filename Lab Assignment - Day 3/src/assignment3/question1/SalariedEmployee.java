package assignment3.question1;

public class SalariedEmployee extends Employee {
	double noOfWorkingWeeks=1;
	static employeeCategory category = assignment3.question1.employeeCategory.Salaried;
	
	SalariedEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}

	double getNoOfWorkingWeeks() {
		return noOfWorkingWeeks;
	}

	void setNoOfWorkingWeeks(double noOfWorkingWeeks) {
		this.noOfWorkingWeeks = noOfWorkingWeeks;
	}
	
	public double weeklySalaryCalculator() {
		return getNoOfWorkingWeeks()*getRateOfSalary();
	}
	
	public void displayEmployeeDetails() {
		System.out.println(getNameOfEmployee()+" - "+getEmployeeCategory()+" - "+weeklySalaryCalculator()+" - "+getRateOfSalaryReadable()+" - "+getNoOfWorkingWeeks());
	}
}
