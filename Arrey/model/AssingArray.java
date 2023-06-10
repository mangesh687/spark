package com.Arrey.model;

import java.util.Scanner;

public class AssingArray {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elements of arrey");
for(int i=0;i<n;i++) {
	a[i]=sc.nextInt();
	
}
System.out.println("print the arrey");
for(int i=0;i<n;i++) {
	System.out.println(a[i]);
}
	}

}
