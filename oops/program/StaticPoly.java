package com.oops.program;

public class StaticPoly {
	void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
StaticPoly ob=new StaticPoly();
ob.sum(10,20);
ob.sum(10,33, 440);

	}

}
