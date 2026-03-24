package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/page2")
public class page2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");	
		PrintWriter out = response.getWriter();
		
		
		String lbook[] = request.getParameterValues("lbook"); // 0: "150" , 1:"550"
		
		int ltotal = 0;  // 0 + 150 = 150, 150 + 550 = 700 
		
		if(lbook != null)
		{
			for(int i=0; i < lbook.length; i++)
			{
				ltotal = ltotal + Integer.parseInt(lbook[i]);
			}
		}
		
		
		HttpSession hs = request.getSession(true);
		hs.setAttribute("p1total", ltotal);
		
		
		out.println("<h1> Servlet & JSP Book </h1> ");
		
		out.println("<form method=POST action='./page3'");
	
		out.println("<b>Select Servlet and JSP Books : </b> <br><br>");
		out.println("<input type=checkbox name=sjbook value=450> Name=Headfirst Servlet and JSP Rs. 450 <br><br>");
		out.println("<input type=checkbox name=sjbook value=300> Name=Java Servlet Programming  Rs. 300 <br><br>");
		out.println("<input type=checkbox name=sjbook value=250> Name= Inside Servlet           Rs.250 <br><br>");
		
		out.println("<input type=submit value=Payment> ");
		out.println("</form>");

		
		
		out.close();
	
	}

}
