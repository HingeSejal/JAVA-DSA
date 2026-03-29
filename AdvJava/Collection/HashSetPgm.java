package AdvJava.Collection;

import java.util.HashSet;

public class HashSetPgm {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();
        hs.add("Pune");
        hs.add("Sahyandri");
        hs.add("Gondia");
        hs.add("Pune"); // duplicate element will be ignored

        System.out.println("HashSet: " + hs); // HashSet does not maintain any order
        System.out.println("Is 'Pune' present in HashSet? " + hs.contains("Pune"));
        // Removing an element
        hs.remove("Sahyandri");
        System.out.println("After removing 'Sahyandri': " + hs);    
        // Size of the HashSet
        System.out.println("Size of HashSet: " + hs.size()); //no of elements in hashset
        System.out.println("Is HashSet empty? " + hs.isEmpty());

    }

}
