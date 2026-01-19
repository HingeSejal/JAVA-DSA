package com.tca.CollectionsInJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> tst = new TreeSet<>();
		
		//no duplicate values
		//not syncronised
		//not thread safe
		
		tst.add(13);
		tst.add(27367);
		tst.add(2);
		tst.add(277);
		tst.add(87);
		tst.add(87);
		System.out.println("Sorted Content using Treeset :"+tst);
//		System.out.println("Descending Content :"+tst.descendingSet());
		
		//printing in sorted Order
//		Iterator ir = tst.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
		
		
		
		HashSet<Integer> hst = new HashSet<>();
		
		//no duplicate values
		//not syncronised
		//not thread safe
		
		hst.add(13);
		hst.add(27367);
		hst.add(2);
		hst.add(277);
		hst.add(87);
		hst.add(87);
		System.out.println("Content using Hashset-(Modulo) :"+hst);
		
		
		
		LinkedHashSet<Integer> lhst = new LinkedHashSet<>();
		
		//Ordered Version of hashset maintains dll
		//no duplicate values
		//not syncronised
		//not thread safe
		
		lhst.add(13);
		lhst.add(27367);
		lhst.add(2);
		lhst.add(277);
		lhst.add(87);
		lhst.add(87);
		System.out.println("Content using LinkedHashset :"+lhst);
	}

}
