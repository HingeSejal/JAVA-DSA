<%@ page import="com.jspmlab.Contact" %>
<%@ page import="jakarta.servlet.RequestDispatcher" %>

<%
String name = request.getParameter("name");
String email = request.getParameter("email");
String message = request.getParameter("message");

Contact contact = new Contact();

contact.setName(name);
contact.setEmail(email);
contact.setMessage(message);

request.setAttribute("contact", contact);

RequestDispatcher rd = request.getRequestDispatcher("thankyou.jsp");
rd.forward(request, response);
%>