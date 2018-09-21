package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Libreria {
	
// ATRIBUTOS
	int id;
	String nombre;
	
// OBJETOS
	ArrayList <Estanteria> estanterias;
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Scanner sc;
	
// VARIABLES
	static int opc,opcE;
	static int i,j,k;
	String nLib;
	boolean menuL = true;

// CONSTRUCTORES
	public Libreria(int id,String nombre) {
		estanterias = new ArrayList<Estanteria>();
		this.id = id;
		this.nombre = nombre;
	}

	public Libreria() {
		
	}
	
// METODOS
	
	boolean addLib(int id,String nombre) {
		try {
			l = new Libreria(id,nombre);
			Main.librerias.add(l);
		}catch(Exception e) {
			println("ERROR librería: "+e);
			return false;
		}
		return true;
	}
	
	void remLib(int pos) {
		l = Main.librerias.get(pos);
		println("Eliminando librería '"+l.id+":"+l.nombre+"'");
		Main.librerias.remove(pos);
	}
	
	void updLib(Libreria l) {
		while(menuL == true) {
			menuL = menuLib(l);
		}
	}
	
// ADICIONALES
	
	static void print(String s) {
		System.out.print(s);
	}
	
	static void println(String s) {
		System.out.println(s);
	}
	
	void listarEstanterias() {
		for(i=0;i<this.estanterias.size();i++) {
			e = this.estanterias.get(i);
			println("Est #"+(i+1)+"=['ID'='"+e.id+"' | 'Temática'='"+e.tematica+"']");
		}
	}
	
	boolean menuLib(Libreria l) {
		sc = new Scanner(System.in);
		do {
			println("-----\t-----\t-----\t-----\t-----");
			println("Escoja que quiere modificar de la librería "+l.nombre);
			println("1. Cambiar nombre Librería");
			println("2. Listar Estanterías");
			println("3. Agregar Estantería");
			println("4. Eliminar Estantería");
			println("5. Modificar Estantería");
			println("6. Volver menú anterior");
			println("0. Salir programa");
			print(" -> Opción: ");
			opc = sc.nextInt();
			if((opc < 0) || (opc > 6)) {
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				println(" -- -- ERROR -- --");
				println(" -- Opcion no válida, escoja de nuevo --");
				try {
					TimeUnit.SECONDS.sleep(5);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}while((opc < 0) || (opc > 6));
		println("");
		switch(opc) {
			case 0:
				println("PROGRAMA TERMINADO");
				System.exit(0);
				break;
			case 1:
				println("CAMBIAR NOMBRE LIBRERÍA");
				sc.nextLine();
				print("Ingrese nuevo nombre librería: ");
				nLib = sc.nextLine();
				println(nLib);
				this.nombre = nLib;
				esperar();
				return true;
			case 2:
				println("MOSTRAR ESTANTERÍAS DE "+this.nombre);
				listarEstanterias();
				esperar();
				return true;
			case 3:
				println("AGREGAR ESTANTERÍA");
				sc.nextLine();
				print("Ingrese temática de la nueva estantería: ");
				String tEst;
				tEst = sc.nextLine();
				int posE = estanterias.size()-1;
				e = estanterias.get(posE);
				e.addEst((e.id)+1,tEst,this);
				esperar();
				return true;
			case 4:
				println("ELMIMINAR ESTANTERÍA");
				listarEstanterias();
				print("Cuál estantería desea eliminar? (inserte #) => ");
				opcE = sc.nextInt();
				e.remEst(opcE-1,this);
				esperar();
				return true;
			case 5:
				println("MODIFICAR ESTANTERÍA");
				return true;
			case 6:
				println("REGRESAR MENÚ");
				sc.nextLine();
				return false;
		}
		return true;
	}
	
	static void esperar() {
		sc.nextLine();
		println("");
		print(" ** PRESIONE PARA CONTINUAR **");
		String entrada = "";
		do{
			entrada  = sc.nextLine();
		    System.out.println(entrada);
		}
		while(!entrada.equals("")); 
	}

}
