<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Manejo de formularios con Spring</title>
<link rel="stylesheet" href="resources/css/formas.css">
<script type="text/javascript" src="resources/jquery-1.12.3.js"></script>
<script type="text/javascript" src="resources/sweetalert/sweetalert.min.js"></script>
</head>
<style>
th, td {
  padding: 5px;
  text-align: center;
}
</style>
<body class="grad1">

	<h1>${cabeza}</h1>
		<table class="datagrid">
			<thead>
				<tr style="background-color: #cecece">
					<th>Titulo</th>
					<th>Autor</th>
					<th>Genero</th>
					<th>ISBN</th>
					<th>Cantidad</th>
					
				<tr>
			</thead>
			<tbody>
				<c:forEach var="c" items="${books}">
					<tr>
						<td><c:out value="${c.getn_titulo()}"/></td>
						<td><c:out value="${c.getescritor()}"/></td>
						<td><c:out value="${c.gettipo()}"/></td>
						<td><c:out value="${c.getcode()}"/></td>
						<td><c:out value="${c.gettotal()}"/></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<input type="button" class="MyButton" value="Menu" onclick="location.href='${pageContext.request.contextPath}/'"/>
</body>
</html>