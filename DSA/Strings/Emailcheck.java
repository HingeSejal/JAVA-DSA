package DSA.Strings;

import java.util.Scanner;

//create username from email
//email = “helloWorld123@gmail.com”; username = “helloWorld123”

public class Emailcheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.next();
        String username = "";

        for(int i=0; i<email.indexOf("@"); i++){
            username += email.charAt(i);
        }
        System.out.println(username);

        for(int i=0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
            username += email.charAt(i);
            }
        }
        System.out.println(username);
    }
}