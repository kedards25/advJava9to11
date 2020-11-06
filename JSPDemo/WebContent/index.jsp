<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%-- This is a comment --%>
	<%
		//out is a built in object of 
		//jspwriter class
		out.println("Hello JSP");
	%>
	<br/>
	<%! int val=5; %>
	<%=val+7 %>
</body>
</html>