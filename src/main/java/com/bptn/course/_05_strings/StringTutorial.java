package com.bptn.course._05_strings;

public class StringTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// can initialize string in two ways
		String fruit = "carrot";
// you can also initialize by
		String fruitOne = new String();
		fruitOne = "Base legal";
		fruit.length(); // length of string
// FINDING A SUBSTRING
		String fruitTwo = fruitOne.substring(0, 3);
		String fruitThree = fruit.toLowerCase();
		String fruitFour = fruitOne.toUpperCase();
		boolean fruitsComparison = fruit.equals(fruitOne);

	}

}
