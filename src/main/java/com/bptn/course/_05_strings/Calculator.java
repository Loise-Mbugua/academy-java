import java.util.*;

public class Calculator {
    public static void main(String[] args) {
   //create a scanner object to read user input
		Scanner scanner = new Scanner (System.in);
		//Declaring variable to hold user choice when loop continues
        int continueChoice; 
		
	do {
		//Display calculator menu options
		System.out.println("/Calculator Menu/");
		System.out.println("Press 1 for addition");
		System.out.println("Press 2 for subtraction");
		System.out.println("Press 3 for multiplication");
		System.out.println("Press 4 for division");
		System.out.println("Press 5 to square a number");
		System.out.println("Press 6 to find a square root ");
		System.out.println("Press 7 to find the reciprocal");
		
        // Prompt user to input their choice
        int choice = scanner.nextInt();
       
        //Declare the variable of two numbers we need and their result 
        double num1, num2, result;

        //Use switch statementto solve for calculator 
        switch (choice) {
            case 1: // Addition of the two numbers
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble(); //reading the first number
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();//reading the second number
                result = num1 + num2; //calculating the addition
                System.out.println("The sum of num1 and num2 is: " + result);//Printing the result
                break;

            case 2: // Subtraction of the two numbers
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble(); //read the first number
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();//reading the second number
                result = num1 - num2;//performing the subtraction
                System.out.println("The difference between num1 and num2 is: " + result);//print the results
                break;

            case 3: // Multiplication of the two numbers
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();// reading the first number
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();// reading the second number
                result = num1 * num2; //performing multiplication
                System.out.println("The product of the num1 and num2 is: " + result);//display the results
                break;

            case 4: // Division of the two numbers
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble(); //reading the first number
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();//reading the second number
                if (num2 != 0) {//check for division by zero
                    result = num1 / num2; //Dividing the numbers
                    System.out.println("Dividing num1 by num2 the qutient is: " + result+ "The remainder is 0.0");//Display the results
                } else {
                    System.out.println("Error! Division by zero."); //Display error message
                }
                break;

            case 5: // Square of the two numbers
                System.out.print("Enter a number to square: ");
                num1 = scanner.nextDouble();//reading the first number
                result = num1 * num1; // calculating the square of num1
                System.out.println("The square of the num1 is: " + result);//Print the result
                break;

            case 6: // Square Root of the two numbers
                System.out.print("Enter a number for square root: ");
                num1 = scanner.nextDouble(); // reading the first number
                if (num1 >= 0) {//check for -ve input
                    result = Math.sqrt(num1);//calculate square root
                    System.out.println("The square root of the num1 is: " + result);//Printing the result
                } else {
                    System.out.println("Error! No square root of a -ve number.");//Printing the result
                }
                break;

            case 7: // Reciprocal of the two numbers
                System.out.print("Enter a number for reciprocal: ");
                num1 = scanner.nextDouble();
                if (num1 != 0) {//excluding zero
                    result = 1 / num1;
                    System.out.println("The reciprocal of the num1 is: " + result);//Printing reciprocal
                } else {
                    System.out.println("Error! No reciprocal for zero.");//print error when num1 is zero
                }
                break;

            default: // Populate Invalid choice when all cases fail
                System.out.println("Invalid choice! Please try again.");// print error message
        }

        // Ask if user wants to continue
        System.out.print("Press 1 to continue or any other number to exit: ");
        continueChoice = scanner.nextInt();// reading user input to continue

    } while (continueChoice == 1);//if user presses 1, the loop continues
	
	//Closing scanner
    scanner.close();
    System.out.println("Calculator closed.");     
        
    }
}

/*The code was lots of concepts tied together and took a time to piece ideas to make it work.
It was a combination of do -while, switch and while, fascinatinating and challenging at the same time.
 However it was a good question that trigured my brain to think widely.
 My main issues were how to connect my ideas so that i can write the code, but once i knew what the flow should be it was not to hard to find my way around by going back to class material and finding out what to do at each instance.
 I have saved this in my eclipse so that i can use it as a referral for complex code and as an encouragement that once you figure the steps, writing the code isnt too complicated as it seems but you have to get the steps right */

