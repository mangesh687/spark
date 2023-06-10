package com.Arrey.model;


import java.util.Scanner;
import java.util.Arrays;

public class EqualArrays {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("enter the element of array of 1");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("enter the element of array of 2");
for(int i=0;i<n;i++) {
	b[i]=sc.nextInt();
}
boolean c=Arrays.equals(a,b);
System.out.println("kay dono arrays equal hai"+c);
	}

}
