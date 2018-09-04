package biblioteca;

public class Lector {

	public int ID;
	public String estado;
	public boolean deuda; 
	
// CONSTRUCTORES //
	
	public Lector(int iD, String estado, boolean deuda) {
		super();
		this.ID = iD;
		this.estado = estado;
		this.deuda = deuda;
	}

	public Lector() {
		
	}
	
// MÉTODOS //
	
	public String consultarLibro(String nombreLibro) {
//Para que el lector mire si está el libro, y si está libre o prestado
		return "";
	}
	
	public int consultarDeuda(String idLector) {
//Para saber si el lector tiene una deuda, y si es así de cuánto sería
		return 0;
	}

}
