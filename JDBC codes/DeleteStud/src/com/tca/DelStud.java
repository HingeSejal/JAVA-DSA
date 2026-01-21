package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DelStud {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			
			//connection
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			System.out.println("Enter Roll No to del record: ");
			int rno = Integer.parseInt(br.readLine()); 
			
			ps = con.prepareStatement("DELETE from STUDENT where rno=?");
			ps.setInt(1, rno);
			
			int rval = ps.executeUpdate();
			
			if(rval==0) {
				System.out.println("No record found with rno : "+ rno);
			}
			else
			{
				System.out.println("Deleted Successfully : ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Problem while deleting in DB ");
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				ps.close();
				br.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
