package com.example1.app;

import java.util.Scanner;

public class PrimeNoOrNot {

	public static void main(String[] args) {
		int flag=0;
		System.out.println("enter the no. prime no. or not");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     if(n==0 || n==1) {
    	 System.out.println("not prime no.");
     }
     else {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println("no. not prime no");
				flag=1;
			}
		}
		if(flag==0) {
			System.out.println("no. is prime");
		}
		
	}
     
	}

}
