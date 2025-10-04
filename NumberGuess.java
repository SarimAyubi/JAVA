import java.util.Scanner;
import java.util.Random;
public class NumberGuess {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            Random random = new Random();

            int number = random.nextInt(50) + 1;
            int guess;
            int attempts = 0;

            System.out.println("Welcome to the Number Guessing Game!");

            while (true) {
                System.out.print("\nEnter your guess: ");
                guess = input.nextInt();
                attempts++;

                if (guess == number) {
                    System.out.println("Correct! You guessed it in " + attempts + " attempts.");
                    break;
                } else if (guess < number) {
                    System.out.println("Too low!");
                } else {
                    System.out.println("Too high!");
                }
            }

            input.close();
        }
    }
