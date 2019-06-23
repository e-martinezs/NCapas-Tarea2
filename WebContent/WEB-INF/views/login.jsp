<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<h1>Login</h1>
	<form:form action="${pageContext.request.contextPath}/login" modelAttribute="usuario">
		<label>Username: </label>
		<form:input type="text" name="username" path="username"/>
		<form:errors path="username" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Password: </label>
		<form:input type="password" name="password" path="password"/>
		<form:errors path="password" cssStyle="color:#E81505;"></form:errors><br>
		
		<input type="submit" value="Entrar">
	</form:form>
	<p style="color:#E81505;">${message}</p>
</body>
</html>