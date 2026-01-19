package com.tca.CollectionsInJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ob = new LinkedList<>();
		ob.add("ABC");
		ob.add("CCC");
		ob.add("BBB");
		
		System.out.println("Names :"+ ob);
		
		System.out.println("Size :"+ ob.size());
		
		System.out.println("Elements :");
		for(String data : ob) {
			System.out.println(data);
		}
		
		System.out.println("Forward : ");
		ListIterator ir = ob.listIterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("Backward:");
		while(ir.hasPrevious()) {
			System.out.println(ir.previous());
		}
		
	}

}
