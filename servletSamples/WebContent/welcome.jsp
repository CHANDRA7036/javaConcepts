<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
//including the file indlude directive
<%@ include file="welcome.html" %>  
<%! int data=50; %> 

<%= "Value of the variable is:"+data %>  

<%="Welcome"+request.getParameter("uname")%>

<%out.print("Today is"+java.util.Calendar.getInstance().getTime()); %>

<%@ page import="java.util.Date" %>  
Today is: <%= new Date() %>  

</body>
</html>