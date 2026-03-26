<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session='true' %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Retrieval</title>
</head>
<body>
<% 
	String fname = request.getParameter("fn");
	String lname = request.getParameter("ln");

	//implicit object u dont have to create externally as we used to do in servlet
	//just add page directive
	
	session.setAttribute("fn",fname);
	session.setAttribute("ln",lname);
%>

<form method='Post' action='./page3.jsp'>
Percentage : <input type='text' name='per' required><br><br>
Grade 	   : <input type='text' name='grade' required><br><br>
<button type='submit' value='Next' >Next</button>
</form>

</body>
</html>