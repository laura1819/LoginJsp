<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Iniciar sesion</h1>
	
	<form action="<%=request.getContextPath()%>/InicioSesion" method="post">
	<label>Nombre</label>
		<input name="usuario" type="text" required /><br>
		<label>Contraseña</label>
		<input name="pass" type="password" required/><br>
		<input type="submit" value="iniciar sesion"/>
		</br>
	</form>
	No tienes una cuenta...<a href="Registro.jsp">Registrate</a>
</body>
</html>