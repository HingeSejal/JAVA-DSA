<%@ page language="java" %>
<%@ page import="model.Contact" %>

<%
    Contact contact =
        (Contact) request.getAttribute("contactData");
%>

<!DOCTYPE html>
<html>
<head>
    <title>Thank You</title>
</head>
<body>

<h2>Thank You, <%= contact.getName() %>!</h2>

<p>We have received your message:</p>
<p><strong>Email:</strong> <%= contact.getEmail() %></p>
<p><strong>Message:</strong> <%= contact.getMessage() %></p>

</body>
</html>
