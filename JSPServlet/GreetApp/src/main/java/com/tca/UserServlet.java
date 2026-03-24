package com.tca;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet({ "/UserServlet", "/user" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       //Text -> Binary conversion is serializatiion (1 key for data conversion) and 
	   //Binary -> Text conversion is deserializatiion
	  //servlet class of version ID 1
	   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ByDefault browser implements doget method 
		
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		String uname = request.getParameter("un");

		//returns String
		String fnStr = request.getParameter("fn");
		String snStr = request.getParameter("sn");
		
	    
		if (uname.isBlank() || fnStr.isBlank()|| snStr.isBlank() )  //usse js for this
		{
		    out.println("<h2>All Input haven't Received!</h2>");
		}
		else
		{
		    // Convert String to Integer
		    int fn = Integer.parseInt(fnStr);
		    int sn = Integer.parseInt(snStr);
		    
		    out.println("Hello " + uname + ", Welcome to coding World!");
		    out.println("Addition is : " + (fn + sn));
		}

		//all the validations are need to be done using JS or html 
		// in servlet it may cause longer time for parsing and not considered as good practice
		
		//http://localhost:8080/GreetApp/user.html
		
		out.close();
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("Text/html");
		PrintWriter out = response.getWriter();
		
		//String uname = request.getParameter("un");
		//give same as mentioned in html
		// external file always comes with string datatype 
		out.println("I love food !");
		out.println("Request.getMethd:" + request.getMethod());
		//http://localhost:8080/GreetApp/user.html
		
		out.close();
		
	}

}
