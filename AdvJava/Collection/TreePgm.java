package AdvJava.Collection;

import java.util.*;;

public class TreePgm {
    public static void main(String[] args) {

        TreeSet<String>  ts = new TreeSet<>();
        ts.add("Pune");
        ts.add("Sahyandri");
        ts.add("Gondia");
        ts.add("Pune"); // duplicate element will be ignored

        System.out.println("TreeSet: " + ts); // TreeSet will store elements in sorted order
        System.out.println("In decending order: " + ts.descendingSet()); // to get elements in descending order

        System.out.println("Is 'Pune' present in TreeSet? " + ts.contains("Pune"));
        // Accessing elements
        System.out.println("First element: " + ts.first());
        System.out.println("Last element: " + ts.last());
        // Removing an element
        ts.remove("Sahyandri");
        System.out.println("After removing 'Sahyandri': " + ts);    
        // Size of the TreeSet
        System.out.println("Size of TreeSet: " + ts.size()); //no of elements in treeset
        System.out.println("Is TreeSet empty? " + ts.isEmpty());


    }
}
