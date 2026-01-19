package com.tca.mainapp;

class StudentAgn3 extends Student2020{
	
	public StudentAgn3(String name, int rno, String email) {
		super(name, rno, email);
	}

	private double fees;
	private String stackChoice;
	
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getStackChoice() {
		return stackChoice;
	}
	public void setStackChoice(String stackChoice) {
		this.stackChoice = stackChoice;
	}
	
	public void display() {
		super.display();
		System.out.println(fees+"\t"+stackChoice);
	}
	
}


public class Student2 {

	public static void main(String[] args) {
		StudentAgn3 ob = new StudentAgn3("seja",54,"sej@gmail");
		ob.display();
	}

}
