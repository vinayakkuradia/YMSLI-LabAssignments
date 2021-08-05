package question2;
import java.util.Scanner;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
	}

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public Date(Date date) {
		this(date.day, date.month, date.year);
	}

	public void input() {
		System.out.println("Please enter date(one by one) (DD, MM, YYY): " );
		Scanner sc = new Scanner(System.in);
		this.day = sc.nextInt();
		this.month= sc.nextInt();
		this.year = sc.nextInt();
		sc.close();
	}

	public void print() {
		System.out.println("Day: "+day+", Month: "+month+"Year: "+year);
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

}
