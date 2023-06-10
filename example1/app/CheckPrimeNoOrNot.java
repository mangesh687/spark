package com.example1.app;

import java.util.Scanner;

public class CheckPrimeNoOrNot {

	public static void main(String[] args) {
		System.out.println("enetr the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean flag=false;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				flag=true;
				break;
			}
		}
		if(flag) {
			System.out.println("number is not prime");
		}
		else {
			System.out.println("number is prime");
		}
		

	}

}
