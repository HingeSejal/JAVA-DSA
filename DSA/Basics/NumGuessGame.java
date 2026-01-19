package DSA.Basics;

import java.util.Random;
import java.util.Scanner;

public class NumGuessGame {
        public static void main(String[] args) {
        // Create random number between 1 and 100
        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1; // Random number from 1 to 100

        Scanner scanner = new Scanner(System.in);
        int guess;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100:");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess) {
                System.out.println("Too low! Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " tries.");
            }

        } while (guess != numberToGuess);

        scanner.close();
    }
}

