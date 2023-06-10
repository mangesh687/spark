package com.classdetail.model;

public class StaticNonStatic {

	public static void main(String[] args) {
		
		       System.out.println("Hiii");  
		       StaticNonStatic obj = new StaticNonStatic();  
		       subNum();
		       obj.addNum();
			}

			public void addNum() {
				int y = 555;
				String s = "Hi Trupti";	
				System.out.println(y);
				System.out.println(s);     
				subNum() ;
				divNum();
			}
			
			public static void subNum() {
				int a = 45;
				int b = 20;
				int c = a -b;
				System.out.println(c);
			}
			
			public int divNum() {
				int a = 10;
				int b = 5;
				int c = a/b;
				System.out.println(c);
				return c;
			}

	}


