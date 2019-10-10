package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.Usuario;
import Dao.UsuarioDao;


/**
 * Servlet implementation class RegistroUsuario
 */
@WebServlet("/RegistroUsuario")
public class RegistroUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistroUsuario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		String usuario = request.getParameter("usuario");
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		String pass = request.getParameter("pass");
		
		
		UsuarioDao co = new UsuarioDao();
		if(co.registrar(apellido, usuario, nombre, pass)) {
			Usuario user = co.obtenerUsuarioNombre(usuario);
			request.getSession().setAttribute("user", user.getNombre());
			response.sendRedirect("Inicio.jsp");
		}else {
			response.sendRedirect("Registro.jsp");
		}
	}
}
