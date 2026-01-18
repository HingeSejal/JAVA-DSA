package com.tca.FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileRandomAccessing {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("a.txt","rw"); //rw mode
		
		System.out.println(rf.readLine());
		File f = new File("a.txt");
		rf.seek(f.length());
		rf.seek(12); //second ch la gheun gelo curser
		rf.writeBytes("love   ");
		rf.seek(0);
		System.out.println(rf.readLine());
		

	}

}
