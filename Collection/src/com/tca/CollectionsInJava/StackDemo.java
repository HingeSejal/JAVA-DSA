package com.tca.CollectionsInJava;

import java.util.ListIterator;
import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> ob = new Stack<>();
		ob.push("Pune");
		ob.push("Mumbai");
		ob.push("Gondia");
		ob.push("Thane");
		
		System.out.println("Names :"+ ob);
		
		System.out.println("Peek:"+ ob.peek());
		
		while(!ob.isEmpty()) {
		System.out.println("Pop : "+ob.pop());
		}
		
		//System.out.println("Peek:"+ ob.peek()); //EmptyStackException
		
		System.out.println("Check is empty:"+ ob.isEmpty());
		System.out.println("size:"+ ob.size());
	}

}
