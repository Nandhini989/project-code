import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("Welcome to the Guess the Number Game!");

        while (playAgain) {
            int secretNumber = random.nextInt(100) + 1; // Generate a number between 1 and 100
            int guess = 0;
            int attempts = 0;

            System.out.println("\nI have selected a number between 1 and 100. Try to guess it!");

            while (guess != secretNumber) {
                System.out.print("Enter your guess: ");

                // Validate user input
                if (!scanner.hasNextInt()) {
                    System.out.println("Invalid input! Please enter a number.");
                    scanner.next(); // Clear the invalid input
                    continue;
                }

                guess = scanner.nextInt();
                attempts++;

                if (guess < secretNumber) {
                    System.out.println("Too low! Try again.");
                } else if (guess > secretNumber) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
                }
            }

            // Ask if the player wants to play again
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next().toLowerCase();

            if (!response.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thank you for playing! Goodbye.");
        scanner.close();
    }
}