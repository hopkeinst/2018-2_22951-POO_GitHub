package nom1;

public class DCatedra extends Docente{
	
	// ATRIBUTOS
	final private static int vHora = 16000;
	private static int horas;
		
	// CONSTRUCTORES
	public DCatedra(String nombre,String id,short edad,short facultad,String ePS,String pension,int horas,boolean estado) {
		super(nombre,id,edad,horas*vHora*4.5,ePS,pension,facultad,estado);
		DCatedra.horas = horas;
	}
		
	// METODOS
	public String toString() {
		return(this.nombre+" => { ID: "+this.id+" | "+this.getEdad()+" años | Tiene "+DCatedra.getHoras()+" horas semanales | Facultad: "+this.facultad+" | EPS: "+this.getePS()+" | Pension: "+this.getPension()+ " }");
	}

	public static int getHoras() {
		return horas;
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
