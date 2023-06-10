package com.classdetail.model;

import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		System.out.println("enter the star patten ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			//i=1
		for(int j=1;j<=i;j++) {  //*    //**    ///***
		System.out.print("*");	
		}
		System.out.println();
		}

	}

}
