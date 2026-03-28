package AdvJava.Collection;

import java.util.*  ;

public class VectorPgm {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Pune");
        vector.add("Sahyandri");
        vector.add("Pune");

        vector.add("Pune");
        vector.add("Sahyandri");
        vector.add("Pune");

        vector.add("Pune");
        vector.add("Sahyandri");
        vector.add("Pune");
        
        vector.add("Pune");
        vector.add("Sahyandri");
        
        System.out.println("Vector: " + vector);
        
        // Accessing elements
        System.out.println("First element: " + vector.get(0));
        
        // Removing an element
        // vector.remove(1);
        // System.out.println("After removing second element: " + vector);
        
        // Size of the Vector
        System.out.println("Size of Vector: " + vector.size()); //no of elements in vector
        System.out.println("Capacity of Vector: " + vector.capacity());

//         Iterator ir = vector.iterator();
//         int cnt = 0 ;
//         while(ir.hasNext()){ //moves forward
//             String str = (String) ir.next();
//  //       here vector is of string type so we can directly use string type instead of object type 
//             if (str.equals("Pune")){ 
//                 cnt++;
//             }
//         }
//         System.out.println("Number of 'Pune' elements: " + cnt);

        for(String str : vector){ // move forward only
                System.out.println(str);
            }
    //-----------------------------------------------------------------------------------------

        Vector<String> vec = new Vector<>(2,3);
        vec.add("Pune");
        vec.add("Sahyandri");
        System.out.println("Vector: " + vec);
        System.out.println("Size of Vector: " + vec.size()); //no of elements in vector
        System.out.println("Capacity of Vector: " + vec.capacity());
    }
    
}
