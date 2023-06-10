package com.example1.app;

import java.util.Scanner;

public class PositiveNumnerornot {

	public static void main(String[] args) {
		System.out.println("enther the number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("nu. is zero ");
		}
		
		else if(n>0) {
			System.out.println("nu. is posive ");


	}
		else if(n<0) {
			System.out.println("nu. is negative ");

		}

}}
