<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursal</title>
</head>
<body>
	<h1>Sucursal</h1>
	<form:form action="${pageContext.request.contextPath}/updateSucursal" method="POST" modelAttribute="sucursal">
		<label>Nombre: </label>
		<form:input type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ubicacion: </label>
		<form:input type="text" name="ubicacion" path="ubicacion"/>
		<form:errors path="ubicacion" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Horario apertura: </label>
		<form:input type="time" name="horarioApertura" path="horarioApertura"/>
		<form:errors path="horarioApertura" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Horario cierre: </label>
		<form:input type="time" name="horarioCierre" path="horarioCierre"/>
		<form:errors path="horarioCierre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Mesas: </label>
		<form:input type="number" name="mesas" path="nMesas"/>
		<form:errors path="nMesas" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Gerente: </label>
		<form:input type="text" name="gerente" path="nomGerente"/>
		<form:errors path="nomGerente" cssStyle="color:#E81505;"></form:errors><br>
		
		<form:input type="hidden" name="id" path="id"/>
		<input type="submit" value="Guardar">
	</form:form>
</body>
</html>