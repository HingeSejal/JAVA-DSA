<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% 

	String per = request.getParameter("per");
	String grade = request.getParameter("grade");
    
	//session values are stored in object
	//so convert it into string
	
	String fname = session.getAttribute("fn").toString();
	String lname = session.getAttribute("ln").toString();
   
	session.invalidate(); //existing page data removed 
	
%>

<h2>Marksheet</h2>

<!-- use expression tag to print values -->
First Name : <%=fname %><br><br>
Last Name  : <%=lname %><br><br>
Percentage : <%=per %><br><br>
Grade 	   : <%=grade %><br><br>

<a href="./Page1.html">GO HOME</a>
</body>
</html>