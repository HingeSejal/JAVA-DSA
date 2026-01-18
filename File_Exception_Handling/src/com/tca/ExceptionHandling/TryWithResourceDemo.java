package com.tca.ExceptionHandling;

import java.io.*;


public class TryWithResourceDemo {

	public static void main(String[] args) {
		System.out.println("Hi:");
		
	try(BufferedReader br = new BufferedReader(new InputStreamReader (System.in)))
		{
			System.out.println("Enter String :");
			String name = br.readLine();
			
			name = name.toUpperCase();
			
			if(name.contains("INDIA")) {
				System.out.println("String has India !");
			}
			else
			{
				throw new NoMatchException("Given String doesn't have India");
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
