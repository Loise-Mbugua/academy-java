
// Import the Scanner class from the java.util package
import java.util.Scanner;

public class ScannerTutorial {
	public static void main(String[] args) {
		// Create a Scanner object to read input from the console
		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter their name
		System.out.print("Enter your name: ");
		// Read the full line of input as a String
		String name = scanner.nextLine();

		// Prompt the user to enter their age
		System.out.print("Enter your age: ");
		// Read the next integer input
		int age = scanner.nextInt();

		// Output a greeting message using the provided name and age
		System.out.println("Hello, " + name + "! You are " + age + " years old.");

		// Close the Scanner to free up resources
		scanner.close();
	}
}

/*
 * 
 * Import the Scanner class. Create a Scanner object. Read input using various
 * methods. Use the input as needed. Close the Scanner when done. Read Input
 * 
 * Use the Scanner methods to read different types of input. Here are a few
 * common methods:
 * 
 * nextLine(): Reads a full line of text. nextInt(): Reads an integer.
 * nextDouble(): Reads a double. next(): Reads the next token (word).
 */
