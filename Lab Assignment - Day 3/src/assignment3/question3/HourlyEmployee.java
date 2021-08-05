package assignment3.question3;

public class HourlyEmployee extends Employee {
	double noOfWorkingHours;
	
	HourlyEmployee(double salary, double noOfWorkingHours) {
		super(salary);
		this.noOfWorkingHours = noOfWorkingHours;
	}
	
	@Override
	double getSalary() {
		return salary*noOfWorkingHours;
	}

	@Override
	void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		return 0;
	}


}
