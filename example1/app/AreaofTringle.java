package com.example1.app;

import java.util.Scanner;

public class AreaofTringle {

	public static void main(String[] args) {
		int sp;
		double area;
		System.out.println("enter the side of triangle");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sp=(a+b+c)/2;
		area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		System.out.println(area);
		
		
		

	}

}
