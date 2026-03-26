<%@ page session="true" %>
<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
        response.sendRedirect("loginPage.html");
    }
%>

<h2>Welcome, <%= user %>!</h2>
<a href="logout.jsp">Logout</a>
