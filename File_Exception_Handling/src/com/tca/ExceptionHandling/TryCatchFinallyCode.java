package com.tca.ExceptionHandling;


class A
{
	void display()
	{
		try
		{
			int a[]= {12,45,54};
			System.out.println(a[5]);
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Invalid Index !");
		} 
		finally
		{
			System.out.println("Im in Finally !");
//			f.close();
//			db.close();
		}
		System.out.println("End of Method !");
	}
}

public class TryCatchFinallyCode {
	public static void main(String[] args) 
	{
		System.out.println("Hi....");
		
		A ob = new A();
		ob.display();
		System.out.println("End of Main  !");
		
	}
	
}
