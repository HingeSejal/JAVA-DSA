<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	int a=6;
	//int b=2;
	int b=0;
	
	int ans= a/b;
	
	out.println("Division : " + ans);
	
	int val = Integer.parseInt("IND");
%>

</body>
</html>

<!-- 

MIME - MUltiPurpose Internet Mail Extensions 
contentType="text/html; charset=UTF-8" -> consider file as html
contentType="text/plain; charset=UTF-8" -> plain text will be printed

 -->