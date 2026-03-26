<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error</title>
</head>
<body>
<%
	String message="unknown problem occur at ur application";
	if(exception instanceof ArithmeticException )
	{
		message="U cant divide by zero !!!";
	}
	else if(exception instanceof NumberFormatException)
	{
		message="U are not giving no as input !!!";
	}
%>
<p style="color:red ;">
<%=message %>
</p>

<script>alert('<%=  message %>')</script>

<%-- 
	<%=exception%>
	out.println("<h9> Problem : " + exception + "</h2");

	//exception is default object
	//divide.jsp -> (internally) error.jsp
	//no redirection
--%>
</body>
</html>


<!-- 

types of directive
1.page 		-> to provide info to jsp page like error . import ,buffer
2.include	-> used to add content of any html or jsp file into existing jsp
3.taglib	-> when we use third party vendors tags into current jsp file

 -->
