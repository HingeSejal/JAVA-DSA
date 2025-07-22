package Functions;

import java.util.*;
public class First {
    public static void printName(String name){
        System.out.println(name);
        return;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter ur name:");
        String name = sc.next();
        printName(name);
    }
}  
/*
FUnctions are stored in memory in the form of stack 
memory is emptied why function is called 
*/
