package AdvJava.Collection;

import java.util.HashMap;

public class HashMapPgm {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Pune");
        hm.put(2, "Sahyandri");
        hm.put(3, "Gondia");
        hm.put(1, "Pune"); // duplicate key will update the value
        hm.put(4, "Pune"); // duplicate value is allowed

        System.out.println("HashMap: " + hm); // HashMap does not maintain any order
        System.out.println("Is key '1' present in HashMap? " + hm.containsKey(1));
        System.out.println("Value for key '2': " + hm.get(2));
        // Removing an element
        hm.remove(2);
        System.out.println("After removing key '2': " + hm);    
        // Size of the HashMap
        System.out.println("Size of HashMap: " + hm.size()); //no of key-value pairs in hashmap
        System.out.println("Is HashMap empty? " + hm.isEmpty());
    }
}
