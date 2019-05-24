<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inicial</title>
<link rel="stylesheet" href="resources/css/formas.css">
</head>
<body class="grad1">
	<h2>Informaci&oacute;n del Cliente:</h2>
		<c:if test="${not empty resultado}">
			<h3>No hay informaci&oacute;n del Cliente disponible</h3>
		</c:if>
		<table cellpadding="5" border="1">
			<tr>
				<td><b>Titulo:</b></td>
				<td>${book.n_titulo}</td>
			</tr>
			<tr>
				<td><b>Autor:</b></td>
				<td>${book.escritor}</td>
			</tr>
			<tr>
				<td><b>Genero:</b></td>
				<td>${book.tipo}</td>
			</tr>
			<tr>
				<td><b>ISBN: </b></td>
				<td>${book.pcode}</td>
			</tr>
			<tr>
				<td><b>Cantidad: </b></td>
				<td>${book.total}</td>
			</tr>
		</table>
</body>
</html>