package com.bptn.course._06_oop;

public class VariableScope {

    // Class-level variable (also known as instance variable)
    // This variable is accessible throughout the entire class.
    private int classLevelVariable;

    // Constructor to initialize the class-level variable
    public VariableScope(int value) {
        classLevelVariable = value; // Assigning value to class-level variable
    }

    // Method to demonstrate method-level variable
    public void demonstrateMethodLevel() {
        // Method-level variable
        // This variable is accessible only within this method.
        int methodLevelVariable = 10; 

        // Displaying the values
        System.out.println("Class Level Variable: " + classLevelVariable);
        System.out.println("Method Level Variable: " + methodLevelVariable);
        
        // Calling another method to show class-level access
        displayVariables();
    }

    // Another method to demonstrate the scope of class-level variable
    public void displayVariables() {
        // This method can access the class-level variable
        System.out.println("Accessing from displayVariables - Class Level Variable: " + classLevelVariable);
        
        // Uncommenting the line below will cause a compilation error
        // System.out.println("Method Level Variable: " + methodLevelVariable); // This won't work
    }

    // Method to demonstrate block-level variable
    public void demonstrateBlockLevel() {
        // Block-level variable
        if (true) {
            // This variable is accessible only within this block
            int blockLevelVariable = 20; 
            System.out.println("Block Level Variable: " + blockLevelVariable);
        }

        // Uncommenting the line below will cause a compilation error
        // System.out.println("Block Level Variable outside block: " + blockLevelVariable); // This won't work
    }

    public static void main(String[] args) {
        // Creating an instance of VariableScopeExample
        VariableScope example = new VariableScope(5);
        
        // Demonstrating method-level variable
        example.demonstrateMethodLevel();

        // Demonstrating block-level variable
        example.demonstrateBlockLevel();
    }
}

/*Notes
Class-Level Variables:
Declared outside any method but inside the class.
In this example, classLevelVariable is a class-level variable and can be accessed from any method in the class.

Method-Level Variables:
Declared inside a method and are accessible only within that method.
In the demonstrateMethodLevel method, methodLevelVariable is defined, and it cannot be accessed from other methods.

Block-Level Variables:
Declared within a block (e.g., within an if statement or a loop) and are accessible only within that block.
In the demonstrateBlockLevel method, blockLevelVariable is defined within an if block and is not accessible outside that block.

Key Points:

Each variable type has its own scope, which dictates where it can be accessed.
Class-level variables have the broadest scope, while block-level variables have the most restrictive scope.*/