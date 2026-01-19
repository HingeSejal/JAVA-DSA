package com.tca.FileHandling;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class CopyingFileData {

	public static void main(String[] args) {
		File f = new File(args[0]);
		
		if(args.length==0)
		{
			System.out.println("No Directory name is send on cmdline argument");
			System.exit(0);
		}
		
		if(! f.exists())
		{
			System.out.println(args[0] + "DNE");
			System.exit(0);
		}
		if(! f.isFile()) 
		{
			System.out.println(args[0] + "Not a File");
			System.exit(0);
		}
		
		FileReader fr=null;
		BufferedReader br=null;
		FileWriter fw=null;
		
		try
		{
			fr = new FileReader(args[0]);
			fw = new FileWriter(args[1],true); //true enables append mode
			
			br = new BufferedReader(fr);
			while(true)
			{
				String line = br.readLine();
				if(line==null)
				{
					break;
				}
				fw.write(line + "\n");
			}
			
			System.out.println(args[0] + "is copied into "+ args[1] + " SuccessFully !");
		}
		catch(Exception e)
		{
			System.out.println("Problem while Reading File");
		}
		finally
		{
			try
			{
				fr.close();
				br.close();
				fw.close();
			}
			catch(Exception e)
			{
				System.out.println("Problem while Closing File");
			}
		}
		
	}

}
