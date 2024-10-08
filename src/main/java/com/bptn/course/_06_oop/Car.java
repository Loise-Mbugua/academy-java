package com.bptn.course._06_oop;

public class Car {//defining the class for car

	//Defining instance variable/attributes of the car, make, model, year
	private String make;
	private String model;
	private int year;
	
	// To initiate the instance variable above, we need to use constructors. 
	//Constructor: This special method is called when a new object is created
    public Car(String make, String model, int year) {
    	//this keyword refers to the current model
    	this.make = make;//initializing make
    	this.model = model;//initializing model
    	this.year = year;//initializing year
    	
    }
    //method to display car details
    public void displayDetails() {
    System.out.println( "Car Make: " +make);
    System.out.println("Car Model: " + model);
    System.out.println("Year of Manufacture" + year);
    
    }
 // Main method: The entry point of the program
    public static void main(String[] args) {
    	// Creating and initializing a Car object using the constructor
        Car myCar = new Car("Toyota", "Corolla", 2020);
        
     // Calling the method to display car details
        myCar.displayDetails();
        
     // Creating another Car object
        Car anotherCar = new Car("Honda", "Civic", 2021);
        
        // Displaying details of the second car
        anotherCar.displayDetails();
    	
    
	}

}
/*Notes
 Explanation of the Code

    Class Definition:
        The Car class is defined with three instance variables: make, model, and year.

    Constructor:
        The constructor public Car(String make, String model, int year) is defined. It has the same name as the class and is used to initialize the attributes of the Car object when it is created.
        The this keyword is used to differentiate between the instance variables and the parameters passed to the constructor.

    Display Method:
        The displayDetails() method is created to print out the car's attributes. This method showcases how you can access the object's properties after it has been initialized.

    Main Method:
        The main method is the entry point for the program. Inside this method:
            A Car object named myCar is created using the constructor, which initializes the car's make, model, and year.
            The displayDetails() method is called on myCar to print its attributes.
            Another Car object named anotherCar is created to demonstrate the instantiation of multiple objects.

Significance of Constructors

    Constructors are essential for ensuring that an object is created in a valid state, with its attributes initialized as desired.
    They allow for the creation of flexible and reusable code, as different constructors can be defined for different initialization scenarios (e.g., default values or different sets of parameters).

This example gives a clear overview of how constructors work in Java and their role in object-oriented programming.*/
