package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysInBetween {
	public static void main(String[] args) {
		LocalDate firstdate = LocalDate.now();
		LocalDate seconddate = LocalDate.parse("2024-01-01");
		long days = ChronoUnit.DAYS.between(seconddate,firstdate); 
		System.out.println("First date " + firstdate + " Second date "+seconddate+ "Days in between: "+ days);
	}
}
