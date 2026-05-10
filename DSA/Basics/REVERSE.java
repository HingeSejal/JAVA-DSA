import java.io.*;
public class REVERSE{
	public static void main(String args[]){
     String s ="TCA";
     // we cant directly  perform s.reverse() as String is immutable 
     StringBuffer sb = new StringBuffer(s); 
     // Stringbuffer is mutable(can be changed) 
     sb.reverse();
     s = new String(sb);
     System.out.println(s); //ACT
}
}
