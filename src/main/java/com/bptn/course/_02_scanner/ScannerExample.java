package com.bptn.course._02_scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// create scanner object
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to our shoe store");
		System.out.println("our available shoe sizes");
		System.out.println("30, 41, 44, 45");

		System.out.println("Enter your shoe size");
		int customerSize = scanner.nextInt();

		switch (customerSize) {

		case 30:
			System.out.println("Size is small");
			break;
		case 41:
			System.out.println("Size is medium");
			break;
		case 44:
			System.out.println("Size is large");
			break;
		case 45:
			System.out.println("Size is extra large");
			break;
		default:
			System.out.println("Size not available");
			break;
		}

		System.out.println("size: " + customerSize);

	}

}
