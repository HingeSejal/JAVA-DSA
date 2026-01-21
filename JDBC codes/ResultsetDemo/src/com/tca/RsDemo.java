package com.tca;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RsDemo {
	
	
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
			
			ps = con.prepareStatement("Select *  from student",ResultSet.TYPE_FORWARD_ONLY , ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = ps.executeQuery();
			
//			stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY , ResultSet.CONCUR_READ_ONLY);
//			ResultSet rs = stmt.executeQuery("Select * from student");
			
			System.out.println("-------Forward way---------");
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));
//				System.out.println("Roll Number : "+rs.getInt("rno"));
//				System.out.println("Name : "+rs.getString("name"));
//				System.out.println("Per : "+rs.getDouble("per"));
			}
			System.out.println("Records are displaced Successfully");
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

