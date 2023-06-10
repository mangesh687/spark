package com.oops.program.inheritances;
class paren{
	void car() {
		System.out.println("bmw");
	}
}
class c1 extends paren{
	void cycle() {
		System.out.println("dghj");
	}
	
}
class c2 extends paren{
	void bick() {
		System.out.println("hero ");
	}
	
}


public class HierarchicalInheritance {

	public static void main(String[] args) {
		c1 c=new c1();
		c.car();
		c.cycle();
		c2 c1=new c2();
		c1.car();
		c1.bick();
		

	}

}
