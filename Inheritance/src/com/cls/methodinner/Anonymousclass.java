package com.cls.methodinner;

abstract class Parent{
	abstract void display() ;
}
public class Anonymousclass {
	public static void main(String[] args) {
		Parent ob = new Parent() {
			void display() {
				System.out.println("I am in display");
			}
		};
		ob.display();
	}
}

