package Basics;
import java.util.*;
public class Dtype {
    public static void main(String[] args){
        // String name ="SEJA PVT" ;
        int age = 20;
        double price= 67.7623;
        int a=35;

        // name = "HINGE"; //can be modified


        Scanner sc= new Scanner(System.in);
        String name = sc.next();//takes only first word as a token
        String name2 = sc.nextLine(); //takes entire line
        System.out.println(name2);
    }
}

/*
Datatypes in Java
1) Primitive
byte => 8bits
short
char(2)
boolean(1)
int(4)
long(8)
float(4)
double(8)

2)NonPrimitive
String
Array
Class
Obj
Interface

*/