<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empleado</title>
</head>
<body>
	<h1>Empleado</h1>
	<form:form action="${pageContext.request.contextPath}/updateEmpleado" method="POST" modelAttribute="empleado">
		<label>Nombre</label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Edad</label>
		<form:input type="number" name="edad" path="edad"/>
		<form:errors path="edad" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Genero</label><br>
		<form:radiobutton name="genero" path="genero" value="M"/><label>M</label><br>
		<form:radiobutton name="genero" path="genero" value="F"/><label>F</label><br>
		<form:errors path="genero" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Estado</label><br>
		<form:radiobutton name="estado" path="estado" value="true"/><label>Activo</label><br>
		<form:radiobutton name="estado" path="estado" value="false"/><label>Inactivo</label><br>
		<form:errors path="estado" cssStyle="color:#E81505;"></form:errors><br>
		
		<form:input type="hidden" name="id" path="id"/>
		<form:input type="hidden" name="sucursalId" path="sucursalId"/>
		<input type="submit" value="Guardar">
	</form:form>
</body>
</html>