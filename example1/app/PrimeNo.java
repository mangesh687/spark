package com.example1.app;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		//Prime number in Java: Prime number is a number 
		//that is greater than 1 and divided by 1 or itself only. 
		//In other words, prime numbers can't be divided by other numbers than itself or 1.
		//For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.
		System.out.println("enter the number ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	    boolean flag = false;
	    for (int i = 2; i <= n/ 2; i++) {
	      // condition for nonprime number
	      if (n % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (flag) {
	      System.out.println(n + " is a  not prime number.");
	    }
	    else {
	      System.out.println(n + " is a prime number.");
	  }
	
//	System.out.println("enter no. prime no or not ");
//	Scanner sc=new Scanner(System.in);
//	int n=sc.nextInt();
//	int cout=0;
//	for(int i=1;i<=n;i++) {
//		if(n%i==0) {
//		cout++;	
//		}
//	}
//if(cout==2) {
//	System.out.println("enter no. is prime no");
//}
//else {
//	System.out.println("enter no. not prime no.");
//}
	}

}
