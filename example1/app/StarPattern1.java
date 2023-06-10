package com.example1.app;

import java.util.Scanner;

public class StarPattern1 {

	public static void main(String[] args) {
		System.out.println("enter no. of row star pattern");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/* for(int i=1;i<=n;i++) 
		 {
			 for(int j=1;j<=i;j++ ) {
			System.out.print("*");
			 }
			 System.out.println();
		 }*/
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		

}
