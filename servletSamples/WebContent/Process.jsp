<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page errorPage="Error.jsp" %>
<%

String num1=request.getParameter("num1");
String num2=request.getParameter("num2");

int i=Integer.parseInt(num1);
int j=Integer.parseInt(num2);
int k=i/j;
out.print("division number is:"+k);

%>

Value is ${ sessionScope.user }  

</body>
</html>