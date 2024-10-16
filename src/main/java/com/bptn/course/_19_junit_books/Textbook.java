package com.bptn.course._19_junit_books;

public class Textbook extends Book {
	// Private instance variable for edition
	private int edition;

	// Constructor
	public Textbook(String title, double price, int edition) {
		super(title, price); // Call to superclass constructor
		this.edition = edition; // Set the edition
	}

	// Override getBookInfo method
	@Override
	public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	}

	// Getter for edition
	public int getEdition() {
		return edition;
	}

	// Method to check if this textbook can substitute for another
	public boolean canSubstituteFor(Textbook other) {
		return this.edition >= other.getEdition() && this.getTitle().equals(other.getTitle());
	}
}