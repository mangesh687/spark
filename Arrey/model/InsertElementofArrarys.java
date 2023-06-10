package com.Arrey.model;

import java.util.Scanner;

public class InsertElementofArrarys {

	public static void main(String[] args) {
		System.out.println("enter the size of arrey");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int a[]=new int[n+1];
        System.out.println("enter the elemnet of arrey");
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("enter the arrey location");
        int loc=sc.nextInt();
        System.out.println("enter the location items");
        int items=sc.nextInt();
        for(int i=n;i>loc;i--) {
        	a[i]=a[i-1];
        	
        }
        a[loc]=items;
        n++;
        for(int i=0;i<n;i++) {
        	System.out.println(a[i]);
        }
	}

}
