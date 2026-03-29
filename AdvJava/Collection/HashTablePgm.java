package AdvJava.Collection;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTablePgm {
    public static void main(String[] args) {
        // Hashtable is synchronized and does not allow null keys or values
        // It is generally slower than HashMap due to synchronization overhead
        // It is a legacy class and is not recommended for new code

        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "Pune");
        ht.put(2, "Sahyandri");
        ht.put(3, "Gondia");
        ht.put(1, "Pune"); // duplicate key will update the value
        ht.put(4, "Pune"); // duplicate value is allowed
        System.out.println("Hashtable: " + ht); // Hashtable does not maintain any order
        System.out.println("Is key '1' present in Hashtable? " + ht.containsKey(1));
        System.out.println("Value for key '2': " + ht.get(2));          
        // Removing an element
        // ht.remove(2);
        // System.out.println("After removing key '2': " + ht);
        // Size of the Hashtable
        System.out.println("Size of Hashtable: " + ht.size()); //no of key-value pairs in hashtable
        System.out.println("Is Hashtable empty? " + ht.isEmpty());  

        Enumeration keys = ht.keys();
        System.out.print("Keys in Hashtable: ");
        while (keys.hasMoreElements()) {
            Integer key = (Integer) keys.nextElement();
            String value = ht.get(key);
            System.out.print(key + ":" + value + " ");
            // System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        for(Integer key : ht.keySet()) { //keySet() returns a Set of keys in the hashtable
            String value = ht.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
