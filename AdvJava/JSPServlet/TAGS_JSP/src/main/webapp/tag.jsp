<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!-- 

	cnt is shared across all requests & Value keeps increasing with every visitor  
	if u wrote it in the descriptive tag only the cnt is created fresh for every request
	
-->

<%!
	int cnt=0;
%>
<%
	cnt++;
out.println("<h1>VISITOR COUNT : "+cnt+"</h1>");
%>
</body>
</html>

