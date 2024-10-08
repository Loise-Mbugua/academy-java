package com.bptn.course._ExceptionHandling;

public class NestedTryBlock {

		public class Main {
		    void method() {
		        try {
		            // Outer try block
		            try {
		                // Inner try block
		                // Declaring plus initializing the array
		                int[] arr = {1, 2, 3, 4}; // Declare and initialize the array
		                System.out.println(arr[0]); // print output of first index
		                System.out.println(arr[5]); // Attempt to print an out-of-bounds element
		            } catch (ArithmeticException e) {
		                System.out.println("ArithmeticException occurred");
		            }
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("ArrayIndexOutOfBoundsException is handled in the outer catch block");
		        }
		    }

		    // main method for running the program
		    public static void main(String args[]) {
		        Main nestedTryBlockSolutionObject = new Main();
		        nestedTryBlockSolutionObject.method();
		    }
		}


	}

}
