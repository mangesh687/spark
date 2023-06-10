package com.classdetail.model;

import java.util.Scanner;

public class ForLoopEx2 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("enter your first number");
			int a=sc.nextInt();
			System.out.println("enter your second number");
			int b=sc.nextInt();
			int c=a+b;
			System.out.println("addtion is"+c);
			System.out.println("=============");
		
		}

	}

}
