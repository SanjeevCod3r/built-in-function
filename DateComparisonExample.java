import java.time.LocalDate;
import java.util.Scanner;

public class DateComparisonExample {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Input first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateInput = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateInput);

        // Input second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateInput = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateInput);

        // Compare dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("First date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("First date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("Both dates are the same.");
        }
    }
}
