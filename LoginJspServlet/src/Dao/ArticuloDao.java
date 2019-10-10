package Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Bean.Articulo;
import Controlador.ArticulosC;
import Modelo.Conexion;

public class ArticuloDao {

	static PreparedStatement pst = null;
	static ResultSet rs = null;

	public static ArrayList<Articulo> mostrarArticulos() {
		Conexion con = new Conexion();
		int id = 0;
		String nombre = null;
		int stock = 0;
		ArrayList<Articulo> articulos = new ArrayList<Articulo>();

		String consultaArticulos = "SELECT * FROM articulos";
		// pst = getConexion().prepareStatement(consultaArticulos);
		try {
			pst = con.getConexion().prepareStatement(consultaArticulos);
			rs = pst.executeQuery();
			/*
			 * while (rs.next()) { System.out.println( "id del articulo: " + rs.getInt(1) +
			 * " nombre: " + rs.getString(2) + " Stock: " + rs.getInt(3)); }
			 */

			while (rs.next()) {
				id = rs.getInt(1);
				nombre = rs.getString(2);
				stock = rs.getInt(3);
				Articulo articulo = new Articulo(id, nombre, stock);
				articulos.add(articulo);
				
			}
			// articulos.toString();
			// articulos.get(1).getNombre();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return articulos;
	}
/*
	public static void main(String[] args) {

		ArticuloDao art = new ArticuloDao();
		
		int longi = art.mostrarArticulos().size();
		
		for (int i = 0; i < longi;i++) {
			//System.out.print(art.mostrarArticulos().get(i).getId_articulo());
		//	System.out.print(art.mostrarArticulos().get(i).getNombre());
			System.out.println(art.mostrarArticulos().get(i).toString());
		}
		
		
		
	}
*/
}