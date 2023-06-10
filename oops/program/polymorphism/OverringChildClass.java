package com.oops.program.polymorphism;

public class OverringChildClass extends OverridingParentClass {
	private String animalname;
	private int animalno;
	private String animaltype;
	

	public String getAnimalname() {
		return animalname;
	}


	public void setAnimalname(String animalname) {
		this.animalname = animalname;
	}


	public int getAnimalno() {
		return animalno;
	}


	public void setAnimalno(int animalno) {
		this.animalno = animalno;
	}


	public String getAnimaltype() {
		return animaltype;
	}


	public void setAnimaltype(String animaltype) {
		this.animaltype = animaltype;
	}


	public OverringChildClass(String animalname, int animalno, String animaltype) {
		super();
		this.animalname = animalname;
		this.animalno = animalno;
		this.animaltype = animaltype;
	}


	public OverringChildClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	@Override
	public String getDog() {
		// TODO Auto-generated method stub
		return super.getDog();
	}


	@Override
	public void setNoofdog(int noofdog) {
		// TODO Auto-generated method stub
		super.setNoofdog(noofdog);
	}


	@Override
	public void setDailyexpence(int dailyexpence) {
		// TODO Auto-generated method stub
		super.setDailyexpence(dailyexpence);
	}


	public static void main(String[] args) {
		OverridingParentClass sc=new OverridingParentClass();
		sc.getDailyexpence();
	}

}
