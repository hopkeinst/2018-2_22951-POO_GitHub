package nom1;

public abstract class Docente extends Empleado{
	
	// ATRIBUTOS
	public short facultad;
		
	// CONSTRUCTORES
	public Docente(String nombre,String id,short edad,double sueldo,String ePS,String pension,short facultad,boolean estado) {
		super(nombre,id,edad,sueldo,ePS,pension,estado);
		this.facultad = facultad;
	}
		
	// METODOS
	public short getFacultad() {
		return facultad;
	}

	public void setFacultad(short facultad) {
		this.facultad = facultad;
	}
	
	abstract double nomina(int opc);

}
