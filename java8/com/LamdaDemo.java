package com.java8.com;



public class LamdaDemo {

	public static void main(String[] args) {
//    Anonymous obj=new Anonymous() {
//		
//		
//		public void show() {
//           System.out.println("hello anonymous");			
//		}
//
//		
//
//		public void printnum(int x) {
//			System.out.println("1234");
//		}
//};
   
//	 obj.show();  
//	 obj.printnum(44);
			Anonymous lamda=(a,b)->{System.out.println(a);
			System.out.println(a+b);
			};
			
		lamda.printnum(44,55);
	}

}
