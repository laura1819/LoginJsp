package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class Conexion {

	private Connection con;
	private Statement st;
	private ResultSet rs;
	
	public Conexion() {
		try {
			  Class.forName("com.mysql.jdbc.Driver");
			  con = DriverManager.getConnection("jdbc:mysql://127.0.0.1/loginjsp", "root", "");
			  st = con.createStatement();
			  System.out.println("conexion correcta");
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
	
	public Connection getConexion() {
		return con;
	}
	/*
	public static void main(String[] args) {
		Conexion con = new Conexion();
		con.getConexion();
		
	}
	*/
}
