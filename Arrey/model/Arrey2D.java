package com.Arrey.model;

import java.util.Scanner;

public class Arrey2D {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		System.out.println("enter the element of arrey ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter the element of matrix ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
