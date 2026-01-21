package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;



public class DisplayPgm {
	
	public static void main(String[] args) {
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd =null;
		
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			
			//connection
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			stmt = con.createStatement();
			rs = stmt.executeQuery("Select * from Student");  //bydefault forward onlys
			//Query cha response jr record asel tr resultset use krtat - to store the result of query
			
			rsmd = rs.getMetaData();
			
			int n = rsmd.getColumnCount();
			System.out.println("No of Columns : " + n);
			
			for(int i=1;i<n;i++) {
				System.out.println("Column Name: " + rsmd.getColumnName(i));
				System.out.println("Column Type: " + rsmd.getColumnTypeName(i));
			}
			
			System.out.println("Records are displaced Successfully");
			
		}
		catch(Exception e)
		{
			System.out.println("Problem while displaying in DB ");
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				stmt.close();
				rs.close();
			
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//ResultSet(Table) chi info -> ResultSetMetaData
//ResultSet(Table) madhla data -> Records

//DatabaseMetadata - to print info of db
//-> name , version , list of tables