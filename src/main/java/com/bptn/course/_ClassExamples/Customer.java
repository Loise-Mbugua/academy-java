package com.bptn.course._ClassExamples;

class Customer {
	//instance variables
	private String customerID;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;
	
	//constructor
	public Customer(String customerID, String customerName, String customerEmail){
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
	}

	// Getter for customerName
	public String getCustomerName() {
		return this.customerName;
	}
	
	// Getter for cart
	public ShoppingCart getCart() {
		return this.cart;
	}
	
	public void checkout() {
		System.out.println("Processing order for "+ this.getCustomerName() +"...");
	}
}


