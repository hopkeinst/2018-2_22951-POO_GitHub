package nom1;

public abstract class Empleado {
	
// ATRIBUTOS
	public String nombre;
	public String id;
	private short edad;
	private double sueldo;
	private String ePS;
	private String pension;
	private boolean estado;
	
// CONSTRUCTORES
	public Empleado(String nombre, String id, short edad, double sueldo,String ePS,String pension,boolean estado) {
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
		this.sueldo = sueldo;
		this.ePS = ePS;
		this.pension = pension;
		this.estado = true;
	}
	
// METODOS
	public String toString(String dependencia) {
		return(this.nombre+" = { "+this.id+" , "+this.edad+" años , $ "+this.sueldo+" , EPS: "+this.ePS+", Pension: "+this.pension+" , Trabaja en: "+dependencia+" }");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public short getEdad() {
		return edad;
	}

	public void setEdad(short edad) {
		this.edad = edad;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public String getePS() {
		return ePS;
	}

	public void setePS(String ePS) {
		this.ePS = ePS;
	}

	public String getPension() {
		return pension;
	}

	public void setPension(String pension) {
		this.pension = pension;
	}
	
	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	abstract double nomina(int opc);

}
