package com.tca;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class DisplayMetadt {

	public static void main(String[] args) {
		Connection con = null;
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			
			//connection
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			DatabaseMetaData dbmd = con.getMetaData();
			
			System.out.println(dbmd.getDatabaseProductName());
			System.out.println(dbmd.getDatabaseProductVersion());
			System.out.println(dbmd.getUserName());
			System.out.println(dbmd.getDriverName());
			
			System.out.println("List of Tables : ");
			ResultSet rs = dbmd.getTables(null,null,null, new String[] {"Table"});
			
			while(rs.next()) {
				System.out.println(rs.getString("Table_name"));
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
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
