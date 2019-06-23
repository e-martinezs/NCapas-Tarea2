<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${label} Empleado</title>
</head>
<body>
	<h1>${label} Empleado</h1>
	<form:form action="${pageContext.request.contextPath}/agregarEmpleado" method="POST" modelAttribute="empleado">
		<label>Nombre</label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<label>Edad</label>
		<form:input type="text" name="edad" path="edad"/><br>
		<label>Genero</label>
		<form:input type="text" name="genero" path="genero"/><br>
		<label>Estado</label>
		<form:radiobutton name="estado" path="estado" value="true"/><label>Activo</label><br>
		<form:radiobutton name="estado" path="estado" value="false"/><label>Inactivo</label><br>
		
		<form:input type="hidden" name="id" path="id"/>
		<form:input type="hidden" name="sucursalId" path="sucursalId"/>
		<input type="submit" value="${label}">
	</form:form>
</body>
</html>