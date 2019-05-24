<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Busqueda en Libreria</title>
<link rel="stylesheet" href="resources/css/formas.css">
<script type="text/javascript" src="resources/jquery-1.12.3.js"></script>
<script type="text/javascript" src="resources/sweetalert/sweetalert.min.js"></script>
</head>
<body class="grad1">
<script type="text/javascript">
	function buscar(){
		if($("#codigo").val() == ""){
			swal({
				  title: "Error!",
				  text: "Ingrese un parametro de busqueda",
				  icon: "error",
				});
		}
		else $('#form1').submit();
	}
</script>

	<h1>Buscador de Biblioteca</h1>
		<form:form id="form1" method="post" action="${pageContext.request.contextPath}/searchbook">
		<h2>Buscar por:</h2>
		<table cellpadding="5">
			<tr>
				<td><input class="inputs" type="text" id="codigo" name="codigo" placeholder="Ingrese el Autor/Genero/ISBN" /></td> 
			</tr>
			<tr>
				<td><input type="button" class="myButton" value="Buscar" onclick="buscar()" />
				<input type="button" class="myButton" value="Ver Todos" 
				onclick="location.href='${pageContext.request.contextPath}/vertodos'" /></td>
				<td><select id="lista" name="lista" class"myButton"/>
					<option value="isbn">ISBN</option>
					<option value="genero">GENERO</option>
					<option value="autor">AUTOR</option>
					</select>
				</td>
			</tr>
		</table>
		</form:form>
</body>
</html>