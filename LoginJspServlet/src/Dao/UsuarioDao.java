package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Bean.Usuario;
import Modelo.Conexion;

public class UsuarioDao extends Conexion {

	static PreparedStatement pst = null;
	static ResultSet rs = null;

	public boolean auteticacion(String usuario, String pass) {

		try {
			String consulta = "SELECT * FROM usuarios where usuario = ? and pass = ?";
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, usuario);
			pst.setString(2, pass);
			rs = pst.executeQuery();
			// guarddamos el resultaaddo en resutl set
			// si encuentra un registro retorna verdadero
			// y si no por defecto va sacar falso

			if (rs.absolute(1)) {
				return true;
			}

		} catch (Exception e) {
			System.out.print("error" + e);
		} finally {

			try {
				if (getConexion() != null)
					getConexion().close();
				if (pst != null)
					pst.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.print("error" + e);
			}
		}

		return false;

	}

	public boolean registrar(String apellido, String usuario, String nombre, String pass) {

		try {

			String consultauno = "SELECT * FROM usuarios where usuario = ?";
			pst = getConexion().prepareStatement(consultauno);
			pst.setString(1, usuario);
			rs = pst.executeQuery();
			// guarddamos el resultaaddo en resutl set
			// si encuentra un registro retorna verdadero
			// y si no por defecto va sacar falso

			if (rs.absolute(1)) {
				return false;
			}

			String consulta = "INSERT INTO usuarios (apellido, usuario, nombre, pass) values (?,?,?,?)";
			pst = getConexion().prepareStatement(consulta);
			pst.setString(1, apellido);
			pst.setString(2, usuario);
			pst.setString(3, nombre);
			pst.setString(4, pass);

			if (pst.executeUpdate() == 1) {
				return true;
			}

		} catch (Exception e) {
			System.out.println("error " + e);
		} finally {

			try {
				if (getConexion() != null)
					getConexion().close();
				if (pst != null)
					pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return false;

	}

	public Usuario obtenerUsuarioNombre(String usuario) {
		// TODO Auto-generated method stub
		Conexion con = new Conexion();
		int id = 0;
		Usuario usr = null;
		String apellido = null;
		String user = null;
		String nombre = null;
		String pass = null;
		
		
		try {

			String consultauno = "SELECT * FROM usuarios where usuario = ?";
			pst = con.getConexion().prepareStatement(consultauno);
			pst.setString(1, usuario);
			rs = pst.executeQuery();
			// guarddamos el resultaaddo en resutl set
			// si encuentra un registro retorna verdadero
			// y si no por defecto va sacar falso
			while(rs.next()) {
			id = rs.getInt(1);
			apellido = rs.getString(2);
			user = rs.getString(3);
			nombre = rs.getString(4);
			pass = rs.getString(5);
			}
			
			usr = new Usuario(id, apellido, user, nombre, pass);
			//System.out.println(usr.toString());
		} catch (Exception e) {
			System.out.println("error " + e);
		} 
		return usr;
	}
/*
	public static void main (String[] args) {
		UsuarioDao user = new UsuarioDao();
		Usuario urs = user.obtenerUsuarioNombre("laura");
		System.out.println(urs.getNombre());
		//System.out.println(user.obtenerUsuarioNombre("laura"));
		
		
		System.out.println("ffff");

}
*/
}