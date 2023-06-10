package com.example1.app;

import java.util.Scanner;


public class SumOfOddNoAndEvenNO {

	public static void main(String[] args) {
		System.out.println("enter no ");
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();int sum=0;
   
   if(n%2 ==0) {
   for(int i=0;i<=n;i=i+2) {
	 sum=sum+i;  
	   }
	   System.out.println("sum of even no"+sum);
   }
   else 
   {
   for(int i=1;i<=n;i=i+2){
	   sum=sum+1;  
   }
	  System.out.println("sum of odd no"+sum);  
   }

	}

}
