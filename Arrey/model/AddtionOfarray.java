package com.Arrey.model;

import java.util.Scanner;

public class AddtionOfarray {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();int sum=0;
		int a[]=new int[n];
		System.out.println("enter the element of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		
		}
		System.out.println("addtion of arrey");
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		
		System.out.println(sum);
	}

}
