package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class TransactionApp {

	public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		Statement stmt = null;
//		PreparedStatement ps1 = null;
//		PreparedStatement ps2 = null;
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			
			//connection
			con = DriverManager.getConnection(DB_URL,DB_User,DB_PwD);
			
			con.setAutoCommit(false);
			
			stmt = con.createStatement();
			 
			stmt.addBatch("insert into student values(104,'Aarush',60,'9049057897')");
			stmt.addBatch("insert into student values(105,'Griha',70,'9049057987')");
			stmt.addBatch("insert into student values(106,'Lata',90,'9049057567')");
			
			int  sval[]=stmt.executeBatch();
			System.out.println("Status : "+ Arrays.toString(sval));
			
			con.commit();
			con.close();
			
			System.out.println("Success ");
		}
		catch(Exception e)
		{
			con.rollback();
			System.out.println("failed ");
			e.printStackTrace();
		}
		
	}

}
