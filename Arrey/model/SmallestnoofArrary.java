package com.Arrey.model;

import java.util.Scanner;

public class SmallestnoofArrary {

	public static void main(String[] args) {
		System.out.println("enter the size of arreay");
		Scanner sc=new Scanner(System.in);
		int min;
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the element of array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("smalest no. of array");
		min=a[0];
		for(int i=1;i<n;i++) {
			if(a[i]<min) {
				 min=a[i];
			}
		}
		System.out.println(min);
		

	}

}
