package com.Arrey.model;

import java.util.Scanner;

public class ArreyDescendingOrder {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int a[]=new int[n];
		System.out.println("enter the elmemt of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("arrey desending order of arrey ");
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]<a[j]) {
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
					
				}
			}
			System.out.println(a[i]);
		}

	}

}
