<%@ page session="true" %>

<%
String user = (String) session.getAttribute("user");

if(user == null){
    response.sendRedirect("login.jsp");
}

Integer timeLeft = (Integer) session.getAttribute("timeLeft");
%>

<html>
<head>
<title>Online Exam</title>
</head>

<body>

<h2>Welcome <%= user %></h2>

<p>Time Left: <%= timeLeft %> minutes</p>

<form action="<%= response.encodeURL("result.jsp") %>" method="post">

Q1: Java is a ?
<br>

<input type="radio" name="q1" value="Language">Language<br>
<input type="radio" name="q1" value="OS">Operating System<br>
<input type="radio" name="q1" value="Hardware">Hardware<br>

<br>

<input type="submit" value="Submit Exam">

</form>

</body>
</html>
