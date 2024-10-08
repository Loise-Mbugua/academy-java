package com.bptn.course._FromAssignments;

public class Sample {
    // Instance variables
    private String name;     
    public int studentID;     

    // Static variables
    private static String principalName; 
    private static int nextID = 100;     
    // Constructor to initialize the student's name and ID
    public Sample(String name, int grade) {
        this.name = name; 
        this.studentID = nextID++; 
    }

    // Static method to use the new principal's name
    public static void newPrincipal(String name) {
        principalName = name; 
    }

    // Static method to reset the student ID to 100
    public static void resetID() {
        nextID = 100; // Reset the next available student ID to 100
    }

    // Method to return a string 
    @Override
    public String toString() {
        return name + " " + studentID; // output the student name and ID
    }

    // Main method
    public static void main(String[] args) {
        Sample s1 = new Sample("Muhammed", 11);
        Sample s2 = new Sample("Alan", 11);
        Sample s3 = new Sample("Sophie", 11);

        System.out.println("Principal Name for student 1: " + Sample.principalName);
        System.out.println("Student ID for student 1: " + s1.studentID);
        System.out.println("Student ID for student 2: " + s2.studentID);
        System.out.println("Student ID for student 3: " + s3.studentID);

        Sample.newPrincipal("Mr. McKoy");
        System.out.println("New principal name: " + Sample.principalName);

        Sample.resetID();
        Sample s4 = new Sample("Kevin", 11);
        System.out.println("Student ID for student 4: " + s4.studentID);
        System.out.println("String representation of student 4: " + s4.toString());
    }
}
