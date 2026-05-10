import java.io.*;
public class StrMethods2{
	public static void main(String args[]){
     String s ="9999,SEJA,73653,9988";
     String[] tokens = s.split(",");
     int total = Integer.parseInt(token[2]);
     int paid = Integer.parseInt(token[3]);
     int remaining = total-paid;
     
     if(total!=paid){
      System.out.println("Hi "+ token[1] +" Ur Remaining fees is : "+ remaining);
     }
}
}
