package Day15;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task7_TimezoneConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the time
        System.out.println("Enter the time in format (yyyy-MM-dd HH:mm): ");
        String timeString = scanner.nextLine();

        // Input the source timezone
        System.out.println("Enter the source timezone (e.g., America/New_York): ");
        String sourceTimeZone = scanner.nextLine();

        // Input the destination timezone
        System.out.println("Enter the destination timezone (e.g., Europe/London): ");
        String destinationTimeZone = scanner.nextLine();

        // Convert the time
        String convertedTime = convertTimezone(timeString, sourceTimeZone, destinationTimeZone);

        // Output the converted time
        System.out.println("Converted time: " + convertedTime);
    }

    public static String convertTimezone(String time, String source, String destination) {
        // Parse the input time string
        LocalDateTime localDateTime = LocalDateTime.parse(time, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        // Convert the local time to the source time zone
        ZonedDateTime sourcetime = localDateTime.atZone(ZoneId.of(source));

        // Convert the source time zone to the destination time zone
        ZonedDateTime destinationtime = sourcetime.withZoneSameInstant(ZoneId.of(destination));

        // Format the converted time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm z");
        return destinationtime.format(formatter);
    }
    
//    Enter the time in format (yyyy-MM-dd HH:mm): 
//    	2024-07-18 14:00
//    	Enter the source timezone (e.g., America/New_York): 
//    	America/New_York
//    	Enter the destination timezone (e.g., Europe/London): 
//    	Europe/London


}
