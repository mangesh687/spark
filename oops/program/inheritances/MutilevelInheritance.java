package com.oops.program.inheritances;
class dadaji {
	void cycle() {
		System.out.println("hhihh");
	}
	
}
class papa extends dadaji {
	void bike() {
		System.out.println("hero");
	}
	
}
class sonu extends papa{
	void car() {
		System.out.println("bmw");
	}
	
}

public class MutilevelInheritance {
	public static void main(String[] args) {
		sonu sc=new sonu();
		sc.cycle();
		sc.bike();
		sc.car();
		
		
		
	}

}
