package biblioteca;

public class Empleado {
	
	public int ID;
	public String arean;
	public String profesional;
	
// CONSTRUCTOR //

	public Empleado(int iD, String arean, String profesional) {
		super();
		ID = iD;
		this.arean = arean;
		this.profesional = profesional;
	}


	public Empleado() {
		
	}
	
// MÉTODOS //
	
	void prestarLibro(int idLector,int idEjemplar) {
//Para prestar un ejemplar a un lector
	}
	
	void renovarLibro(int idLector,int idEjemplar) {
//Para renovar un ejemplar a un lector
	}
	
	void solicitarPrestamoLibro(int idEmpleado,int idEjemplar) {
//Para prestar un ejemplar a un empleado
	}
			
	void renovarLibroPrestado(int idEmpleado,int idEjemplar) {
//Para renovar un ejemplar a un empleado
	}
			
	void ordenarLibro() {
//Para organizar los libros que no están en los stands
	}
	
	void ingresarNuevoLibro(String ISBN,String titulo,String fechaPublicacion,String idioma,String planta,byte estado) {
//Para ingresar un nuevo libro al sistema. Crea el objeto aquí.
	}
	
	int inventariarPlanta(String planta) {
//Para contrar cuántos libros hay en la sala
		return 0;
	}
	
	void pagarDeuda(int idLector) {
//Para cancelarle la deuda en el sistema al lector
	}

}
