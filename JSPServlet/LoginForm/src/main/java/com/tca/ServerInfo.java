//package com.tca;
//
//import jakarta.servlet.ServletContext;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet("/LoginForm")
//public class ServerInfo extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//      
//    public ServerInfo() {
//        super();
//    }
//
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		pw.println("<h1>Hello TCA</h1>");
//		
//		pw.println("<br> Request Methd  : "+ request.getMethod());
//		pw.println("<br> Request URL    : "+ request.getRequestURL());
//		pw.println("<br> Protocol       : "+ request.getProtocol());
//		pw.println("<br> Remote address : "+ request.getRemoteAddr());
//		pw.println("<br> Server Name    : "+ request.getServerName());
//		pw.println("<br> Port Number    : "+ request.getServerPort());
//		
//		ServletContext sc = getServletContext();
//		pw.println("<br> Server s/w : "+ sc.getServerInfo());
//		
//		pw.close();
//		
//	}
//
//}
