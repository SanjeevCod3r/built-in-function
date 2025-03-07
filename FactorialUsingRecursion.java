import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("The factorial of " + number + " is " + factorial(number));

        scanner.close();
    }

    public static int factorial(int number) {
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }
}
