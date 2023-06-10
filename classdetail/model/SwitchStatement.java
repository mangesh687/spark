package com.classdetail.model;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		 System.out.println("enter the day between 1 to 7");
		 Scanner sc=new Scanner(System.in);
		 int day=sc.nextInt();
		 switch (day) {
		 case 1:
			 System.out.println("mon");
         break;	
		 case 2:
			 System.out.println("the");
         break;	
		 case 3:
			 System.out.println("wed");
         break;	
		 case 4:
			 System.out.println("thu");
         break;	
		 case 5:
			 System.out.println("sat");
         break;	
		 case 6:
			 System.out.println("sun");
         break;
		 case 7:
			 System.out.println("monday");
			 break;		
		 default:
		 System.out.println("please enter no. betwwen 1 to 7 ");
		 }

	}

}
