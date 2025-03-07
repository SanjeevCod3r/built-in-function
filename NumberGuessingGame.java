import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1, high = 100;
        int guess;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100. I will try to guess it.");

        while (!feedback.equals("correct")) {
            guess = random.nextInt(high - low + 1) + low;
            System.out.println("Is the number " + guess + "? (high/low/correct)");
            feedback = scanner.nextLine().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }

        System.out.println("Yay! I guessed your number correctly.");
        scanner.close();
    }
}
