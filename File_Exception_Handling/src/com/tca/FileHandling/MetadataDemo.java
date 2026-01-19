package com.tca.FileHandling;

import java.io.File;

public class MetadataDemo {

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
		if(! f.isDirectory()) //Folder
		{
			System.out.println(args[0] + "Not a Directory");
			System.exit(0);
		}
		System.out.println("File Name :" + f.getName());
		System.out.println("File Path :" + f.getAbsolutePath());
		System.out.println("File Size :" + f.length());
		System.out.println("Readble :" + f.canRead());
		System.out.println("Writable :" + f.canWrite());
		System.out.println("Executable :" + f.canExecute());
		
		//Printing Entries
		
		String fnames[] = f.list();
		System.out.println("No of Entries :" + fnames.length);
		System.out.println("List of Entries :");
		for(int i=0;i<fnames.length;i++) {
			System.out.println(fnames[i]);
		}
		
		//count of files in directory
		
		File fobs[] = f.listFiles();
		int dcnt=0;
		int fcnt=0;
		for(File f1 : fobs ) {
			if(f1.isFile()) {
				fcnt++;
			}
			if(f1.isDirectory()) {
				dcnt++;
			}
		}
		System.out.println("No of File Count :" + fcnt);
		System.out.println("No of Directories Count :" + dcnt);
		
		//delete .txt files from directory taken as a input
		
		for(File f2 : fobs ) {
			if(f2.getName().endsWith(".txt"))
			{
				f2.delete();
				System.out.println(f2.getName() + ": Deleted Successfully");
			}
		}
		
	}

}
