package Controlador;

import Dao.ArticuloDao;

import java.util.ArrayList;

import Bean.Articulo;

public class ArticulosC {
	
	public static ArrayList<Articulo> obtenerArticulos() {
		return ArticuloDao.mostrarArticulos();
	}
}
