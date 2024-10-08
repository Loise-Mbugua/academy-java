package com.bptn.course._02_scanner;

import java.util.Scanner;


public class Scan {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);//import Scanner
		
		System.out.print("Enter your age: ");//prompt user
		
		int age = scanner.nextInt();
		
		System.out.println("My age is: " + age);
		
		scanner.close();
		

	}
}
