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
	
	<!--<form:form method="POST" modelAttribute="conversor">-->
	<form>
		<p>Valor em dollar: <input type="text" name="dollar"/></p>
		<p>cota��o do dollar: <input type="text" name="cotacao"/></p>
		<p><input type="submit" name="enviar"/></p>
		<p> ${mensagem}</p>
	</form>
	<!--</form:form>-->

</body>
</html>