package com.example1.app;

import java.util.Scanner;

public class Facotsofnumber {

	public static void main(String[] args) {
		System.out.println("enter the factor of no.");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}

}
