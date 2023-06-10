package com.oops.program.polymorphism;


	class shape{
	public	void  draw(){
			System.out.println("can't say shape size ");
			
		}
		class squ extends shape{
			@Override
			public void draw() {
				
				System.out.println("square shape");
				
			}
			
		}
		
		
		
	}
	
	public class Overriding1 {
	public static void main(String[] args) {
		shape r=new shape();
		r.draw();

	}

}
