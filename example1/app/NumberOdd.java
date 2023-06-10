package com.example1.app;

import java.util.Scanner;

public class NumberOdd {

	public static void main(String[] args) {
		System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        if(a%2==0) {
        	System.out.println("number is even ");
        }
        else {
			System.out.println("number is odd");
		}
        
	}

}
