package com.bptn.course._ExceptionHandling;

public class TryCatchDemo {

	public static void main(String[] args) {
		try {
			int result = 10/0;
			System.out.println("Result" + result);
		} catch (ArithmeticException e)	{
			System.out.println ("cannot divide by zero");
		}finally {
			System.out.println("program ended");
		}
	}

}
