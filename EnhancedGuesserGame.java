import java.util.Random;
import java.util.Scanner;

public class EnhancedGuesserGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("Welcome to the Enhanced Guesser Game!");
        System.out.println("Choose a game mode:");
        System.out.println("1. Single Player");
        System.out.println("2. Two Players");
        int gameMode = scanner.nextInt();
        
        if (gameMode == 1) {
            // Single player mode
            playSinglePlayerGame(scanner, random);
        } else if (gameMode == 2) {
            // Two players mode
            playTwoPlayersGame(scanner);
        } else {
            System.out.println("Invalid game mode. Please choose 1 or 2.");
        }
    }

    // Single player game mode
    public static void playSinglePlayerGame(Scanner scanner, Random random) {
        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;

        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations! You've guessed the number in " + numberOfTries + " tries.");
                break;
            }
        }
    }

    // Two players game mode
    public static void playTwoPlayersGame(Scanner scanner) {
        System.out.println("Player 1, enter a number for Player 2 to guess: ");
        int numberToGuess = scanner.nextInt();
        int numberOfTries = 0;

        System.out.println("Player 2, try to guess the number!");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < numberToGuess) {
                System.out.println("Try a higher number.");
            } else if (userGuess > numberToGuess) {
                System.out.println("Try a lower number.");
            } else {
                System.out.println("Congratulations, Player 2! You've guessed the number in " + numberOfTries + " tries.");
                break;
            }
        }
    }
}
