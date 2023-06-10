package com.example1.app;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("enter the value of week ");
		Scanner sc=new Scanner(System.in);
		int weeknum =sc.nextInt();
		switch(weeknum)
		{
		case 1:{
			System.out.println("monday");
			break;
		}
		case 2:{
			System.out.println("thu");
			break;
		}
		case 3:{
			System.out.println("wend");
			break;
		}
		case 4:{
			System.out.println("thus");
			break;
		}
		case 5:{
			System.out.println("fri");
			break;
		}
		case 6:{
			System.out.println("sat");
			break;
		}
		case 7:{
			System.out.println("sun");
			break;
		}
		default:{
			System.out.println("enter the correct ans ");
			
		}
		}
		
		

	}

}
