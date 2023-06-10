package com.Arrey.model;

import java.util.Scanner;

public class DeleteElementofArrey {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("enter the elemrnt of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("enter the location");
		int loc=sc.nextInt();
		for(int i=loc;i<n-1;i++) {
			a[i]=a[i+1];
		}
n--;
for(int i=0;i<n;i++) {
	System.out.println(a[i]);
}
	}

}
