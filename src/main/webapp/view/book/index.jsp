<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listado de Productos</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>COST</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.id}</td>
					<td>${product.name}</td>
					<td>${product.cost}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>