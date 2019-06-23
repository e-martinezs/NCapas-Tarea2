<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursal</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
<div class="form">
	<h1>Sucursal</h1>
	<form:form action="${pageContext.request.contextPath}/updateSucursal" method="POST" modelAttribute="sucursal">
		<label>Nombre: </label>
		<form:input class="form-control" type="text" name="nombre" path="nombre"/>
		<form:errors path="nombre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Ubicacion: </label>
		<form:input class="form-control" type="text" name="ubicacion" path="ubicacion"/>
		<form:errors path="ubicacion" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Horario apertura: </label>
		<form:input class="form-control" type="time" name="horarioApertura" path="horarioApertura"/>
		<form:errors path="horarioApertura" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Horario cierre: </label>
		<form:input class="form-control" type="time" name="horarioCierre" path="horarioCierre"/>
		<form:errors path="horarioCierre" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Mesas: </label>
		<form:input class="form-control" type="number" name="mesas" path="nMesas"/>
		<form:errors path="nMesas" cssStyle="color:#E81505;"></form:errors><br>
		
		<label>Gerente: </label>
		<form:input class="form-control" type="text" name="gerente" path="nomGerente"/>
		<form:errors path="nomGerente" cssStyle="color:#E81505;"></form:errors><br>
		
		<form:input type="hidden" name="id" path="id"/>
		<input class="btn btn-primary" type="submit" value="Guardar">
	</form:form>
</div>
</body>
</html>