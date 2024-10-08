package com.bptn.course._06_oop;

public class Department {
    private String departmentName; // Name of the department
    private int numberOfEmployees; // Number of employees
    
    // Constructor
    public Department(String departmentName, int numberOfEmployees) {
        this.departmentName = departmentName;
        this.numberOfEmployees = numberOfEmployees;
    }
    
    // Method to print department info
    public void departmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Number of Employees: " + numberOfEmployees);
    }
}
