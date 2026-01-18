package com.tca.ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatchBasics {
		public static void main(String[] args) 
		{
			System.out.println("HI.....");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num=0;
			while(true) {
			try 
			{
				System.out.println("Enter Your Number: ");
				num = Integer.parseInt(br.readLine());
				System.out.println("Number is :" + num);
				break;
				
			}
			catch(IOException i)
			{
				System.out.println("IO problem");
			}
			catch(NumberFormatException ne)
			{
				System.out.println("Please Enter Integer only ");
			}
			catch(Exception e)
			{
				System.out.println("Unknown error Occur in Application !");
				e.printStackTrace();  //method of throwable Class
			}
			}
			
		}
}
