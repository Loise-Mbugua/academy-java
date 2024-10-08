package com.bptn.course._05_strings;

import java.util.Scanner;

public class PluralForm {
    public static void main(String[] args) {
       // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        
        // Get the amount and word from the user input
        System.out.print("Enter the amount: ");
        int amt = scanner.nextInt(); // Read an integer input for amount
        scanner.nextLine(); 
        System.out.print("Enter the word: ");
        String word = scanner.nextLine(); // Read a string for word from user input

        // Check if amount is 1
        if (amt == 1) {
            System.out.println(amt + " " + word); // Print the output for singular form of the word
        } else {
            // Declare the plural of the word
            String pluralWord;

            // Check to see if the word ends with "fe"
            if (word.endsWith("fe")) {
                pluralWord = word.substring(0, word.length() - 2) + "ves"; // Example: "knife" becomes "knives"
            }
            // Check if word ends with "y" (not preceded by a vowel)
            else if (word.endsWith("y") && !(word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy"))) {
                // if this is true replace "y" with "ies"
                pluralWord = word.substring(0, word.length() - 1) + "ies"; // print output
            }
            // Check to see if the word ends with "sh" or "ch"
            else if (word.endsWith("sh") || word.endsWith("ch")) {
                // if  true, then add "es" to the end
                pluralWord = word + "es"; // Print output
            }
            // Check to see if the word ends with "us"
            else if (word.endsWith("us")) {
                // if true, replace "us" with "i"
                pluralWord = word.substring(0, word.length() - 2) + "i"; // Print output
            }
            // Check for special cases that end with "ay", "oy", "ey", or "uy"
            else if (word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy")) {
                // if that is the case, just add "s"
                pluralWord = word + "s"; // Example: "boy" becomes "boys"
            } else {
                // For all other scenarios, just add "s"
                pluralWord = word + "s"; // Print output
            }

            // Print the amount and the plural word
            System.out.println(amt + " " + pluralWord); // Expected output: 4 knives
        }

        // Close the scanner
        scanner.close();
    }

}