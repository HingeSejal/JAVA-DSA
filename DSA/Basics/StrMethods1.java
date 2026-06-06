import java.io.*;
public class StrMethods1{
	public static void main(String args[]){
     String s ="TCA.txt";
     if(s.endsWith(".txt")){ 
        System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }

     String p ="Code for Life";
     if(p.startsWith("Code")){  // exact Case(capital & small) should Match
        System.out.println("YES");
     }
     else{
        System.out.println("NO");
     }
}
}
