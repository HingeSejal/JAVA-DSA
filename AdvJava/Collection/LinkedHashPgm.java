package AdvJava.Collection;

import java.util.LinkedHashSet;

public class LinkedHashPgm {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Pune");
        lhs.add("Sahyandri");
        lhs.add("Gondia");
        lhs.add("Pune"); // duplicate element will be ignored

        System.out.println("LinkedHashSet: " + lhs); // LinkedHashSet maintains insertion order
        System.out.println("Is 'Pune' present in LinkedHashSet? " + lhs.contains("Pune"));
        // Removing an element
        lhs.remove("Sahyandri");
        System.out.println("After removing 'Sahyandri': " + lhs);    
        // Size of the LinkedHashSet
        System.out.println("Size of LinkedHashSet: " + lhs.size()); //no of elements in linkedhashset
        System.out.println("Is LinkedHashSet empty? " + lhs.isEmpty());

    }
}
