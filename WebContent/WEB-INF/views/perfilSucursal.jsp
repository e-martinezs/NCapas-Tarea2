<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursal</title>
</head>
<body>
	<h1>Sucursal</h1>
	<table>
		<tr>
			<td>Codigo:<td>
			<td>${sucursal.id}<td>
		</tr>
		<tr>
			<td>Nombre:<td>
			<td>${sucursal.nombre}<td>
		</tr>
		<tr>
			<td>Ubicacion:<td>
			<td>${sucursal.ubicacion}<td>
		</tr>
		<tr>
			<td>Horario Apertura:<td>
			<td>${sucursal.horarioApertura}<td>
		</tr>
		<tr>
			<td>Horario Cierre:<td>
			<td>${sucursal.horarioCierre}<td>
		</tr>
		<tr>
			<td>Mesas:<td>
			<td>${sucursal.nMesas}<td>
		</tr>
		<tr>
			<td>Gerente:<td>
			<td>${sucursal.nomGerente}<td>
		</tr>
	</table>
	<h2>Empleados</h2>
	<form action="${pageContext.request.contextPath}/formEmpleadoAgregar">
		<input type="submit" value="Agregar">
	</form>
	<table>
		<tr>
			<th>Codigo</th>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Genero</th>
			<th>Estado</th>
		</tr>
		<c:forEach items="${empleados}" var="empleado">
			<tr>
				<td>${empleado.id}</td>
				<td>${empleado.nombre}</td>
				<td>${empleado.edad}</td>
				<td>${empleado.genero}</td>
				<td>${empleado.estado}</td>
				<td>
					<form action="${pageContext.request.contextPath}/formEmpleadoEditar">
						<input type="hidden" name="id" value="${empleado.id}}">
						<input type="submit" value="Editar">
					</form>
				<td>
				<td>
					<form action="${pageContext.request.contextPath}/eliminarEmpleado">
						<input type="hidden" name="id" value="${empleado.id}}">
						<input type="submit" value="Eliminar">
					</form>
				<td>
			<tr>
		</c:forEach>
	</table>
</body>
</html>