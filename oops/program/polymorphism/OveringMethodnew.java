package com.oops.program.polymorphism;

//Creating a parent class.
public class OveringMethodnew {

	// defining a method
	 void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
 class Bike1 extends OveringMethodnew {
	// defining the same method as in the parent class
	 void run() {
		System.out.println("Bike is running safely");
	}

	public static void main(String[] args) {
		Bike1 n = new Bike1();// creating object
		n.run();// calling method
	}

}
