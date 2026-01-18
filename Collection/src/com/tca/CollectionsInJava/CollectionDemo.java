package com.tca.CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {

	public static void main(String[] args) {
		
		ArrayList<String> aob= new ArrayList<String>();
		
		aob.add("Sachin");
		aob.add("Sourabh");
		aob.add("Rahul");
		
		System.out.println("List: " + aob);
		System.out.println("No of elements: " + aob.size());
		
		System.out.println("Display using Iterator:");
		
		Iterator ir = aob.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("Display using For each Loop : ");
		
		for(String data : aob)
		{
			System.out.println(data);
		}
		
		aob.clear();
		
		System.out.println("List: " + aob);
	}

}
