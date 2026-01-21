package com.tca.sqlprj;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddStudSql {

	public static void main(String[] args) throws IOException {
		
		
		Connection con = null;
		PreparedStatement ps = null;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			//load Driver -> communication between java app and db happens using driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/advjavadb","sejal","sejal@123");
			
			//prepare SQL/form SQL Query
			
			//Accept values from user
			System.out.println("Enter Roll no: ");
			int rno = Integer.parseInt(br.readLine()); 
			//not mandatory that col name and var name should same
			
			System.out.println("Enter Name: ");
			String name = br.readLine();
			
			System.out.println("Enter per: ");
			Double per = Double.parseDouble(br.readLine());
			
			ps = con.prepareStatement("INSERT INTO STUDENT VALUES(?,?,?)");
			ps.setInt(1, rno);
			ps.setString(2,name);
			ps.setDouble(3,per);
			
			ps.executeUpdate();
			
			System.out.println("Record saved Successfully !!!!!");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Problem while inserting in DB ");
			e.printStackTrace();
		}
		finally
		{
			try {
				con.close();
				br.close();
			}
			catch(SQLException e)
			{
				System.out.println("Problem while closing connection");
				e.printStackTrace();
			}
		}
	

	}

}
