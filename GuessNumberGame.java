import java.util.Random;
import java.util.Scanner;

class Game {
    private int targetNumber;
    private int userGuess;
    private int attempts = 0;

    // Method to generate random number
    public void generateNumber() {
        Random random = new Random();
        targetNumber = random.nextInt(100); 
    }

      // Method to get user input using do-while
    public void getUserInput() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Guess the number: ");
            userGuess = sc.nextInt();
            attempts++;

            if (targetNumber > userGuess) {
                System.out.println("Think of a bigger number!");
            } else if (targetNumber < userGuess) {
                System.out.println("Think of a smaller number!");
            }
        } while (targetNumber != userGuess);

        sc.close();
    }

    
    public void isCorrectNumber() {
        System.out.println("Correct Guess! The number was " + targetNumber);
    }


    public void numberOfGuesses() {
        System.out.println("Total number of guesses: " + attempts);

        if (attempts <= 3) {
            System.out.println("Pro Player!");
        } else if (attempts <= 6) {
            System.out.println("Good Player!");
        } else {
            System.out.println("Nice try, but can do better.");
        }
    }
}

public class GuessNumberGame {
    public static void main(String[] args) {
        Game player = new Game();
        player.generateNumber();
        player.getUserInput();
        player.isCorrectNumber();
        player.numberOfGuesses();
    }
}
