<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



</head>
<body>
	<h1>Registro</h1>

	<form action="<%=request.getContextPath()%>/RegistroUsuario"
		method="post" >
		<label>Nombre</label>
		 <input type="text" name="nombre" id="nombre" required/><br>
		 <label>Usuario</label>
		<input type="text" name="usuario" id="usuario" required/><br>
		 <label>Apellido</label>
		<input type="text" name="apellido" id="apellido" required/><br>
		 <label>Contraseña</label>
		<input type="password" name="pass"  id="pass" required/><br>
		 <input type="submit"
			value="registro" />
	</form>
</body>




</html>

