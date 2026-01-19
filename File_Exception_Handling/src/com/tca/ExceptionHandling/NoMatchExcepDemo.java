package com.tca.ExceptionHandling;

import java.io.*;

class NoMatchException extends Exception
{
	NoMatchException(String m)
	{
		super(m);
	}
}
public class NoMatchExcepDemo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		try
		{
			System.out.println("Enter String :");
			String name = br.readLine();
			
			name = name.toUpperCase();
			
			if(name.contains("INDIA")) {
				System.out.println("String has India !");
			}
			else
			{
				throw new NoMatchException("Given String is not India");
			}
		}
		catch(IOException ie)
		{
			System.out.println("Pgm I/O error");
		}
		catch(NoMatchException nme)
		{
			nme.printStackTrace();
		}
		finally
		{
			System.out.println("C u soon");
		}
	}
	
}
