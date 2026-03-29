package AdvJava.Collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class xyz implements Comparator<String> {
    public int compare(String s1, String s2) {
        return Integer.compare(s1.length(), s2.length());
    }

    //this is a custom comparator that compares two strings based on their lengths.
    // suppose s1="Pune" s2="Sahyandri"
    // s1.equals(s2) -> false
    // s1.compareTo(s2) -> -1 (because "Pune" is shorter than "Sahyandri")
}
public class ComparatorPgm {
    public static void main(String[] args) {
        // Comparator is an interface in Java that is used to compare two objects of the same class. 
        // It provides a way to sort objects based on a specific property or criteria. 
        // The Comparator interface has a single method called compare() that takes two objects as parameters and returns an integer value. 
        // The compare() method returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second argument.

        // Example of using Comparator to sort a list of strings based on their lengths

        
        List<String> a = new ArrayList<>();
        a.add("Pune");
        a.add("Sahyandri");
        a.add("Gondia");
        a.add("Gondia");

        System.out.println("Before sorting: " + a);
        a.sort(new xyz()); 
        // sorting based on the lengths of the strings using the custom comparator defined in the xyz class.
    
        System.out.println("After sorting: " + a);

    }
}
