package com.tca.CollectionsInJava;

import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class InsertDelete {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> aob = new ArrayList<>();
		
		while(true)
		{
			System.out.print("how many Cities?");
			int n = Integer.parseInt(br.readLine());

			
			for(int i=0;i<n;i++) 
			{
				System.out.print("What is City name ?");
				String city =br.readLine();
				aob.add(city);
			}
			
			System.out.print("list: " + aob);
			
			System.out.print("Do u want to add more?(yes/no)");
			String option= br.readLine();
			option = option.toLowerCase();
			
			if(option.equals("no"))
			{
				break;
			}
		}
		
	}

}
