package Basics;
import java.util.*;
public class Dtype {
    public static void main(String args[]){
        // String name ="SEJA PVT" ;
        int age = 20;
        double price= 67.7623;
        float a = 3434.54F;
        long l=565L;
        int b=35;

        // name = "HINGE"; //can be modified


        Scanner sc= new Scanner(System.in);
        String name = sc.next();//takes only first word as a token - print until the void space value
        sc.nextLine();
        String name2 = sc.nextLine(); //takes entire line
        System.out.println(name2);
        System.out.println(name2.charAt(2));
        System.out.println(name2.charAt(4));

        char c = sc.next().charAt(1);
        System.out.println(c);

        // String s2 = """
        //         hello dear bachho
        //         """;
                
    }
}

/*
Datatypes in Java
1) Primitive
    a) numeric
        int(4)
            long(8)
            short  
            byte => 8bits
        float
            float(4)
            double(8)
        

    b) non-numeric
        char(2)
        boolean(1)


2)NonPrimitive
String
Array
User defined
    Class
    Obj
    Interface

*/