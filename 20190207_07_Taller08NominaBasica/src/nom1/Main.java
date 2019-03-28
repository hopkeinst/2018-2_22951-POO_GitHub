package nom1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
// OBJETOS
	static Scanner sc = new Scanner(System.in);
	static ArrayList <DCatedra> catedra;
	static ArrayList <DMedioTiempo> medioTiempo;
	static ArrayList <DTiempoCompleto> tiempoCompleto;
	static ArrayList <AOPS> ops;
	static ArrayList <Auxiliar> auxiliar;
	static ArrayList <Tecnico> tecnico;
	static ArrayList <Profesional> profesional;
	static DCatedra dcat;
	static DMedioTiempo dmt;
	static DTiempoCompleto dtc;
	static AOPS aops;
	static Auxiliar aaux;
	static Tecnico atec;
	static Profesional apro;
	
// VARIABLES
	static double[] riesgos = {0.00348,0.00435,0.00783,0.0174,0.03219};
	final static double sMinimo = 828116;
	final static double auxTransporte = 97032;
	static short opc = 0;
	static boolean menu1 = true;
	static boolean menu2 = true;
	static boolean menu3 = true;
	static int i,j,k;
	static double totalSueldos = 0;
	static double totalPrestaciones = 0;
	//Las que van andar 'flotando'
	static String tNom,tID,tJornada,tEPS,tPension;
	static short tEdad,tHoras,tDependencia;
	static double tSueldo;
	
	public Main() {
		catedra = new ArrayList<DCatedra>();
		medioTiempo = new ArrayList<DMedioTiempo>();
		tiempoCompleto = new ArrayList<DTiempoCompleto>();
		ops = new ArrayList<AOPS>();
		auxiliar = new ArrayList<Auxiliar>();
		tecnico = new ArrayList<Tecnico>();
		profesional = new ArrayList<Profesional>();
		dcat = new DCatedra("Luis Gomez","DC5421",(short)31,(short)1,"Sanitas","Colpensiones",12,true);
		catedra.add(dcat);
		dmt = new DMedioTiempo("Carlos Sanchez","DP7457",(short)51,"Mañana","SURA","Colpensiones",(short)5,true);
		medioTiempo.add(dmt);
	}

	public static void main(String[] args) {
		Main m = new Main();
		
		System.out.println("SISTEMA DE NOMINA DE LA UNIVERSIDAD");
		while(menu1 == true) {
			System.out.println("--  --  --  --  --  --  --  --  --");
			switch(menuPrincipal()) {
				case 0:
					System.out.println("\tPROGRAMA TERMINADO");
					menu1 = false;
				break;
				case 1:
					System.out.println("INGRESAR EMPLEADO");
					menu2 = true;
					while(menu2 == true) {
						System.out.println("--  --  --  --  --  --  --  --  --");
						switch(menuEmpleado()) {
							case 0:
								System.out.println("\tVOLVIENDO MENU PRINCIPAL");
								menu2 = false;
							break;
							case 1:
								System.out.println("\tINGRESAR DOCENTE CATEDRA");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Cantidad de horas semanales de clase -> ");
								tHoras = sc.nextShort();
								sc.nextLine();
								System.out.print("Facultad en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								dcat = new DCatedra(tNom,tID,tEdad,tDependencia,tEPS,tPension,tHoras,true);
								catedra.add(dcat);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("DOCENTE CATEDRA INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 2:
								System.out.println("\tINGRESAR DOCENTE PLANTA MEDIO TIEMPO");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Jornada (mañana, tarde, noche) -> ");
								tJornada = sc.nextLine();
								System.out.print("Facultad en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								dmt = new DMedioTiempo(tNom,tID,tEdad,tJornada,tEPS,tPension,tDependencia,true);
								medioTiempo.add(dmt);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("DOCENTE PLANTA MEDIO TIEMPO INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 3:
								System.out.println("\tINGRESAR DOCENTE PLANTA TIEMPO COMPLETO");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Facultad en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								dtc = new DTiempoCompleto(tNom,tID,tEdad,tEPS,tPension,tDependencia,true);
								tiempoCompleto.add(dtc);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("DOCENTE PLANTA TIEMPO COMPLETO INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 4:
								System.out.println("\tINGRESAR ADMINISTRATIVO OPS");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Dependencia en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("Valor del contrato, mensual -> $ ");
								tSueldo = sc.nextDouble();
								sc.nextLine();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								aops = new AOPS(tNom,tID,tEdad,tSueldo,tEPS,tPension,tDependencia,true);
								ops.add(aops);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("ADMINISTRATIVO OPS INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 5:
								System.out.println("\tINGRESAR ADMINISTRATIVO AUXILIAR");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Dependencia en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								aaux = new Auxiliar(tNom,tID,tEdad,tEPS,tPension,tDependencia,true);
								auxiliar.add(aaux);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("ADMINISTRATIVO AUXILIAR MEDIO TIEMPO INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 6:
								System.out.println("\tINGRESAR ADMINISTRATIVO TECNICO");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Dependencia en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								atec = new Tecnico(tNom,tID,tEdad,tEPS,tPension,tDependencia,true);
								tecnico.add(atec);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("ADMINISTRATIVO TECNICO INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
							case 7:
								System.out.println("\tINGRESAR ADMINISTRATIVO PROFESIONAL");
								System.out.println("Tecle los datos a medida que se van solicitando");
								System.out.print("Nombre completo del docente -> ");
								tNom = sc.nextLine();
								System.out.print("Codigo asignado por la Universidad -> ");
								tID = sc.nextLine();
								System.out.print("Edad -> ");
								tEdad = sc.nextShort();
								sc.nextLine();
								System.out.print("Dependencia en la que trabaja -> ");
								tDependencia = escogeDependencia();
								System.out.print("EPS a la que esta afiliado -> ");
								tEPS = sc.nextLine();
								System.out.print("Fondo de pensiones al que esta afiliado -> ");
								tPension = sc.nextLine();
								apro = new Profesional(tNom,tID,tEdad,tEPS,tPension,tDependencia,true);
								profesional.add(apro);
								System.out.println("--  --  --  --  --  --  --  --  --");
								System.out.println("ADMINISTRATIVO PROFESIONAL INGRESADO AL SISTEMA");
								System.out.println("--  --  --  --  --  --  --  --  --");
								esperar();
								menu2 = false;
							break;
						}
					}
				break;
				case 2:
					System.out.println("\tRETIRAR EMPLEADO");
					System.out.println("De la siguiente lista, escoja el empleado que desea retirar");
					System.out.println("# Empleado\tNombre\t\tID\tDependencia/Facultad");
					j=0;
					for(i=0;i<catedra.size();i++) {
						dcat = catedra.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dcat.getNombre()+"\t"+dcat.getId()+"\t\t"+dcat.getFacultad());
					}
					j = catedra.size();
					for(i=0;i<medioTiempo.size();i++) {
						dmt = medioTiempo.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dmt.getNombre()+"\t"+dmt.getId()+"\t\t"+dmt.getFacultad());
					}
					j = medioTiempo.size();
					for(i=0;i<tiempoCompleto.size();i++) {
						dtc = tiempoCompleto.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dtc.getNombre()+"\t"+dtc.getId()+"\t\t"+dtc.getFacultad());
					}
					j = tiempoCompleto.size();
					for(i=0;i<ops.size();i++) {
						aops = ops.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+aops.getNombre()+"\t"+aops.getId()+"\t\t"+aops.getDependencia());
					}
					j = ops.size();
					for(i=0;i<auxiliar.size();i++) {
						aaux = auxiliar.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+aaux.getNombre()+"\t"+aaux.getId()+"\t\t"+aaux.getDependencia());
					}
					j = auxiliar.size();
					for(i=0;i<tecnico.size();i++) {
						atec = tecnico.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+atec.getNombre()+"\t"+atec.getId()+"\t\t"+atec.getDependencia());
					}
					j = tecnico.size();
					for(i=0;i<profesional.size();i++) {
						apro = profesional.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+apro.getNombre()+"\t"+apro.getId()+"\t\t"+apro.getDependencia());
					}
					do{
						System.out.print("Empleado que desea retirar -> ");
						opc = sc.nextShort();
						sc.nextLine();
						if((opc < 0) || (opc > j)) {
							System.out.println(" -- -- ERROR -- --");
							System.out.println(" -- Opcion no válida, escoja de nuevo --");
						}
					}while((opc < 0) || (opc > j));
					i = 1;
					j = catedra.size();
					if((opc >= i) && (opc <= j)) {
						dcat = catedra.get(opc-i-1);
						dcat.setEstado(false);
					}
					i = catedra.size();
					j = medioTiempo.size();
					if((opc >= i) && (opc <= j)) {
						dmt = medioTiempo.get(opc-i-1);
						dmt.setEstado(false);
					}
					i = medioTiempo.size();
					j = tiempoCompleto.size();
					if((opc >= i) && (opc <= j)) {
						dtc = tiempoCompleto.get(opc-i-1);
						dtc.setEstado(false);
					}
					i = tiempoCompleto.size();
					j = ops.size();
					if((opc >= i) && (opc <= j)) {
						aops = ops.get(opc-i-1);
						aops.setEstado(false);
					}
					i = ops.size();
					j = auxiliar.size();
					if((opc >= i) && (opc <= j)) {
						aaux = auxiliar.get(opc-i-1);
						aaux.setEstado(false);
					}
					i = auxiliar.size();
					j = tecnico.size();
					if((opc >= i) && (opc <= j)) {
						atec = tecnico.get(opc-i-1);
						atec.setEstado(false);
					}
					i = tecnico.size();
					j = profesional.size();
					if((opc >= i) && (opc <= j)) {
						apro = profesional.get(opc-i-1);
						apro.setEstado(false);
					}
				break;
				case 3:
					System.out.println("\tELIMINAR EMPLEADO");
					System.out.println("De la siguiente lista, escoja el empleado que desea eliminar para SIEMPRE del sistema");
					System.out.println("# Empleado\tNombre\t\tID\tDependencia/Facultad");
					j=0;
					for(i=0;i<catedra.size();i++) {
						dcat = catedra.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dcat.getNombre()+"\t"+dcat.getId()+"\t\t"+dcat.getFacultad());
					}
					j = catedra.size();
					for(i=0;i<medioTiempo.size();i++) {
						dmt = medioTiempo.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dmt.getNombre()+"\t"+dmt.getId()+"\t\t"+dmt.getFacultad());
					}
					j = medioTiempo.size();
					for(i=0;i<tiempoCompleto.size();i++) {
						dtc = tiempoCompleto.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+dtc.getNombre()+"\t"+dtc.getId()+"\t\t"+dtc.getFacultad());
					}
					j = tiempoCompleto.size();
					for(i=0;i<ops.size();i++) {
						aops = ops.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+aops.getNombre()+"\t"+aops.getId()+"\t\t"+aops.getDependencia());
					}
					j = ops.size();
					for(i=0;i<auxiliar.size();i++) {
						aaux = auxiliar.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+aaux.getNombre()+"\t"+aaux.getId()+"\t\t"+aaux.getDependencia());
					}
					j = auxiliar.size();
					for(i=0;i<tecnico.size();i++) {
						atec = tecnico.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+atec.getNombre()+"\t"+atec.getId()+"\t\t"+atec.getDependencia());
					}
					j = tecnico.size();
					for(i=0;i<profesional.size();i++) {
						apro = profesional.get(i);
						System.out.println("\t"+(i+j+1)+"\t"+apro.getNombre()+"\t"+apro.getId()+"\t\t"+apro.getDependencia());
					}
					do{
						System.out.print("Empleado que desea retirar -> ");
						opc = sc.nextShort();
						sc.nextLine();
						if((opc < 0) || (opc > j)) {
							System.out.println(" -- -- ERROR -- --");
							System.out.println(" -- Opcion no válida, escoja de nuevo --");
						}
					}while((opc < 0) || (opc > j));
					i = 1;
					j = catedra.size();
					if((opc >= i) && (opc <= j)) {
						dcat = catedra.remove(opc-i-1);
						dcat.setEstado(false);
					}
					i = catedra.size();
					j = medioTiempo.size();
					if((opc >= i) && (opc <= j)) {
						dmt = medioTiempo.remove(opc-i-1);
						dmt.setEstado(false);
					}
					i = medioTiempo.size();
					j = tiempoCompleto.size();
					if((opc >= i) && (opc <= j)) {
						dtc = tiempoCompleto.remove(opc-i-1);
						dtc.setEstado(false);
					}
					i = tiempoCompleto.size();
					j = ops.size();
					if((opc >= i) && (opc <= j)) {
						aops = ops.remove(opc-i-1);
						aops.setEstado(false);
					}
					i = ops.size();
					j = auxiliar.size();
					if((opc >= i) && (opc <= j)) {
						aaux = auxiliar.remove(opc-i-1);
						aaux.setEstado(false);
					}
					i = auxiliar.size();
					j = tecnico.size();
					if((opc >= i) && (opc <= j)) {
						atec = tecnico.remove(opc-i-1);
						atec.setEstado(false);
					}
					i = tecnico.size();
					j = profesional.size();
					if((opc >= i) && (opc <= j)) {
						apro = profesional.remove(opc-i-1);
						apro.setEstado(false);
					}
				break;
				case 4:
					System.out.println("\tCALCULAR SALARIOS");
					totalSueldos = 0;
					System.out.println("--  --  --  --  --  --  --  --  --");
					System.out.println("- DOCENTES CATEDRA");
					for(i=0;i<catedra.size();i++) {
						dcat = catedra.get(i);
						System.out.println("  "+dcat.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+dcat.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(dcat.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(dcat.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dcat.getSueldo()-(dcat.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(dcat.getSueldo()-(dcat.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dcat.getSueldo()-(dcat.getSueldo()*0.08)));
							totalSueldos+=(dcat.getSueldo()-(dcat.getSueldo()*0.08));
						}
					}
					System.out.println("- DOCENTES MEDIO TIEMPO");
					for(i=0;i<medioTiempo.size();i++) {
						dmt = medioTiempo.get(i);
						System.out.println("  "+dmt.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+dmt.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(dmt.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(dmt.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dmt.getSueldo()-(dmt.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(dmt.getSueldo()-(dmt.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dmt.getSueldo()-(dmt.getSueldo()*0.08)));
							totalSueldos+=(dmt.getSueldo()-(dmt.getSueldo()*0.08));
						}
					}
					System.out.println("- DOCENTES TIEMPO COMPLETO");
					for(i=0;i<tiempoCompleto.size();i++) {
						dtc = tiempoCompleto.get(i);
						System.out.println("  "+dtc.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+dtc.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(dtc.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(dtc.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dtc.getSueldo()-(dtc.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(dtc.getSueldo()-(dtc.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(dtc.getSueldo()-(dtc.getSueldo()*0.08)));
							totalSueldos+=(dtc.getSueldo()-(dtc.getSueldo()*0.08));
						}
					}
					System.out.println("- ADMINISTRATIVO OPS");
					for(i=0;i<ops.size();i++) {
						aops = ops.get(i);
						System.out.println("  "+aops.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+aops.getSueldo());
						System.out.println("\t\t\tDescuentos: $0 por ser OPS");
						System.out.print("\t\t\tAuxilio Transporte: No tiene por ser OPS");
						System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(aops.getSueldo()));
						totalSueldos+=aops.getSueldo();
					}
					System.out.println("- ADMINISTRATIVO AUXILIAR");
					for(i=0;i<auxiliar.size();i++) {
						aaux = auxiliar.get(i);
						System.out.println("  "+aaux.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+aaux.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(aaux.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(aaux.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(aaux.getSueldo()-(aaux.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(aaux.getSueldo()-(aaux.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(aaux.getSueldo()-(aaux.getSueldo()*0.08)));
							totalSueldos+=(aaux.getSueldo()-(aaux.getSueldo()*0.08));
						}
					}
					System.out.println("- ADMINISTRATIVO TECNICO");
					for(i=0;i<tecnico.size();i++) {
						atec = tecnico.get(i);
						System.out.println("  "+atec.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+atec.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(atec.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(atec.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(atec.getSueldo()-(atec.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(atec.getSueldo()-(atec.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(atec.getSueldo()-(atec.getSueldo()*0.08)));
							totalSueldos+=(atec.getSueldo()-(atec.getSueldo()*0.08));
						}
					}
					System.out.println("- ADMINISTRATIVO PROFESIONAL");
					for(i=0;i<profesional.size();i++) {
						apro = profesional.get(i);
						System.out.println("  "+apro.nombre+" =>");
						System.out.println("\t\t\tSueldo: $ "+apro.getSueldo());
						System.out.println("\t\t\tDescuentos: $ "+(apro.getSueldo()*0.08));
						System.out.print("\t\t\tAuxilio Transporte: ");
						if(apro.getSueldo()<=(sMinimo*2)) {
							System.out.println("Si");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(apro.getSueldo()-(apro.getSueldo()*0.08)+auxTransporte));
							totalSueldos+=(apro.getSueldo()-(apro.getSueldo()*0.08))+auxTransporte;
						}else {
							System.out.println("No");
							System.out.println("\t\t\tTOTAL A CONSIGNAR: $ "+(apro.getSueldo()-(apro.getSueldo()*0.08)));
							totalSueldos+=(apro.getSueldo()-(apro.getSueldo()*0.08));
						}
					}
					System.out.println("--  --  --  --  --  --  --  --  --");
					System.out.println("TOTAL A PAGAR A LOS EMPLEADOS: $ "+totalSueldos);
					esperar();
				break;
				case 5:
					System.out.println("\tCALCULAR PAGOS A EMPRESAS DE PRESTACIONES SOCIALES");
					totalPrestaciones = 0;
					System.out.println("--  --  --  --  --  --  --  --  --");
					System.out.println("- DOCENTES CATEDRA");
					for(i=0;i<catedra.size();i++) {
						dcat = catedra.get(i);
						System.out.println("  "+dcat.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(dcat.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(dcat.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(dcat.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(dcat.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(dcat.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(dcat.getSueldo()*0.03));
						System.out.println("\t\t\tARL 1: $ "+(dcat.getSueldo()*riesgos[0]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(dcat.getSueldo()*(0.4583+riesgos[0])));
						totalPrestaciones+=(dcat.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("- DOCENTES MEDIO TIEMPO");
					for(i=0;i<medioTiempo.size();i++) {
						dmt = medioTiempo.get(i);
						System.out.println("  "+dmt.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(dmt.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(dmt.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(dmt.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(dmt.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(dmt.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(dmt.getSueldo()*0.03));
						System.out.println("\t\t\tARL 1: $ "+(dmt.getSueldo()*riesgos[0]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(dmt.getSueldo()*(0.4583+riesgos[0])));
						totalPrestaciones+=(dmt.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("- DOCENTES TIEMPO COMPLETO");
					for(i=0;i<tiempoCompleto.size();i++) {
						dtc = tiempoCompleto.get(i);
						System.out.println("  "+dtc.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(dtc.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(dtc.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(dtc.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(dtc.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(dtc.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(dtc.getSueldo()*0.03));
						System.out.println("\t\t\tARL 1: $ "+(dtc.getSueldo()*riesgos[0]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(dtc.getSueldo()*(0.4583+riesgos[0])));
						totalPrestaciones+=(dtc.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("- ADMINISTRATIVO OPS");
					System.out.println("  Pagan sus prestaciones ellos mismos, del valor del contrato");
					System.out.println("- ADMINISTRATIVOS AUXILIAR");
					for(i=0;i<auxiliar.size();i++) {
						aaux = auxiliar.get(i);
						System.out.println("  "+aaux.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(aaux.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(aaux.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(aaux.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(aaux.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(aaux.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(aaux.getSueldo()*0.03));
						System.out.println("\t\t\tARL 1: $ "+(aaux.getSueldo()*riesgos[0]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(aaux.getSueldo()*(0.4583+riesgos[0])));
						totalPrestaciones+=(aaux.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("- ADMINISTRATIVOS TECNICO");
					for(i=0;i<tecnico.size();i++) {
						atec = tecnico.get(i);
						System.out.println("  "+atec.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(atec.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(atec.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(atec.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(atec.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(atec.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(atec.getSueldo()*0.03));
						System.out.println("\t\t\tARL 2: $ "+(atec.getSueldo()*riesgos[1]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(atec.getSueldo()*(0.4583+riesgos[1])));
						totalPrestaciones+=(atec.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("- ADMINISTRATIVOS PROFESIONAL");
					for(i=0;i<profesional.size();i++) {
						apro = profesional.get(i);
						System.out.println("  "+apro.nombre+" =>");
						System.out.println("\t\t\tSalud: $ "+(apro.getSueldo()*0.125));
						System.out.println("\t\t\tPension: $ "+(apro.getSueldo()*0.16));
						System.out.println("\t\t\tCesantias: $ "+(apro.getSueldo()*0.0833));
						System.out.println("\t\t\tSena: $ "+(apro.getSueldo()*0.02));
						System.out.println("\t\t\tCaja de Compensacion: $ "+(apro.getSueldo()*0.04));
						System.out.println("\t\t\tICBF: $ "+(apro.getSueldo()*0.03));
						System.out.println("\t\t\tARL 4: $ "+(apro.getSueldo()*riesgos[3]));
						System.out.println("\t\t\tTOTAL A PAGAR: $ "+(apro.getSueldo()*(0.4583+riesgos[3])));
						totalPrestaciones+=(apro.getSueldo()*(0.4583+riesgos[0]));
					}
					System.out.println("--  --  --  --  --  --  --  --  --");
					System.out.println("TOTAL A PAGAR A EMPRESAS DE PRESTACIONES $ "+totalPrestaciones);
					esperar();
					
				break;
				case 6:
					System.out.println("\tLIQUIDAR POR DEPENDENCIAS");
					System.out.println("--  --  --  --  --  --  --  --  --");
					opc = escogeDependencia();
					totalSueldos = 0;
					totalSueldos = realizarNomina(opc);
					System.out.println("Sueldos a pagar en la dependencia #"+opc+" es de $ "+totalSueldos);
					System.out.println("Total a pagar en la dependencia #"+opc+" por SALUD es de $ "+(totalSueldos*0.125));
					System.out.println("Total a pagar en la dependencia #"+opc+" por PENSION es de $ "+(totalSueldos*0.16));
					System.out.println("Total a pagar en la dependencia #"+opc+" por PARAFISCALEs (SENA + ICBF) es de $ "+(totalSueldos*0.05));
					esperar();
				break;
				case 7:
					System.out.println("\tLISTAR EMPLEADOS DE LA UNIVERSIDAD");
					System.out.println("--  --  --  --  --  --  --  --  --");
					System.out.println("- DOCENTES CATEDRA");
					for(i=0;i<catedra.size();i++) {
						dcat = catedra.get(i);
						System.out.println("\t#"+(i+1)+" "+dcat.toString());
					}
					System.out.println("- DOCENTES MEDIO TIEMPO");
					for(i=0;i<medioTiempo.size();i++) {
						dmt = medioTiempo.get(i);
						System.out.println("\t#"+(i+1)+" "+dmt.toString());
					}
					System.out.println("- DOCENTES TIEMPO COMPLETO");
					for(i=0;i<tiempoCompleto.size();i++) {
						dtc = tiempoCompleto.get(i);
						System.out.println("\t#"+(i+1)+" "+dtc.toString());
					}
					System.out.println("- ADMINISTRATIVOS OPS");
					for(i=0;i<ops.size();i++) {
						aops = ops.get(i);
						System.out.println("\t#"+(i+1)+" "+aops.toString());
					}
					System.out.println("- ADMINISTRATIVOS AUXILIARES");
					for(i=0;i<auxiliar.size();i++) {
						aaux = auxiliar.get(i);
						System.out.println("\t#"+(i+1)+" "+aaux.toString());
					}
					System.out.println("- ADMINISTRATIVOS TECNICOS");
					for(i=0;i<tecnico.size();i++) {
						atec = tecnico.get(i);
						System.out.println("\t#"+(i+1)+" "+atec.toString());
					}
					System.out.println("- ADMINISTRATIVOS PROFESIONALES");
					for(i=0;i<profesional.size();i++) {
						apro = profesional.get(i);
						System.out.println("\t#"+(i+1)+" "+apro.toString());
					}
					esperar();
				break;
					
				
			}
		}
	}
	
 // FUNCIONES
	static short menuPrincipal() {
		do{
			System.out.println("MENU PRINCIPAL");
			System.out.println("Escoja la opcion que desea realizar");
			System.out.println("Opc.\tAcción");
			System.out.println("1.\tIngresar empleado");
			System.out.println("2.\tRetirar empleado");
			System.out.println("3.\tEliminar empleado");
			System.out.println("4.\tCalcular salarios (muestra liquidacion de cada empleado por aparte)");
			System.out.println("5.\tCalcular pagos a empresas de prestacion social (muestra liquidacion de cada empleado por aparte)");
			System.out.println("6.\tCalcular salarios y pagos por dependencia");
			System.out.println("7.\tListar empleados con informacion");
			System.out.println("0.\tSalir");
			System.out.print("Opc -> ");
			opc = sc.nextShort();
			sc.nextLine();
			if((opc < 0) || (opc > 7)) {
				System.out.println(" -- -- ERROR -- --");
				System.out.println(" -- Opcion no válida, escoja de nuevo --");
			}
		}while((opc < 0) || (opc > 7));
		System.out.print("");
		System.out.println("--  --  --  --  --  --  --  --  --");
		return opc;
	}
	
	static short menuEmpleado() {
		do{
			System.out.println("MENU INGRESAR EMPLEADO");
			System.out.println("Escoja el tipo de empleado que desea ingresar");
			System.out.println("Opc.\tAcción");
			System.out.println("1.\tDocente Catedra");
			System.out.println("2.\tDocente Medio Tiempo");
			System.out.println("3.\tDocente Tiempo Completo");
			System.out.println("4.\tAdministrativo por OPS");
			System.out.println("5.\tAdministrativo Auxiliar");
			System.out.println("6.\tAdministrativo Tecnico");
			System.out.println("7.\tAdministrativo Profesional");
			System.out.println("0.\tNo ingresar ningun empleado");
			System.out.print("Opc -> ");
			opc = sc.nextShort();
			sc.nextLine();
			if((opc < 0) || (opc > 7)) {
				System.out.println(" -- -- ERROR -- --");
				System.out.println(" -- Opcion no válida, escoja de nuevo --");
			}
		}while((opc < 0) || (opc > 7));
		System.out.print("");
		System.out.println("--  --  --  --  --  --  --  --  --");
		return opc;
	}
	
	static short escogeDependencia() {
		System.out.println("ESCOJA LA FACULTAD/DEPENDENCIA");
		System.out.println("Opc.\tFacultad/Depedencia");
		System.out.println("1.\tFisico Mecanicas");
		System.out.println("2.\tFisico Quimicas");
		System.out.println("3.\tCiencias Humanas");
		System.out.println("4.\tCiencias Basicas");
		System.out.println("5.\tSalud");
		System.out.println("6.\tVicerrectoria Investigacion y Extension");
		System.out.println("7.\tVicerrectoria Administrativa");
		System.out.println("8.\tVicerrectoria Academica");
		System.out.println("9.\tRectoria");
		System.out.print("Opc -> ");
		opc = sc.nextShort();
		sc.nextLine();
		return opc;
	}
	
	static double realizarNomina(int opc) {
		double sueldos = 0;
		for(i=0;i<catedra.size();i++) {
			dcat = catedra.get(i);
			sueldos+=dcat.nomina(opc);
		}
		for(i=0;i<medioTiempo.size();i++) {
			dmt = medioTiempo.get(i);
			sueldos+=dmt.nomina(opc);
		}
		for(i=0;i<tiempoCompleto.size();i++) {
			dtc = tiempoCompleto.get(i);
			sueldos+=dtc.nomina(opc);
		}
		for(i=0;i<ops.size();i++) {
			aops = ops.get(i);
			sueldos+=aops.nomina(opc);
		}
		for(i=0;i<auxiliar.size();i++) {
			aaux = auxiliar.get(i);
			sueldos+=aaux.nomina(opc);
		}
		for(i=0;i<tecnico.size();i++) {
			atec = tecnico.get(i);
			sueldos+=atec.nomina(opc);
		}
		for(i=0;i<profesional.size();i++) {
			apro = profesional.get(i);
			sueldos+=apro.nomina(opc);
		}
		return sueldos;
	}
	
	static void esperar() {
		System.out.println("");
		System.out.print(" ** PRESIONE ENTER PARA CONTINUAR **");
		String entrada = "";
		do{
			entrada  = sc.nextLine();
		    System.out.println(entrada);
		}
		while(!entrada.equals("")); 
	}

}
