package com.bptn.course._03_flow_control._03_if_statement;
import java.util.Scanner;
public class IfStatement {

		
		public class HeadsOrTails {
		    public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);

		        System.out.println("Input is Heads Value (true/false): true ");
		        boolean isHeads = scan.nextBoolean();
		        if (isHeads ==true) {
		            System.out.println("Let's go to the game");
		        } else {
		            System.out.println("Let's watch a movie");
		        }
		        System.out.println("after conditional");
		    }
		}

	}
