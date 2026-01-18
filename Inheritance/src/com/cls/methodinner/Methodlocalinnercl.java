package com.cls.methodinner;
import java.io.*;

class Alpha
{
	void display() {
		int i=11;
		
		class B{
			int j=22;
			void show()
			{
				System.out.println("In show");
				 System.out.println(j);
			}
		}
		System.out.println("In show");
		 System.out.println(i);
		 B ob=new B();
		 ob.show();
	}
}
public class Methodlocalinnercl {
	public static void main(String args[]) throws Exception{
		Alpha ob = new Alpha();
		ob.display();
	}
}
