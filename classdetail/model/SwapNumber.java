package com.classdetail.model;

import java.util.Scanner;

public class SwapNumber {

public static void main(String[] args) {
		System.out.println("enther the first number ");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("enther 2nd no.");
	Scanner sc1=new Scanner(System.in);
	int b=sc1.nextInt();
	int temp=0;
   temp=a;
   a=b;
   b=temp;
   System.out.println("The no. after swap a="+a+"and b="+b);
   }

/* with out third variable 
int x=20;
int y=30;
x=x+y;// 20+30=50
y=x-y;// 50-30=20
x=x-y;// 50-20=30
System.out.println("x="+x+"y="+y);
}*/}


