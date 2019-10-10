package Bean;

public class Usuario {
	private int id_usuario;
	private String apellido;
	private String usuario;
	private String nombre;
	private String pass;
	
	
	public Usuario(int id_usuario, String apellido, String usuario, String nombre, String pass) {
		super();
		this.id_usuario = id_usuario;
		this.apellido = apellido;
		this.usuario = usuario;
		this.nombre = nombre;
		this.pass = pass;
	}

	

	public int getId_usuario() {
		return id_usuario;
	}


	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPass() {
		return pass;
	}


	public void setPass(String pass) {
		this.pass = pass;
	}



	@Override
	public String toString() {
		return "Usuario \n\t- id_usuario=" + id_usuario + ", \n\t- apellido=" + apellido + ", \n\t- usuario=" + usuario
				+ ", \n\t- nombre=" + nombre + ", \n\t- pass=" + pass;
	}
	
	
	
	
	
}
