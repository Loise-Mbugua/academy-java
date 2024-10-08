package com.bptn.course._FromAssignments;

public class Add {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    

    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Do not modify the code below. The code below gives you the idea of how the different methods are called.
    public static void main(String args[]) {
        Add obj = new Add();
        System.out.println(obj.add(12, 21));           // Calls the first method
        System.out.println(obj.add(11, 23, 10));       // Calls the second method
        System.out.println(obj.add(100.10, 200.5));    // Calls the third method
    }
}

