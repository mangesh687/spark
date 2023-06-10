package com.today.com;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter start and end range ");
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int count=0;
       for(int i=num1;i<=num2;i++) {
    	   int n=i;
    	   int a=2;
    	   int tem=0;
    	   while((a<n/2)) {
    		   if((n%a)==0) {
    			   tem++;
    			   break;
    		   }
    		   a++;
    	   }
    	   if(tem==0&& i!=1) {
    		   count++;
    	   }
       }
       System.out.println("total prime num"+count);
	}

}
