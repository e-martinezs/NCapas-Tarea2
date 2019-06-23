<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
	<div class="form">
		<h1>Login</h1>
		<form:form action="${pageContext.request.contextPath}/login" modelAttribute="usuario">
			<label>Username </label>
			<form:input class="form-control" type="text" name="username" path="username"/>
			<form:errors path="username" cssStyle="color:#E81505;"></form:errors><br>
			
			<label>Password </label>
			<form:input class="form-control" type="password" name="password" path="password"/>
			<form:errors path="password" cssStyle="color:#E81505;"></form:errors><br>
			
			<input class="btn btn-primary" type="submit" value="Entrar">
		</form:form>
		<p style="color:#E81505;">${message}</p>
	</div>
</body>
</html>