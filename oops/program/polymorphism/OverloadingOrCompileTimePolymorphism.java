package com.oops.program.polymorphism;

public class OverloadingOrCompileTimePolymorphism {
	
	
	
	public void area(int x) {
		System.out.println(x);
	}
	public void area(int a, int b) {
		System.out.println(a+b);
	}
	public void area(String name,int z) {
		System.out.println(name+"  "+z);
	}

	public static void main(String[] args) {
		OverloadingOrCompileTimePolymorphism sc=new OverloadingOrCompileTimePolymorphism();
		sc.area(10);
		sc.area(12, 230);
		sc.area("mangesh", 25);


	}

}
