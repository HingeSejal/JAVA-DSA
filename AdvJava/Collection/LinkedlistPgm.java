package AdvJava.Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedlistPgm {
    public static void main(String[] args) {
        
        LinkedList<String> l= new LinkedList<>();
        l.add("Pune");
        l.add("Sahyandri");
        l.add("Pune");

        System.out.println("LinkedList: " + l);
        // Accessing elements
        System.out.println("First element: " + l.get(0));
        // Removing an element
        // l.remove(1);
        // System.out.println("After removing second element: " + l);
        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + l.size()); //no of elements in linkedlist

 //       Iterator ir = l.iterator(); //cant go back
        ListIterator ir = l.listIterator(); //move in both side
        int cnt = 0 ;
        while(ir.hasNext()){
            System.out.println(ir.next());
        }

        while(ir.hasPrevious()){
            System.out.println(ir.previous());
        }

        LinkedList<String> l1 = new LinkedList<>();
        l1.add("Red");
        l1.add("Green");
        l1.add("Blue");
        System.out.println("Second LinkedList: " + l1);

        l1.addAll(l.indexOf("Pune"),l); 
        // copy all elements of l into l1 at index of first occurrence of pune in l1
        System.out.println("After adding all elements : " + l1);

        ArrayList<String> al = new ArrayList<>();
        al.add("Yellow");
        al.add("Pink");
        System.out.println("ArrayList: " + al);
        l1.addAll(al); // copy all elements of al into l1 at end of l1
        System.out.println("After adding all elements : " + l1);

        System.out.println("First element of l1: " + l1.getFirst()) ;
        System.out.println("Last element of l1: " + l1.getLast()) ;
        System.out.println("Element at index 3 of l1: " + l1.get(3)) ;

    }
}
