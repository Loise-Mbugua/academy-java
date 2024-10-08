package com.bptn.course._05_strings;

import java.util.Scanner;

public class WordEncryption {

    public static void main(String[] args) {
        
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a word
        System.out.print("Please enter a word to encrypt: ");
        String word = scanner.nextLine(); // Read the user input 
        
        // Initialize a string for encrypted word
        String encryptedWord = ""; 

        // use for Loop to go through each character in the word
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i); // read the user input to get the character
            
            // See if the character a lowercase
            if (character >= 'a' && character <= 'z') {
                // If it's 'z', return to 'a';
                if (character == 'z') {
                    character = 'a';
                } else {
                    character = (char) (character + 1);
                }
            } 
            // See if character is an uppercase 
            else if (character >= 'A' && character <= 'Z') {
                // If it's 'Z', return to 'A'; otherwise continue with the loop
                if (character == 'Z') {
                    character = 'A';
                } else {
                    character = (char) (character + 1);
                }
            }
            // Concatenate the shifted character to the encrypted word
            encryptedWord += character; 
        }
        
        // Print encrypted word
        System.out.println("Encrypted word: " + encryptedWord);
        
        // Close scanner
        scanner.close(); 
    }
}