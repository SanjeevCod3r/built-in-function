import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class TimeZoneExample {
    public static void main(String[] args) {
        // Get current time in different time zones
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        // Define a standard date-time formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        // Display the current time in different time zones
        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}
