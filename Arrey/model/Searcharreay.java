package com.Arrey.model;

import java.util.Scanner;

public class Searcharreay {

	public static void main(String[] args) {
		System.out.println("enther the size of arrey");
		Scanner sc=new Scanner(System.in);
		int number;
		int n=sc.nextInt(),count=0;
		int a[]=new int[n];
		System.out.println("enter the value of arrey");
         for(int i=0;i<n;i++) {
        	 a[i]=sc.nextInt();			 
         }
         System.out.println("search element");
             number=sc.nextInt();
         for(int i=0;i<n;i++) {
        	 if(a[i]==number)
        	 {
        		 count++;
         }
         }
        	 if(count>0) {
        		 System.out.println("item found");
        	 }
        	 else {
        		 System.out.println("item not found");
        	 }
		
		
		
		

	}

}
