package com.tca.FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadingFilesDemo {

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
		if(! f.isFile()) //with extenstions
		{
			System.out.println(args[0] + "Not a File");
			System.exit(0);
		}
		
		
		FileReader fr=null;
		
		try
		{
			fr = new FileReader(args[0]);
			
			//read ch by ch
			
			System.out.println("Content of File Ch by Ch : ");
			while(true)
			{
				int ch = fr.read(); 
				if(ch==-1)
				{
					break;
				}
				System.out.println((char)ch);
			}
			
			//readng line by line
			
			BufferedReader br = new BufferedReader(fr);
			System.out.println("Content of File Line by Line: ");
			while(true)
			{
				String line = br.readLine();
				if(line==null)
				{
					break;
				}
				System.out.println(line);
			}
			
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
			}
			catch(Exception e)
			{
				System.out.println("Problem while Closing File");
			}
		}
	}

}
