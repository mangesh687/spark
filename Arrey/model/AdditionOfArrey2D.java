package com.Arrey.model;

import java.util.Scanner;

public class AdditionOfArrey2D {

	public static void main(String[] args) {
		System.out.println("enter the matrix ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int b[][]=new int[n][m];
		int c[][]=new int[n][m];
		System.out.println("enter the first matrix of element ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=sc.nextInt();
				
			}
				
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				System.out.print(a[i][j]+" ");
				
			}
				System.out.println();
		}
		System.out.println("enter the second  matrix of element ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				b[i][j]=sc.nextInt();
				
			}
				
		}
		System.out.println("sum of matrix of array");
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
				
			}
				System.out.println();
		}	
		

	}

}
