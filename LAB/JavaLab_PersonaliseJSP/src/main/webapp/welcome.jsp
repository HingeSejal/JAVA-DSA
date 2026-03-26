<%@ page import="java.util.Date" %>

<%
String username = request.getParameter("username");

if(username != null)
{
    session.setAttribute("user", username);
}

String user = (String)session.getAttribute("user");

if(user == null)
{
    response.sendRedirect("Login.jsp");
}
%>

<html>
<head>
<title>Welcome Page</title>
</head>

<body>

<h2>Welcome <%= user %></h2>

<p>Current Date and Time: <%= new Date() %></p>

<form action="logout.jsp">
    <input type="submit" value="Logout">
</form>

</body>
</html>