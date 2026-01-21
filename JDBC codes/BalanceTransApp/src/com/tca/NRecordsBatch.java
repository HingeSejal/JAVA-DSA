package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class NRecordsBatch {

	public static void main(String[] args) {
		
		Connection con = null;
		PreparedStatement ps =null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			con.setAutoCommit(false);
			
			ps = con.prepareStatement("Insert into Student values(?,?,?)");
			
			while(true) {
				
				System.out.println("Enter Rno to update record: ");
				int rno = Integer.parseInt(br.readLine());
				
				System.out.println("Enter Name to update record: ");
				String name = br.readLine();	
				
				System.out.println("Enter Percentage to update record: ");
				Double per = Double.parseDouble(br.readLine());
				
				System.out.println("Enter Phno to update record: ");
				String phno = br.readLine();	
				
				ps.setInt(1,rno);
				ps.setString(2,name);
				ps.setDouble(3,per);
				
				ps.addBatch(); //Adding sql into the batch
	
								
				System.out.println("Do u want to add more?[Yes/No]");
				String option = br.readLine();
				
				if(option.equalsIgnoreCase("yes"))
					continue;
				else
					break;
				}
			
			ps.executeBatch(); //Executing Batch
			con.commit();
			con.close();
			System.out.println("Record Inserted Successfully ");

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			

	}

}
