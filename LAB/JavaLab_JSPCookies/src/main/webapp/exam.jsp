<%@ page language="java" %>

<%
String username = request.getParameter("username");

if(username != null)
{
    session.setAttribute("user", username);
}

String user = (String)session.getAttribute("user");

if(user == null)
{
    response.sendRedirect("login.jsp");
}
%>

<html>
<head>
<title>Online Exam</title>
</head>

<body>

<h2>Welcome <%= user %></h2>

<form action="result.jsp" method="post">

Q1. Java is a ______ language.<br>
<input type="radio" name="q1" value="OOP"> OOP<br>
<input type="radio" name="q1" value="Procedural"> Procedural<br><br>

Q2. JSP stands for?<br>
<input type="radio" name="q2" value="Java Server Pages"> Java Server Pages<br>
<input type="radio" name="q2" value="Java Script Pages"> Java Script Pages<br><br>

<input type="submit" value="Submit Exam">

</form>

</body>
</html>