package com.oops.program.inheritances;

public class InheritanceMain {

	public static void main(String[] args) {
		/* inheritance 
		why use inheritance in java 
		1)reuseablelity 
		2)readblity
		 
		 * IS relationship 
		 * child class access all feature $ properties of exsting class 
		 
		 TYPE OF INHERITANCE 
		 1)SIMPLE INHERITANCE 
		 2)MULTILEVEL INHERITANCE 
		 3)MULTIPLE INHERITANCE
		 4)HIERARCHICAL INHERITANCE
		 
		 1) SIMPLE INHERITANCE 
		 
		 only one parent class and only one child class 
		 
		 2)MUTILEVEL INHERITANCE 
		 only one parent class and multiple child class 
		 
		 3)MUTIPLE INHERITANCE 
		 two parnet and one child class ( not supported)
		 
		 their meight be a chance of memory dublication 
		 
		 diamond issue and ambiqute problem 
		 
		 4)HIERARCHCAL INHERITANCE 
		 only one parnet class and multiple child class and all parent class direcly extend to parent class . 
		 
		*/
	

		    CarChildClassheritance c = new CarChildClassheritance();
		    c.setCarCompany("Nexon");
		    c.setCarModelNo("CRme");
			c.setCarName("desing");
			c.setNoofWheels(4);
			System.out.println("the car company is : "+c.getCarCompany());
			System.out.println("the car name is : "+c.getCarModelNo());
			System.out.println("the car model number is : "+c.getCarName());
			System.out.println("the car no of wheels is : "+c.getNoofWheels());
			 // inheritance of data of vehicle
			c.setVehicleid(12);
			c.setVehicleName("car");
			System.out.println("the vehicle id"+c.getVehicleid());
			System.out.println("vehicle name"+c.getVehicleName());
			
			

		}
	}


