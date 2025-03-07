import java.time.LocalDate;

public class DateArithmeticExample {
    public static void main(String[] args) {
        // Input date
        LocalDate inputDate = LocalDate.of(2023, 3, 7); // You can modify this date
        
        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = inputDate.plusDays(7)
                                     .plusMonths(1)
                                     .plusYears(2);
        
        // Subtract 3 weeks
        LocalDate finalDate = newDate.minusWeeks(3);

        // Display the result
        System.out.println("Original Date: " + inputDate);
        System.out.println("New Date after adding 7 days, 1 month, and 2 years: " + newDate);
        System.out.println("Final Date after subtracting 3 weeks: " + finalDate);
    }
}
