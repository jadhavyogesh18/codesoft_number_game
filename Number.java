import java.util.Random;
import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 5;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to the Number Game!");
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("A random number between " + minRange + " and " + maxRange + " has been generated.");
            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.println("Attempt #" + attempt + " - Enter your Number:");
                int userGuess = scanner.nextInt();
                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number.");
                    score += attempts - attempt + 1;
                    break;
                } else if (userGuess < randomNumber) {
                    System.out.println("Your guess is too low.");
                } else {
                    System.out.println("Your guess is too high.");
                }
                if (attempt == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                }
            }
            System.out.println("Your current score: " + score);
            System.out.println("Do you want to play again? (yes/no)");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }
        System.out.println("Thank you for playing the Number Guessing Game!");
        scanner.close();
    }
}
