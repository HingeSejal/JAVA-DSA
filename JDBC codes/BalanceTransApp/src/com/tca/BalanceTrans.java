package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Savepoint;

public class BalanceTrans {
public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		PreparedStatement ps1 = null;
		PreparedStatement ps2 = null;
		PreparedStatement ps3 = null;
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
			
			con.setAutoCommit(false);
			
			//auto-commited - not suitable cause Transaction Result partially reflectded in database even of in mid error occured
			
			ps1 = con.prepareStatement("Update account Set balance = balance-500 where ano=101");
			ps1.executeUpdate();
			
			//error occured
//			Integer.parseInt(DB_User);
			ps2 = con.prepareStatement("Update account Set balance = balance+500 where ano=102");
			ps2.executeUpdate();
			
			Savepoint pt1 = con.setSavepoint("Save Point");
			
			ps3 = con.prepareStatement("Update account Set balance = balance-500 where ano=103");
			
			
			int j=ps3.executeUpdate();
			
					
//			if(i==0) {
//				con.rollback());
//			}
			if(j==0) {
				con.rollback();
			}
			
			con.commit();
			System.out.println("Transferred successfully");
			
		}
		catch(Exception e)
		{
			System.out.println("Transation failed due to server error");
			con.rollback(); // jithun error aali..tyacha aadhich pan implemented part rollback 
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				ps1.close();
				ps2.close();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

//To ensure ACID properties in database we r getting autocommit off and make it externally commited once done and  rollback if error occured
