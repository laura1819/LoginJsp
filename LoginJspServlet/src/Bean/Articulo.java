package Bean;

public class Articulo {
	private int id_articulo;
	private String nombre;
	private int Stock;
	
	public Articulo(int id_articulo, String nombre, int stock) {
		super();
		this.id_articulo = id_articulo;
		this.nombre = nombre;
		Stock = stock;
	}

	public int getId_articulo() {
		return id_articulo;
	}

	public void setId_articulo(int id_articulo) {
		this.id_articulo = id_articulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return Stock;
	}

	public void setStock(int stock) {
		Stock = stock;
	}

	@Override
	public String toString() {
		return "Articulo \n\t- id_articulo=" + id_articulo + ", \n\t- nombre=" + nombre + ", \n\t- Stock=" + Stock;
	}
	
	
	
	
	
}
