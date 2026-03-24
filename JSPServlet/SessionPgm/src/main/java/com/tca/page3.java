package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/page3")
public class page3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
//		Object a = 10;
//		String s = a.toString();  //"10"
//		
//		int x =  Integer.parseInt(a.toString());  // x=10
		
//		Object ob = request;
		
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		
		
		String sjbook[] = request.getParameterValues("sjbook"); // 0: "450" 1: "300"
		
		int sjtotal = 0; // 750
		
		if(sjbook != null)
		{
			for(String data : sjbook)
			{
				sjtotal = sjtotal + Integer.parseInt(data);
			}
		}
		
		HttpSession s = request.getSession(false);  // Dont create new SESSION, Use Existing one
		
		int ltotal = Integer.parseInt( s.getAttribute("p1total").toString() );  // 700 Object ---toString--> "700"
		
		int bill = ltotal + sjtotal;
				
		out.println("Page 1 : Rs. "    + ltotal + "<br>");
		out.println("Page 2 : Rs. "    + sjtotal + "<br>");
		out.println("Total Bill : Rs." + bill + "<br>");
		
		s.invalidate();  // close/clear the data from session
		
		out.println("<a href='./page1.html'> Go Home </a>");
		out.close();
	}

}
