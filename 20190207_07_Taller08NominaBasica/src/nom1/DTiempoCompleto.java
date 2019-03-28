package nom1;

public class DTiempoCompleto extends Docente{
	
	// ATRIBUTOS
	final static private double sueldo = 3000000;
		
	// CONSTRUCTORES
	public DTiempoCompleto(String nombre,String id,short edad,String ePS,String pension,short facultad,boolean estado) {
		super(nombre,id,edad,sueldo,ePS,pension,facultad,estado);
	}
		
	// METODOS
	public String toString() {
		return(this.nombre+" => { ID: "+this.id+" | "+this.getEdad()+" años | Facultad: "+this.facultad+" | EPS: "+this.getePS()+" | Pension: "+this.getPension()+ " }");
	}

	public double getSueldo() {
		return sueldo;
	}

	double nomina(int opc) {
		if((opc == this.getFacultad()) && (this.getEstado() == true)) {
			System.out.println("  "+this.nombre+" =>");
			System.out.println("\t\t\tSueldo: $ "+this.getSueldo());
			System.out.println("\t\t\tDescuentos: $ "+(this.getSueldo()*0.08));
			System.out.print("\t\t\tAuxilio Transporte: ");
			if(this.getSueldo()<=(Main.sMinimo*2)) {
				System.out.println("Si");
				System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(this.getSueldo()-(this.getSueldo()*0.08)+Main.auxTransporte));
				return((this.getSueldo()-(this.getSueldo()*0.08))+Main.auxTransporte);
			}else {
				System.out.println("No");
				System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(this.getSueldo()-(this.getSueldo()*0.08)));
				return(this.getSueldo()-(this.getSueldo()*0.08));
			}
		}
		return 0;
	}

}
