package biblioteca;

public class Prestamo {
	public String fechaprestamo;
	public String fechaEntrega;
	public String fechaEntregaReal;
	
// CONTRUCTORES //
	
	public Prestamo(String fechaprestamo, String fechaEntrega, String fechaEntregaReal) {
		super();
		this.fechaprestamo = fechaprestamo;
		this.fechaEntrega = fechaEntrega;
		this.fechaEntregaReal = fechaEntregaReal;
	}

	public Prestamo() {
		
	}
	
// MÉTODOS //
	
	public boolean revisarEstadoUsuario(int idUsuario,boolean tipoUsuario) {
//Para revisar si el usuario puede o no prestar un libro
		return true;
	}
	
	public boolean revisarEstadoLibro(String nombreLibro,boolean tipoUsuario) {
//Para revisar si de un libro hay algún ejemplar disponible
		return true;
	}
	
	public void generarRegistroPrestamo(int idUsuario,boolean tipoUsuario,int idEjemplar) {
//Para generar el registro del préstamo de usuario con un ejemplar
	}
	
	public void generarDeuda(int idUsuario,boolean tipoUsuario,int idEjemplar) {
//Para generar el registro de una deuda respecto a un usuario y libro
	}
}
