package com.bptn.course._FromAssignments;

public class Student {

	private String name;
	private int studentID;
	private int[] grades;
	
	public Student (String name, int studentID, int[] grades) {
		this.name = name;
		this.studentID =studentID;
		this.grades = grades;
		
	}
	
	public int calculateTotal() {
		int sum = 0;
		for (int grade: grades) {
			sum += grade;
		}
		
		for ( int i =0; i< grades.length; i++) {
			sum +=grades[i];
		}
		return sum;
	}
	
	public double average () {
		return calculateTotal()/ grades.length;
		
	}
	
	public boolean hasPassed() {
		return (average() >= 50);
		
  }
	
public void displayStudentInfo() {
	System.out.println(this.name);
	System.out.println(this.studentID);
	System.out.println(calculateTotal());
	System.out.println(average());
	System.out.println(hasPassed() ? "pass" :"fail");

}
}

