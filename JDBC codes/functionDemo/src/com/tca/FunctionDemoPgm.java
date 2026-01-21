package com.tca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class FunctionDemoPgm {
public static void main(String[] args) throws SQLException {
		
		Connection con = null;
		CallableStatement cst =null;
		ResultSet rs = null;
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		final String DB_URL = "jdbc:postgresql://localhost:5432/advjavadb";
		final String DB_User = "sejal";
		final String DB_PwD = "sej@123";
		final String DB_DRIVER = "org.postgresql.Driver";
		
		
		try
		{
			Class.forName(DB_DRIVER);
			
			//connection
			cst = con.prepareCall("select msg()");
			
			/*	
				int x = 2;
				int y = 5;
				
				cst = con.prepareCall("select add(?,?)");
				cst.setInt(1, x);
				cst.setInt(2, y);
			*/
				
				int r = 106;
				String nm = "FFF";
				double p = 97.65;
				
				cst = con.prepareCall("select add_info(?,?,?)");
				cst.setInt(1, r);
				cst.setString(2,nm);
				cst.setDouble(3, p);
							
				rs = cst.executeQuery();
				
				if( rs.next() )
				{
					System.out.println("Resonse : " + rs.getString(1));
				}
				else
				{
					System.out.println("No response !!");
				}
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally 
			{
				cst.close();
				rs.close();
				con.close();
			}

	}

}

/*
Three Types of Statements:
Statement : Static SQL 
PreparedStatement : Dynamic SQL (Runtime la input change hote)
CallableStatement : Execute PLSQL (To call procedure , fun , trigger, cursor)
                    to call stored function from java we use CallableStatement
*/
