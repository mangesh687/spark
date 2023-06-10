package com.Arrey.model;

import java.util.Scanner;

public class AverageofanArrayelements {

	public static void main(String[] args) {
		System.out.println("enter size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;double avg;
		int a[]=new int[n];
		System.out.println("enter the element of arrey");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
		}
		avg=((sum)/a.length);
		System.out.println("avg of element of arrey  "+avg);
		

	}

}
