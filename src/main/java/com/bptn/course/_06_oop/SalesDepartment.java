package com.bptn.course._06_oop;

class SalesDepartment extends Department {

	 private double totalSalesAmount; // Private data member

	    // Constructor to initialize totalSalesAmount
	    public SalesDepartment(String departmentName, int numberOfEmployees,double totalSalesAmount ) {
	        super(departmentName, numberOfEmployees);
	    	this.totalSalesAmount = totalSalesAmount;
	    }
}
