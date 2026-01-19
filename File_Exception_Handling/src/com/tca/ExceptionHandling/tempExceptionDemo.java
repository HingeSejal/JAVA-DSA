package com.tca.ExceptionHandling;

import java.io.*;

class TemperatureException extends Exception
{
	TemperatureException (String m)
	{
		super(m);
	}
}

public class tempExceptionDemo {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		try
		{
			System.out.println("Enter Temp:");
			float temp = Float.parseFloat(br.readLine());
			
			if(temp<94)
			{
				throw new TemperatureException("Temp is below normal");
			}
			if(temp>100)
			{
				throw new TemperatureException("Temp is High");
			}
			System.out.println("Normal Temp:");
		}
		catch(IOException ie)
		{
			System.out.println("Pgm I/O error");
		}
		catch(NumberFormatException ne)
		{
			System.out.println("Given input is not valid Temp");
		}
		catch(TemperatureException te)
		{
			te.printStackTrace();
		}
		finally
		{
			System.out.println("C u soon");
		}
	}

}
