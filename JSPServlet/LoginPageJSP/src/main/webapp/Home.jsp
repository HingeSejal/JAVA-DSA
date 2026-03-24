 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page using jsp</title>
</head>
<body>
<%

String user = request.getParameter("user");
String password = request.getParameter("password");

if(user.equals("sejal") && password.equals("123") )
{
	out.println("<h1> Login Successful !!!!! </h1>");
	response.sendRedirect("/.Login.jsp");
	
	RequestDispatcher rd = request.getRequestDispatcher("./");
}
else
{
	out.println("<script> alert('Login Failed !'); </script>");
	out.println("<a href='./loginPage.html'>Go to Home Page</a>");
}
%>
</body>
</html>