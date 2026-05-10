import java.io.*;
public class CharPrint{
	public static void main(String args[]){
		String s ="Sejal";
		for(int i=0;i<s.length();i++){
			System.out.println(s.charAt(i));
		}

		char a[]=s.toCharArray();
		for(int i=0;i<a.length();i++){
			System.out.println(a(i));
		}
	}
}
