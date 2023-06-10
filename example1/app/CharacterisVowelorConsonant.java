package com.example1.app;

import java.util.Scanner;

public class CharacterisVowelorConsonant {

	public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  char ch=sc.next().charAt(0);
  if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u')
  {
System.out.println("this is vowel");
	}
  else
  {
	  System.out.println("this is consonant");

}
	}}
