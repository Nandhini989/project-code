import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String userChoice = "rock";  // Change this to "paper" or "scissors" as needed
        String[] options = {"rock", "paper", "scissors"};

        Random rand = new Random();
        String computerChoice = options[rand.nextInt(3)];

        System.out.println("User chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("You win!");
        } else if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Invalid user choice.");
        }
    }
}