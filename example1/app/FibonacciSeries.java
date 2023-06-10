package com.example1.app;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("fibonacci series till term");
		
		Scanner sc=new Scanner(System.in);
		
		//in fibonacci series, next number is the sum of previous two numbers for 
		//example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of 
		//fibonacci series are 0 and 1.
		int n=sc.nextInt();
		
		int n1=0,n2=1;
		
		
		for(int i=0;i<=n;i++)
		{
			System.out.print(n1+" ");
			
			// compute the next term
			int n3=n1+n2;
			n1 = n2;
		      n2 = n3;
		}

	}

}
