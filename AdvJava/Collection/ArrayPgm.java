package AdvJava.Collection;

import java.util.ArrayList  ;
import java.util.*  ;
import java .io.* ;


public class ArrayPgm {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Pune");
        list.add("Sahyandri");
        list.add("Pune");
        
        
        System.out.println("ArrayList: " + list);
        
        // Accessing elements
        System.out.println("First element: " + list.get(0));
        
        // Removing an element
        // list.remove(1);
        // System.out.println("After removing second element: " + list);
        
        // Size of the ArrayList
        System.out.println("Size of ArrayList: " + list.size()); //no of elements in arraylist

//         Iterator ir = list.iterator();
//         int cnt = 0 ;
//         while(ir.hasNext()){
//             String str = (String) ir.next(); 
//  //       here arraylist is of string type so we can directly use string type instead of object type 
//             if (str.equals("Pune")){ 
//                 cnt++;
//             }
//         }
//         System.out.println("Number of 'Pune' elements: " + cnt);

        for(String str : list){
                System.out.println(str);
            }
    }
}