package biblioteca;

public class Ejemplar {
	
	public int id;
	public String editorial;
	public String fechaEntrada;
	public String estado;
	
// CONSTRUCTORES //
	
	public Ejemplar(int id, String editorial, String fechaEntrada, String estado) {
		super();
		this.id = id;
		this.editorial = editorial;
		this.fechaEntrada = fechaEntrada;
		this.estado = estado;
	}

	public Ejemplar() {
		
	}
	
// MÉTODOS //
	
	public byte revisarEstado() {
//Para saber si este libro está prestado o en la biblioteca o en sala o en bodega
		return 0;
	}

}
