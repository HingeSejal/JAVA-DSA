package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AddNStud {

	public static void main(String[] args) throws SQLException {
		
		// write a jdbc app which stores 'n' records in student table.
		Connection con = null;
		PreparedStatement ps =null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		ps = con.prepareStatement("Insert into Student values(?,?,?)");
		
		try
		{
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			while(true) {
				
				System.out.println("Enter Rno to update record: ");
				int rno = Integer.parseInt(br.readLine());
				
				System.out.println("Set Name to update record: ");
				String name = br.readLine();	
				
				System.out.println("Enter Percentage to update record: ");
				Double per = Double.parseDouble(br.readLine());
				
				
				ps.setInt(1,rno);
				ps.setString(2,name);
				ps.setDouble(3,per);
				
				ps.executeUpdate();
	
								
				System.out.println("Do u want to continue?[Yes/No]");
				String option = br.readLine();
				
				if(option.equalsIgnoreCase("yes"))
					continue;
				else
					break;
				}
			
			System.out.println("Record Inserted Successfully ");

			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally 
			{
				ps.close();
				con.close();
			}

		}
}