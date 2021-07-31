package assignment3.question1;

enum employeeCategory {Salaried, Hourly, Comission};

public abstract class Employee {
	String nameOfEmployee;
	double rateOfSalary;
	employeeCategory employeeCategory;
	
	Employee(String nameOfEmployee, double rateOfSalary, employeeCategory employeeCategory) {
		this.nameOfEmployee = nameOfEmployee;
		this.rateOfSalary = rateOfSalary;
		this.employeeCategory = employeeCategory; 
	}
	
	public abstract double weeklySalaryCalculator();
	public abstract void displayEmployeeDetails();

	double getRateOfSalary() {
		return rateOfSalary;
	}
	
	void setRateOfSalary(double rateOfSalary) {
		this.rateOfSalary = rateOfSalary;
	}
	
	String getRateOfSalaryReadable() {
		if (employeeCategory==assignment3.question1.employeeCategory.Salaried)
			return rateOfSalary+"/week";
		else if (employeeCategory==assignment3.question1.employeeCategory.Hourly)
			return rateOfSalary+"/hour";
		else
			return rateOfSalary+"%";
	}
	
	String getNameOfEmployee() {
		return nameOfEmployee;
	}

	employeeCategory getEmployeeCategory() {
		return employeeCategory;
	}
}
