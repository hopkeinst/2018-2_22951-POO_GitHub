package biblioteca;

public class Persona {
	
	public int ID;
	public int identificacion;
	public String nombre;
	public int telefono;
	public String direccion;
	public String genero;

	public Persona(int iD, int identificacion, String nombre, int telefono, String direccion, String genero) {
		super();
		ID = iD;
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.genero = genero;
	}
	
	public Persona() {
		
	}

}
