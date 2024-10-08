package com.bptn.course._ExceptionHandling;

public class ExceptionLearning {

    public static void main(String[] args) {
        // Declare variables
        int a; 
        int b; 

        try {
            a = 11;
            b = 0;
            System.out.println(a / b); // ArithmeticException occurs

        } catch (ArithmeticException e) {
            // Handling division by zero error
            System.out.println("The number cannot be divided by zero");
        } catch (Exception e) {
            // General exception handling
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
