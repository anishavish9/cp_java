/*
 *Task 6: Java 8 Date and Time API
	Write a program that calculates the number of days between two dates input 
	by the user."
 */

package Day15;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task6_Java8DateandTimeAPI {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the two date dates : ");
		String d1 = scan.next();
		String d2 = scan.next();
		LocalDate firstdate = LocalDate.parse(d1); //2024-07-18 -  2024-01-01
		LocalDate seconddate = LocalDate.parse(d2); 
		long days = ChronoUnit.DAYS.between(firstdate, seconddate); 
		System.out.println("First date " + firstdate + " Second date "+seconddate+ " \nDays in between: "+ days);
	}
}
