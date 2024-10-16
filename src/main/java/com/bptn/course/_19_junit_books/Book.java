package com.bptn.course._19_junit_books;

public class Book {
	// Private instance variables
	private String title;
	private double price;

	// Constructor
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	// Getter for title
	public String getTitle() {
		return title;
	}

	// Method to get book info
	public String getBookInfo() {
		return title + "-" + price;
	}
}
