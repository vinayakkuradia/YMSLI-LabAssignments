package assignment3.question2;

public class SalariedEmployee extends Employee {
	double noOfWorkingWeeks=1;
	static employeeCategory category = assignment3.question2.employeeCategory.Salaried;
	
	SalariedEmployee(String nameOfEmployee, double rateOfSalary) {
		super(nameOfEmployee, rateOfSalary, category);
	}

	double getNoOfWorkingWeeks() {
		return noOfWorkingWeeks;
	}

	void setNoOfWorkingWeeks(double noOfWorkingWeeks) {
		this.noOfWorkingWeeks = noOfWorkingWeeks;
	}
}
