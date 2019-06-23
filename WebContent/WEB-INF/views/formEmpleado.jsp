<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleado</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
<div class="form">
	<h1>Empleado</h1>
	<form:form action="${pageContext.request.contextPath}/updateEmpleado" method="POST" modelAttribute="empleado">
		<label>Nombre</label>
		<form:input class="form-control" type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Edad</label>
		<form:input class="form-control" type="number" name="edad" path="edad"/>
		<form:errors path="edad" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Genero</label>
		<form:radiobutton name="genero" path="genero" value="M"/><label>M</label>
		<form:radiobutton name="genero" path="genero" value="F"/><label>F</label>
		<form:errors path="genero" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Estado</label>
		<form:radiobutton name="estado" path="estado" value="true"/><label>Activo</label>
		<form:radiobutton name="estado" path="estado" value="false"/><label>Inactivo</label>
		<form:errors path="estado" cssStyle="color:#E81505;"></form:errors><br>
		
		<form:input type="hidden" name="id" path="id"/>
		<form:input type="hidden" name="sucursalId" path="sucursalId"/>
		<input class="btn btn-primary" type="submit" value="Guardar">
	</form:form>
</div>
</body>
</html>