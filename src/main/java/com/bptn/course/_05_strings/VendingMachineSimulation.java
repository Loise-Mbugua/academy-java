package com.bptn.course._05_strings;

import java.util.Scanner;

public class VendingMachineSimulation {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Display the list of products with their prices
        System.out.println("Welcome to the Vending Machine!");
        System.out.println("Please choose a product:");
        System.out.println("1. Soda - $1.50");
        System.out.println("2. Chips - $1.00");
        System.out.println("3. Candy - $0.75");
        System.out.println("4. Water - $1.25");
        
        // Get the user's product choice
        System.out.print("Enter the number of your choice: ");
        int choice = scanner.nextInt();
        
        // Declare a variable to store the price of the selected product
        double price = 0;
        
        // Use a switch statement to determine the product price based on user input
        switch (choice) {
            case 1:
                price = 1.50;
                System.out.println("You chose Soda. The price is $1.50.");
                break;
            case 2:
                price = 1.00;
                System.out.println("You chose Chips. The price is $1.00.");
                break;
            case 3:
                price = 0.75;
                System.out.println("You chose Candy. The price is $0.75.");
                break;
            case 4:
                price = 1.25;
                System.out.println("You chose Water. The price is $1.25.");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                return; // Exit the program if the user enters an invalid choice
        }
        
        // Ask the user to input the amount they wish to pay
        System.out.print("Enter the amount you are paying: $");
        double amountPaid = scanner.nextDouble();
        
        // Check if the payment is sufficient
        if (amountPaid >= price) {
            // Calculate the change
            double change = amountPaid - price;
            System.out.printf("Thank you for your payment. Dispensing your product. Your change is $%.2f.%n", change);
        } else {
            // If the payment is insufficient, show a message
            System.out.println("Insufficient payment. Please try again or cancel.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
