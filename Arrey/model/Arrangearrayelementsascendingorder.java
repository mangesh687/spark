package com.Arrey.model;

import java.util.Scanner;

public class Arrangearrayelementsascendingorder {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp=0;
		int a[]=new int[n];
		System.out.println("enter the elemnt of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Arrange array elements ascending order");
		for(int i=0;i<n;i++) {
		for(int j=i+1;j<n;j++) {
			if(a[i]>a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				
			}
				
			}
	
			System.out.println(a[i]);
			
		}
				

	}

}
