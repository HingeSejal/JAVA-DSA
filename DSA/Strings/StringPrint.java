package DSA.Strings;

import java.util.*;

public class StringPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // single word input
        String midname = sc.nextLine(); //line input

        System.out.println("your name is : "+ name);
        
        System.out.println("your midname is : "+ midname);

        String fullname = name+"@"+midname;

        System.out.println("your fullname is : "+ fullname);

        System.out.println("your fullname length is : "+ fullname.length());

        for(int i=0; i<fullname.length(); i++){
            System.out.println("Character at index "+i+" is : "+fullname.charAt(i));
        }

        //s1>s2 :  +ve value
        //s1==s2 : 0
        //s1<s2 :  +ve value

        //depend on first character
        if (name.compareTo(midname) == 0) {
            System.out.println("Names are  equal");
        }
        else{
            System.out.println("Names are not equal");
        }

        //DO NOT USE == to check for string equality
       //Gives correct answer here
       if(name == midname) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }


       //Gives incorrect answer here
       if(new String("Tony") == new String("Tony")) {
           System.out.println("They are the same string");
       } else {
           System.out.println("They are different strings");
       }

        

    }
}
