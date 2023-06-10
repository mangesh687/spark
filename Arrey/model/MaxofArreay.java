package com.Arrey.model;

import java.util.Scanner;

public class MaxofArreay {

	public static void main(String[] args) {
		System.out.println("ENTER THE SIZE OF ARREY");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int max;
		int a[]=new int[n];
		System.out.println("enter the element of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("max no. of element");
		max=a[0];
		for(int i=1;i<n;i++) {
	
		if(a[i]>max) {
			max=a[i];
				}}
		System.out.println(max);
		

	}

}
