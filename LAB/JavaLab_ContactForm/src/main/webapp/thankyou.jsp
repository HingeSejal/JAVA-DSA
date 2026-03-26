<%@ page import="com.jspmlab.Contact" %>

<%
Contact contact = (Contact) request.getAttribute("contact");
%>

<html>
<head>
<title>Submission Successful</title>
</head>

<body>

<h2>Thank You!</h2>

<p>Your message has been submitted successfully.</p>

<b>Name:</b> <%= contact.getName() %> <br><br>
<b>Email:</b> <%= contact.getEmail() %> <br><br>
<b>Message:</b> <%= contact.getMessage() %>

</body>
</html>