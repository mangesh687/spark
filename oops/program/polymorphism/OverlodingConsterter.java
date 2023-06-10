package com.oops.program.polymorphism;



public class OverlodingConsterter {
	private int length;
	private int breath;
	private  int side;
	

	public OverlodingConsterter(int length, int breath, int side) {
		super();
		this.length = length;
		this.breath = breath;
		this.side = side;
	}
	


	public OverlodingConsterter() {
		super();
	}
	public int AREA(int side) {
		return side*side;
	}
	public int AREA(int breath ,int length) {
		return breath*length;
	}
	



	public static void main(String[] args) {
		OverlodingConsterter AREA=new OverlodingConsterter();
	}

}
