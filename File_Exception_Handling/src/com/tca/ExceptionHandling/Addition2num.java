package com.tca.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Addition2num {
		public static void main(String[] args) throws IOException
		{
			System.out.println("HI.....");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a=0,b=0;
			while(true) {
				try 
				{
					System.out.println("Enter Your 1st Number: ");
					a= Integer.parseInt(br.readLine());
					System.out.println("1st Number is :" + a);
					break;
					
				}
				catch(NumberFormatException ne)
				{
					System.out.println("Please Enter Integer only ");
				}
			}
			while(true) {
				try 
				{
					System.out.println("Enter Your 2nd Number: ");
					b= Integer.parseInt(br.readLine());
					System.out.println("2nd Number is :" + b);
					break;
					
				}
				catch(NumberFormatException ne)
				{
					System.out.println("Please Enter Integer only ");
				}
			}
			
			System.out.println( "Sum is : " + (a+b));
		}
}
