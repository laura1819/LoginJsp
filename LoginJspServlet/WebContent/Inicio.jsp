<%@page import="java.awt.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page import="Controlador.ArticulosC"%>
<%@ page import="Bean.Articulo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>hola usuario: ...........acceso correcto!</h1>

	<form action="<%=request.getContextPath()%>/Logout.jsp" method="post">
		Nombre: <input type="text" name="myObjectId" value="${user}" /></br> <input
			type="submit" value="Logout" />
	</form>

	<h3>Lista de articulos:</h3>
	
	<table>

		<tr>
			<td>Id Producto</td>
			<td>Nombre</td>
			<td>Stock</td>
		</tr>
	<%
		ArrayList<Articulo> listado = ArticulosC.obtenerArticulos();

		for (Articulo a : listado) {
	%>
		<tr>
			<td><%=a.getId_articulo() %></td>
			<td><%=a.getNombre() %></td>
			<td><%=a.getStock() %></td>
			<td><input type="button" value="añadir"/></td>			
		</tr>
	<%
		}
	%>

	</table>

</body>
</html>