<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucursales</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="resources/style.css">
</head>
<body>
<div class="content">
	<h1>Sucursales</h1>
	<form action="${pageContext.request.contextPath}/formSucursalAgregar">
		<input class="btn btn-primary float-right" type="submit" value="Agregar Sucursal">
	</form>
	
	<table class="table">
		<thead class="thead-dark">
		<tr>
			<th>Id</th>
			<th>Nombre</th>
			<th>Ubicaci&oacute;n</th>
			<th>Horario Apertura</th>
			<th>Horario Cierre</th>
			<th>Mesas</th>
			<th>Gerente</th>
			<th></th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${sucursales}" var="sucursal">
			<tr>
				<td>${sucursal.id}</td>
				<td>${sucursal.nombre}</td>
				<td>${sucursal.ubicacion}</td>
				<td>${sucursal.horarioApertura}</td>
				<td>${sucursal.horarioCierre}</td>
				<td>${sucursal.nMesas}</td>
				<td>${sucursal.nomGerente}</td>
				<td>
					<form action="${pageContext.request.contextPath}/perfilSucursal">
						<input type="hidden" name="id" value="${sucursal.id}">
						<input class="btn btn-secondary" type="submit" value="Ver">
					</form>	
				</td>
				<td>
					<form action="${pageContext.request.contextPath}/formSucursalEditar">
						<input type="hidden" name="id" value="${sucursal.id}">
						<input class="btn btn-secondary" type="submit" value="Editar">
					</form>
				</td>
				<td>
					<form action="${pageContext.request.contextPath}/eliminarSucursal">
						<input type="hidden" name="id" value="${sucursal.id}">
						<input class="btn btn-danger" type="submit" value="Eliminar">
					</form>
				</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>