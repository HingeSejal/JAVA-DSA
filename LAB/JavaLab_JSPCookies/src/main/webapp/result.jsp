<%@ page language="java" %>

<%
String user = (String)session.getAttribute("user");

if(user == null)
{
    response.sendRedirect("login.jsp");
}

String q1 = request.getParameter("q1");
String q2 = request.getParameter("q2");

int score = 0;

if("OOP".equals(q1))
score++;

if("Java Server Pages".equals(q2))
score++;
%>

<html>
<head>
<title>Result</title>
</head>

<body>

<h2>Exam Result</h2>

Student: <%= user %> <br><br>

Score: <%= score %> / 2 <br><br>

<a href="logout.jsp">Logout</a>

</body>
</html>