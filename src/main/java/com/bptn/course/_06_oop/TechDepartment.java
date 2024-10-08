package com.bptn.course._06_oop;

public class TechDepartment extends Department {

    private double totalPurchaseAmount; // Private data member

    // Constructor to initialize totalPurchaseAmount
    public TechDepartment(String departmentName, int numberOfEmployees, double totalPurchaseAmount) {
        super(departmentName, numberOfEmployees);
        this.totalPurchaseAmount = totalPurchaseAmount; // Corrected variable name
    }

    // Optional: Getter for totalPurchaseAmount
    public double getTotalPurchaseAmount() {
        return totalPurchaseAmount;
    }
}
