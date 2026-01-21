package com.tca;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UpdateStud {
	
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
			
			System.out.println("Enter Rno to update record: ");
			int rno = Integer.parseInt(br.readLine());
			
			System.out.println("Set Name to update record: ");
			String name = br.readLine();	
			
			ps = con.prepareStatement("Update student SET name=? where rno=?");
			ps.setString(1, name); // 1 is first ? in query written above
			ps.setInt(2, rno); 
			
			int rval1 = ps.executeUpdate();
			
			if(rval1==0) {
				System.out.println("No record found with rno : "+ rno);
			}
			else
			{
				System.out.println("Updated Successfully : ");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Problem while updating in DB ");
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

/*
 Three Types of Statements:
 Statement : Static SQL 
 PreparedStatement : Dynamic SQL (Runtime la input change hote)
 CallableStatement : Execute PLSQL (To call procedure , fun , trigger, cursor)
 */