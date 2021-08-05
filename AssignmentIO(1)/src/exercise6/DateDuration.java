package exercise6;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class DateDuration {
	
	public static void calculateDuration(String date) {
		LocalDate dateObject = LocalDate.parse(date);
		Period period = Period.between(dateObject, LocalDate.now());
		int d=period.getDays(), m=period.getMonths(), y=period.getYears();
		if(period.getDays()<0||period.getMonths()<0||period.getYears()<0)
			System.out.println(-d+" days "+-m+" months "+-y+" years to go");
		else
			System.out.println(d+" days "+m+" months "+y+" years back");
	}

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter date one (YYYY-MM-DD): ");
		try {
			calculateDuration(scannerObject.next());
		}
		catch(DateTimeParseException exc) {
			System.out.println("Invalid Date!");
		}
		finally {
			scannerObject.close();
		}
	}

}
