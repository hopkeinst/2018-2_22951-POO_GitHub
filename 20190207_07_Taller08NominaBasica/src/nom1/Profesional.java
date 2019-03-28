package nom1;

public class Profesional extends Administrativo{
	
	// ATRIBUTOS
	private static double sueldo = 1800000;
		
	// CONSTRUCTORES
	public Profesional(String nombre,String id,short edad,String eps,String pension,short dependencia,boolean estado) {
		super(nombre,id,edad,sueldo,dependencia,eps,pension,estado);
	}
		
	// METODOS
	public String toString() {
		return(this.nombre+" => { ID: "+this.id+" | "+this.getEdad()+" años | Dependencia: "+this.getDependencia()+" | EPS: "+this.getePS()+" | Pension: "+this.getPension()+ " }");
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		Profesional.sueldo = sueldo;
	}
	
	double nomina(int opc) {
		if((opc == this.getDependencia()) && (this.getEstado() == true)) {
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
