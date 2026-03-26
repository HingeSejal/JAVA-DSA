package com.tca;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet({"/LoginFormServlet", "/login"})
public class LoginFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public LoginFormServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String user = request.getParameter("user");
		String password = request.getParameter("password");
		
//		out.println(user + password);
		
		if(user.equals("sejal") && password.equals("123") )
		{
//			out.println("<h1> Login Successful !!!!! </h1>");
			
//			response.sendRedirect("https://www.technocompacademy.com"); //request method GET
//			response.sendRedirect("./HomeServlet");
			//redirected by get method only !!!!!!!!!!
			
			RequestDispatcher rd = request.getRequestDispatcher("./HomeServlet");
			rd.forward(request,response);
			//redirected by post method  because the login.html has post method !!!!!!!!!!
		}
		else
		{
			//out.println("<h1> Login Failed !!! </h1>");
			//out.println("<script> alert('Login Failed !');  </script>");
			RequestDispatcher rd = request.getRequestDispatcher("/login.html");
			rd.forward(request,response);
//			out.println("<a href='./login.html'>  Click Here to Login ! </a> ");
			
//			out.println("<form method='POST' action='./login'>");
//			out.println("Username : <input type='text' name='uname'> <br><br>");
//			out.println("Password : <input type='password' name='pwd'> <br>");
//			out.println("<input type='submit' value='login'>");
//			out.println("</form>");
			
		
		}
		
		out.close();
		
	}

}
