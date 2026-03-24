<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.Date, java.io.* , java.util.* "  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello JSP</title>
</head>
<body>

<%
	String user = request.getParameter("un");
	if(user.isEmpty()){
		out.println("No Input is Received !");
	}
	else{
		Date d = new Date();
		
		int hr= d.getHours();
		
		if(hr<12){
			out.println("<h2> Hello" + user + " Good Morning</h2>");
		}
		else if(hr>12 && hr<16){
			out.println("<h2> Hello" + user + " Good Afternoon</h2>");
		}
		else{
			out.println("<h2> Hello" + user + " Good Evening </h2>");
		}
	}
%>

</body>
</html>