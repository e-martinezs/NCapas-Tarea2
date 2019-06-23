<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursal</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
<div class="content">
	<h1>Sucursal</h1>
	<form action="${pageContext.request.contextPath}/verSucursales">
		<input class="btn btn-primary float-right" type="submit" value="Ver todas las sucursales">
	</form>
	<table class="table">
		<thead class="thead-dark">
		<tr>
			<th>Id<th>
			<th>Nombre<th>
			<th>Ubicaci&oacute;n<th>
			<th>Horario Apertura<th>
			<th>Horario Cierre<th>
			<th>Mesas<th>
			<th>Gerente<th>
		</tr>
		</thead>
		<tr>
			<td>${sucursal.id}<td>
			<td>${sucursal.nombre}<td>
			<td>${sucursal.ubicacion}<td>
			<td>${sucursal.horarioApertura}<td>
			<td>${sucursal.horarioCierre}<td>
			<td>${sucursal.nMesas}<td>
			<td>${sucursal.nomGerente}<td>
		</tr>
	</table>
	<h3>Empleados</h3>
	<form action="${pageContext.request.contextPath}/formEmpleadoAgregar">
		<input type="hidden" name="sucursalId" value="${sucursal.id}">
		<input class="btn btn-primary float-right" type="submit" value="Agregar Empleado">
	</form>
	<table class="table">
		<thead class="thead-dark">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Genero</th>
			<th>Estado</th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${empleados}" var="empleado">
			<tr>
				<td>${empleado.id}</td>
				<td>${empleado.nombre}</td>
				<td>${empleado.edad}</td>
				<td>${empleado.genero}</td>
				<td>${empleado.estadoDelegate}</td>
				<td>
					<form action="${pageContext.request.contextPath}/formEmpleadoEditar">
						<input type="hidden" name="id" value="${empleado.id}">
						<input class="btn btn-secondary" type="submit" value="Editar">
					</form>
				</td>
				<td>
					<form action="${pageContext.request.contextPath}/eliminarEmpleado">
						<input type="hidden" name="id" value="${empleado.id}">
						<input type="hidden" name="sucursalId" value="${sucursal.id}">
						<input class="btn btn-danger" type="submit" value="Eliminar">
					</form>
				</td>
			<tr>
		</c:forEach>
	</table>
</div>
</body>
</html>