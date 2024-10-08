package com.bptn.course._FromAssignments;

public class Main {

	public static void main(String[] args) {
		int [] myGrades = {50, 60, 75, 95};
		
		Student student = new Student("John", 1234, myGrades);
		student.displayStudentInfo();
		
	}

}
