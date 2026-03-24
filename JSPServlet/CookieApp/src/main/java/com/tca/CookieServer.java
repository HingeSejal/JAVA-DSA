package com.tca;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet({ "/CookieServer", "/show", "/form","/sub" })
public class CookieServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sub = request.getParameter("sub");
		if(sub != null){
			  out.println("you selected "+sub+" saved");
		} else {
		    RequestDispatcher rd = request.getRequestDispatcher("/choices.html");
	        rd.forward(request, response);   
		}
		
		Cookie c[] = request.getCookies();
		int cnt ;
		
		if(c==null) {
			cnt=1;
		}
		else {
			cnt = c.length+1;
		}
		String key = "ID"+cnt;
		
		Cookie ck = new Cookie(key,sub);
		ck.setPath("/");
		response.addCookie(ck);
		
		out.close();
	}
}
