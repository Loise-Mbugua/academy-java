package com.bptn.course._05_strings;
// Import the Scanner class for user input
import java.util.Scanner; 

public class StringOperations {

    // You have to reverse the string outside main method, reversing the string method as follows
    private static String reverseString(String input) {
        String reversed = ""; // Initialize a string for the reversed
        for (int i = input.length() - 1; i >= 0; i--) { // repeat using for loop
            reversed += input.charAt(i); // Add each character to the reversed string
        }
        return reversed; // Return the reversed string
    }

    public static void main(String[] args) {
        int choice; // Declare a variable for user choice

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in); 

        do {
            // Print menu options
            System.out.println("String Menu");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings");
            System.out.println("Press 4 for String Comparison");
            System.out.println("Press 5 to Calculate the Length of a String");
            System.out.println("Press 0 to Exit");
            System.out.print("Enter your option: ");

            choice = scanner.nextInt(); // Read user input
            scanner.nextLine(); // ignore the new line

            // Checking user input for choice using if-else
            if (choice == 1) { // Palindrome Check
                System.out.print("Enter a string: ");
                String palindromeInput = scanner.nextLine(); // Read input
                String reversedPalindrome = reverseString(palindromeInput); // Reversing the string
                // Checking if it's a palindrome
                if (palindromeInput.equals(reversedPalindrome)) {
                    System.out.println(palindromeInput + " is a palindrome.");
                } else {
                    System.out.println(palindromeInput + " is not a palindrome.");
                }

            } else if (choice == 2) { // Reverse a String
                System.out.print("Enter a string: ");
                String stringToReverse = scanner.nextLine(); // Read input
                String reversedString = reverseString(stringToReverse); // Reversing the string
                System.out.println("Reversed string: " + reversedString); // Print the result

            } else if (choice == 3) { // Concatenate two Strings
                System.out.print("Enter First string: ");
                String firstString = scanner.nextLine(); // Read first input
                System.out.print("Enter Second string: ");
                String secondString = scanner.nextLine(); // Read second input
                // Concatenate strings
                String concatenatedString = firstString + secondString;
                System.out.println("Concatenated string: " + concatenatedString); // Print result

            } else if (choice == 4) { // String Comparison
                System.out.print("Enter First string: ");
                String compareString1 = scanner.nextLine(); // Read first string
                System.out.print("Enter Second string: ");
                String compareString2 = scanner.nextLine(); // Read second string
                // Comparing the strings
                if (compareString1.equals(compareString2)) {
                    System.out.println("The entered strings are equal.");
                } else {
                    System.out.println("The entered strings are not equal.");
                }

            } else if (choice == 5) { // Calculate Length of String
                System.out.print("Enter a string: ");
                String lengthInput = scanner.nextLine(); // Read input
                // Output the length of the string
                System.out.println("The length of the entered string is: " + lengthInput.length());

            } else if (choice == 0) { // leve the program
                System.out.println("Exiting the program.");

            } else { // errors due to invlid choice
                System.out.println("Invalid choice! Please make a valid choice."); // Print for errors
            }

        } while (choice != 0); // Repeat until the user chooses to exit the loop

        scanner.close(); // Close the scanner
    }
}
