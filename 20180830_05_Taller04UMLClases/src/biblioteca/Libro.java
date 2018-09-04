package biblioteca;

public class Libro {

	public String ISBN;
	public String titulo;
	public String fechaPublicacion;
	public String idioma;
	
	public String planta;
	public byte estado;
	
// CONSTRUCTORES //
	
	public Libro(String iSBN, String titulo, String fechaPublicacion, String idioma, String planta, boolean estado) {
		super();
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
		this.idioma = idioma;
	}
	
	public Libro() {
		
	}
	
// MÉTODOS //
	
	public void asignarPlanta(String planta) {
//Para cuando cambian de planta o detmática-planta, se reasigna el libro a una planta 
// diferente
	}

}
