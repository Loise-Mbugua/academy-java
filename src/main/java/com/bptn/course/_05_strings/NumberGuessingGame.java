package com.bptn.course._05_strings;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		
		   // Initialize target number to 23
        int targetNumber = 23;
        
        // Initialize guess to zero
        int guess = 0;
        
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Use while loop to tell user to guess until they guess correctly
        while (guess != targetNumber) {
            // prompt user to input their guess
            System.out.print("Enter your guess (between 1 and 100): ");//Display output
            
            // Read the user guess input
            guess = scanner.nextInt();
            
            // See is guess is less than 1 or greater than 100
            if (guess < 1 || guess > 100) {
                // Prompt user to input a number that satisfy the condition above
                System.out.println("Please enter a number between 1 and 100.");
            } 
            // Check if the  number guessed is too low
            else if (guess < targetNumber) {
                // Alert the user the number is low and to try again
                System.out.println("Too low! Try again."); //Display output
            } 
            // Check if the number guessed  is too high
            else if (guess > targetNumber) {
                // Alert the user the number is high and to try again
                System.out.println("Too high! Try again.");
            } 
            // If the guess is now correct
            else {
                // Congratulating the user for the correct guess
                System.out.println("Congratulations! You guessed the number correctly!");
            }
        }
        
        // Close the scanner to avoid memory leaks
        scanner.close();

	}

}
