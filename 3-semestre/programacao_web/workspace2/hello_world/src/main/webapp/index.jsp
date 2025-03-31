<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>

	<h1>Este hello world é muito legal</h1>
	
	<%
	for(int i=1;i<=10;i++){
		%>
		<p>Este é o paragrafo numero: <%= i %></p>
		<%
	}
	%>
	
</body>
</html>