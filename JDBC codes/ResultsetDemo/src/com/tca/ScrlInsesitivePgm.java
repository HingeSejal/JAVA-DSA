package com.tca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ScrlInsesitivePgm {
       public static void main(String args[]) {
    	   Connection con = null;
    	   PreparedStatement ps = null;
    	   
    	   try {
	    	   Class.forName("org.postgresql.Driver");
	    	   con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/advjavadb","sejal","sej@123");
	    	   
//	    	   ps = con.prepareStatement("Select * from Student order by rno",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
//	    	   ResultSet rs = ps.executeQuery();
	    	   
	    	   ps = con.prepareStatement("Select * from Student order by rno",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
	    	   ResultSet rs = ps.executeQuery();
	    	   
//	    	   while(rs.next()) {
//					System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
//				}
//	    	   System.out.println("------------------------------");
//	    	   while(rs.previous()) {
//					System.out.println(rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
//				}
//	    	   rs.absolute(3);
//	    	   System.out.println("Third Row :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
//	    	   
//	    	   rs.first();
//	    	   System.out.println("First Row :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
//	    	   
//	    	   rs.last();
//	    	   System.out.println("Last Row :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
//	    	   
//	    	   rs.deleteRow(); // as we r using scrollsensitive updatable , if we delete row will be deleted from database, change reflected
	    	   
//	    	   rs.absolute(1);
//	    	   System.out.println("Before ->  :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));
//	    	   
//	    	   System.out.println("Press any key to continue");
//	    	   System.in.read(); // stuck the code 
//	    	   
//	    	   //updated database meanwhile hence refreshing them shows change
//	    	   rs.refreshRow();
//	    	   System.out.println("After -> :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
	    	   
	    	   rs.absolute(4);
	    	   System.out.println("Before ->  :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));
	    	   rs.updateString(2,"Vihaan");
	    	   rs.updateRow();
	    	   System.out.println("Record is updated :");
	    	   rs.refreshRow();
	    	   System.out.println("After -> :"+ rs.getInt(1)+ " "+rs.getString(2)+ " "+rs.getDouble(3));;
	    	   
	    	   System.out.println("Executed successfully");
			
    	   }
    	   catch(Exception e) {
    		   System.out.println("Failed Execution");
    	   }
    	   finally {
    		   try {
    			   ps.close();
    			   con.close();
    		   }
    		   catch(Exception e){
    			   e.printStackTrace();
    		   }
    	   }
       }
}
