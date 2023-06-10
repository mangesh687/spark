package com.example1.app;

import java.util.Scanner;

public class ReversStarPattan {

	public static void main(String[] args) {
		System.out.println("enter the reverse star patten no. ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
for(int i=1;i<=n;i++) {
	for(int j=n;j>=i;j--) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}
