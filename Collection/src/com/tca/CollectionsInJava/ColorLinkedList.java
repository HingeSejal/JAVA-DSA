package com.tca.CollectionsInJava;

import java.util.LinkedList;
import java.util.ListIterator;

public class ColorLinkedList {

	public static void main(String[] args) {
		LinkedList<String> ob = new LinkedList<>();
		ob.add("red");
		ob.add("blue");
		ob.add("yellow");
		ob.add("green");
		
		System.out.println("Names :"+ ob);
		
		System.out.println("Size :"+ ob.size());
		
		System.out.println("Forward : ");
		ListIterator ir = ob.listIterator();
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		System.out.println("Backward:");
		while(ir.hasPrevious()) {
			System.out.println(ir.previous());
		}
		
		LinkedList<String> lst2 = new LinkedList<>();
		lst2.add("pink");
		lst2.add("blue");
		
		System.out.println("Current LinkedList :"+ lst2);
		System.out.println("Old LinkedList :"+ ob);
		
		int i = ob.indexOf("blue");
		ob.addAll(i+1,lst2);
		
		System.out.println("New LinkedList :"+ ob);
	}

}
