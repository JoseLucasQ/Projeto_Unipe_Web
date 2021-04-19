<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form:form method="POST" modelAttribute="morador">
		<p>Nome: <input type="text" name="nome"/></p>
		<p>Local: <input type="text" name="Local"/></p>
		<p><input type="submit" name="enviar"/></p>
		<p> ${mensagem}</p>
	</form:form>

</body>
</html>