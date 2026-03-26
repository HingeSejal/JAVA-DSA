package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/AddCookies", "/add" })
public class AddCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		Cookie ck1= new Cookie("Sejal","Hinge");
		ck1.setPath("/");
		ck1.setMaxAge(6);
		
		Cookie ck2= new Cookie("Seja","Hinge");
		ck1.setPath("/");
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		
		out.println("Cookies are Saved!"); //saved in reponse obj nd send to the client 
		
		out.close();
		
	}

}
