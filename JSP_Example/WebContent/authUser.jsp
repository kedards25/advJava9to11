<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<%
			String userNm=request.getParameter("username");
			String userPass=request.getParameter("userpass");
			
			if(userNm.equals("Kedar")&& userPass.equals("123"))
			{
				%>
					<h1>Welcome <% out.println(userNm); %></h1>
				<%
			}
			else
			{
				%>
					<h1>Sorry Login failed</h1>
				<%
			}
		%>
</body>
</html>