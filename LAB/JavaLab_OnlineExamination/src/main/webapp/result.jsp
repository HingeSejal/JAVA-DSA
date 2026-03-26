<%@ page session="true" %>

<%
String answer = request.getParameter("q1");

int score = 0;

if("Language".equals(answer)){
    score = 1;
}
%>

<html>
<body>

<h2>Exam Result</h2>

<p>Your Score: <%= score %></p>

<a href="logout.jsp">Logout</a>

</body>
</html>
