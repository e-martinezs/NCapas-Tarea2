<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Agregar Sucursal</title>
</head>
<body>
	<h1>Agregar Sucursal</h1>
	<form:form action="${pageContext.request.contextPath}/agregarSucursal" method="POST" modelAttribute="sucursal">
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<label>Ubicacion: </label>
		<form:input type="text" name="nombre" path="nombre"/><br>
		<label>Horario apertura: </label>
		<form:input type="text" name="horarioApertura" path="horarioApertura"/><br>
		<label>Horario cierre: </label>
		<form:input type="text" name="horarioCierre" path="horarioCierre"/><br>
		<label>Mesas: </label>
		<form:input type="text" name="mesas" path="nMesas"/><br>
		<label>Gerente: </label>
		<form:input type="text" name="gerente" path="nomGerente"/><br>
		
		<input type="submit" value="Agregar">
	</form:form>
</body>
</html>