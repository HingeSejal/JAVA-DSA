package com.tca.CollectionsInJava;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QDemo {
	
	public static void main(String[] args) {
		
		//Queue<String> ob = new Queuet<>();  Q is abstract i.e.interface can't be instantiated , Q is parent class of ll
		//linkedlist madhe jya methods aahet tech q madhe aahe so repetitive declaration avoid karayla aapan child ll gheu and parent 
		Queue<String> ob = new LinkedList<>();
		ob.add("Pune");
		ob.add("Mumbai");
		ob.add("Gondia");
		ob.add("Thane");
		
		System.out.println("Names :"+ ob);
		
		System.out.println("Remove:"+ ob.remove());
		
		while(!ob.isEmpty()) {
		System.out.println("Remove : "+ob.remove());
		}
		
		//System.out.println("Peek:"+ ob.peek()); //EmptyStackException
		
		System.out.println("Check is empty:"+ ob.isEmpty());
		System.out.println("size:"+ ob.size());
}
}