package nom1;

public abstract class Administrativo extends Empleado{

	// ATRIBUTOS
	private short dependencia;
		
	// CONSTRUCTORES
	public Administrativo(String nombre,String id,short edad,double sueldo,short dependencia,String eps,String pension,boolean estado) {
		super(nombre,id,edad,sueldo,eps,pension,estado);
		this.dependencia = dependencia;
	}
		
	// METODOS

	public short getDependencia() {
		return dependencia;
	}

	public void setDependencia(short dependencia) {
		this.dependencia = dependencia;
	}
	
	abstract double nomina(int opc);
	
}
