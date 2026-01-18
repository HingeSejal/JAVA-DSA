package com.cls.methodinner;

interface Parent2{
	public abstract void display() ;
}
public class Anonymousclass2 {
	public static void main(String[] args) {
		System.out.println("In MAin");
		Parent2 ob = new Parent2() {
			public void display() {
				System.out.println("I am in display");
			}
		};
		ob.display();
	}
}


