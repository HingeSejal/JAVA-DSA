package DSA.Basics;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String args[]){
    System.out.println("Enter Button(1/2/3):");
    Scanner input = new Scanner(System.in);
    int button = input.nextInt();
    
    switch(button){
        case 1 : System.out.println("helloji");
        break;
        case 2 : System.out.println("Namaste");
        break;
        case 3 : System.out.println("Bonjour");
        break;
        default : System.out.println("invalid");
    }
}
}
