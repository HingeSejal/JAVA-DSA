<%@ page language="java" %>

<html>
<head>
<title>Online Exam Login</title>
</head>

<body>

<h2>Student Login</h2>

<form action="exam.jsp" method="post">
Username: <input type="text" name="username" required><br><br>

Password: <input type="password" name="password" required><br><br>

<input type="checkbox" name="remember"> Remember Me <br><br>

<input type="submit" value="Login">
</form>

<%
String username = request.getParameter("username");

if(username != null)
{
    if(request.getParameter("remember") != null)
    {
        Cookie ck = new Cookie("user", username);
        ck.setMaxAge(60*60*24);
        response.addCookie(ck);
    }
}
%>

</body>
</html>