package sessionserial.dateclasses;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateImplementation {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		DateTimeFormatter indianFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Indian Format: "+ today.format(indianFormat));
		
		long duration = ChronoUnit.MONTHS.between(LocalDate.of(2020, 8, 13), today);
		System.out.println(duration);
		
		Period period = Period.between(LocalDate.of(2020, 8, 13), today);
		System.out.println(period);
	}

}
