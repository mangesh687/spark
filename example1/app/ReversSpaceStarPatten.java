package com.example1.app;

import java.util.Scanner;

public class ReversSpaceStarPatten {

	public static void main(String[] args) {
		System.out.println("enter the Reverse space patten start from end ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++)
      {
    	  for(int j=i;j<n;j++)
    	  {
    		  System.out.print(" ");
    	  }
    	  for(int k=1;k<=i;k++)
    	  {
    		  System.out.print("*");
    	  }
    	  System.out.println();
      }
      
	}

}
