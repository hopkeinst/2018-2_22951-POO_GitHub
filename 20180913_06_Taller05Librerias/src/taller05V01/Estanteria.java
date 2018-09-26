package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Estanteria {

// ATRIBUTOS
	int id;
	String tematica;
		
// OBJETOS
	ArrayList <Libro> libros;
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static CasaPublicacion cp;
	static Autor a;
	static Scanner sc;

// VARIABLES
	static int opc,opcB;
	static int i,j,k;
	String nLib;
	boolean menuE = true;

// CONSTRUCTORES
	public Estanteria(int id,String tematica) {
		libros = new ArrayList<Libro>();
		this.id = id;
		this.tematica = tematica;
	}

	public Estanteria() {

	}
	
// MÉTODOS
	
	boolean addEst(int id,String tematica,Libreria l) {
		try {
			e = new Estanteria(id,tematica);
			l.estanterias.add(e);
			l.idMaxE++;
		}catch(Exception e) {
			println("ERROR estantería: "+e);
			return false;
		}
		return true;
	}
	
	void remEst(int pos,Libreria l) {
		e = l.estanterias.get(pos);
		println("Eliminando estanteria '"+e.id+":"+e.tematica+"'");
		l.estanterias.remove(pos);
	}
	
	void updEst(Estanteria e) {
		while(menuE == true) {
			menuE = menuEst(e);
		}
	}
	
	// ADICIONALES
	
	static void print(String s) {
		System.out.print(s);
	}
		
	static void println(String s) {
		System.out.println(s);
	}
		
	void listarLibros() {
		for(i=0;i<this.libros.size();i++) {
			b = this.libros.get(i);
			println("Boo #"+(i+1)+"=['Título'='"+b.titulo+"' | 'ISBN'='"+b.iSBN+"' | 'Páginas'='"+b.pags+"' | 'Año Publicación'='"+b.aPub+"' | 'Edición'='"+b.nEdic+"']");
			cp = Main.editoriales.get(b.posCP);
			println("       CaP=['Nombre'='"+cp.nombre+"' | 'Email'='"+cp.email+"' | 'Teléfono'='"+cp.tel+"' | 'Website'='"+cp.web+"']");
			int nAuts,nCaps,nA;
			nAuts = b.autores.size();
			nCaps = b.capitulos.size();
			for(k=0;k<nAuts;k++) {
				nA = b.autores.get(k);
				a = Main.autores.get(nA);
				println("       Aut #"+(k+1)+"=['Nombre'='"+a.nombre+"' | 'Email'='"+a.email+"' | 'Website'='"+a.web+"']");
			}
			if(nCaps > 0) {
				println("       Caps:");
			}
			for(k=0;k<nCaps;k++) {
				c = b.capitulos.get(k);
				println("            #"+c.num+"=['Título'='"+c.titulo+"' | 'Página Inicio'='"+c.pagIni+"' | 'Página Final'='"+c.pagFin+"']");
			}
		}
	}
		
	boolean menuEst(Estanteria e) {
		sc = new Scanner(System.in);
		do {
			println("-----\t-----\t-----\t-----\t-----");
			println("Escoja que quiere modificar de la estantería "+e.tematica);
			println("1. Listar Libros");
			println("2. Agregar Libro");
			println("3. Eliminar Libro");
			println("4. Agregar Capítulo a Libro");
			println("5. Volver menú anterior");
			println("0. Salir programa");
			print(" -> Opción: ");
			opc = sc.nextInt();
			if((opc < 0) || (opc > 5)) {
				println(" -- -- ERROR -- --");
				println(" -- Opcion no válida, escoja de nuevo --");
			}
		}while((opc < 0) || (opc > 5));
		println("");
		switch(opc) {
		case 0:
			println("PROGRAMA TERMINADO");
			System.exit(0);
			break;
		case 1:
			println("MOSTRAR LIBROS DE LA ESTANTERÍA "+this.tematica);
			listarLibros();
			esperar();
			return true;
		case 2:
			println("AGREGAR LIBRO");
			println("DATOS LIBRO");
			sc.nextLine();
			print("Ingrese título del nuevo Libro: ");
			String nBoo;
			nBoo = sc.nextLine();
			print("Ingrese el ISBN del nuevo Libro: ");
			String iSBN;
			iSBN = sc.nextLine();
			print("Ingrese la cantidad de páginas del nuevo Libro: ");
			int nPags;
			nPags = sc.nextInt();
			sc.nextLine();
			print("Ingrese el año de publicación del nuevo Libro: ");
			int aPub;
			aPub = sc.nextInt();
			sc.nextLine();
			print("Ingrese el número de edición del nuevo Libro: ");
			int nEdic;
			nEdic = sc.nextInt();
			sc.nextLine();
			int posB;
			b = new Libro();
			try {
				b.addBoo(nBoo,iSBN,nPags,aPub,nEdic,this);
			}catch(Exception e1) {
				println("ERROR Libro: "+e1);
				return false;
			}
			println("DATOS CASA DE PUBLICACIÓN");
			print("Ingrese nombre de la Casa de Publicación: ");
			String nCP;
			nCP = sc.nextLine();
			print("Ingrese email de la Casa de Publicación: ");
			String eCP;
			eCP = sc.nextLine();
			print("Ingrese website de la Casa de Publicación: ");
			String wCP;
			wCP = sc.nextLine();
			print("Ingrese teléfono de la Casa de Publicación: ");
			int tCP;
			tCP = sc.nextInt();
			sc.nextLine();
			posB = libros.size()-1;
			b = libros.get(posB);
			try {
				cp = new CasaPublicacion();
				b.posCP = cp.addCP(nCP,eCP,tCP,wCP);
			}catch(Exception e1) {
				println("ERROR Casa Publicación: "+e1);
				return false;
			}
			println("DATOS AUTOR(ES)");
			print("Ingrese la cantidad de autores del libro: ");
			int nAut;
			nAut = sc.nextInt();
			sc.nextLine();
			for(i=0;i<nAut;i++) {
				print("AUTOR #"+(i+1)+": Nombre del autor: ");
				String nomAut;
				nomAut = sc.nextLine();
				print("AUTOR #"+(i+1)+": Email del autor: ");
				String eAut;
				eAut = sc.nextLine();
				print("AUTOR #"+(i+1)+": Website del autor: ");
				String wAut;
				wAut = sc.nextLine();
				try {
					a = new Autor();
					b.posA = a.addAut(nomAut,eAut,wAut);
					b.autores.add(b.posA);
				}catch(Exception e1) {
					println("ERROR Autor: "+e1);
					return false;
				}
			}
			println("DATOS CAPÍTULO(S)");
			print("Ingrese la cantidad de capítulos del libro: ");
			int nCap;
			nCap = sc.nextInt();
			sc.nextLine();
			for(i=0;i<nCap;i++) {
				print("CAP #"+(i+1)+": Título del capítulo: ");
				String tCap;
				tCap = sc.nextLine();
				print("CAP #"+(i+1)+": Página inicio: ");
				int pagIni;
				pagIni = sc.nextInt();
				sc.nextLine();
				print("CAP #"+(i+1)+": Página final: ");
				int pagFin;
				pagFin = sc.nextInt();
				sc.nextLine();
				try {
					c = new Capitulo();
					c.addCap(tCap,pagIni,pagFin,(b.maxCap+1),b);
				}catch(Exception e1) {
					println("ERROR Autor: "+e1);
					return false;
				}
			}
			return true;
		case 3:
			println("ELIMINAR LIBRO");
			listarLibros();
			print("Cuál libro desea eliminar? (inserte #) => ");
			opcB = sc.nextInt();
			b.remBoo(opcB-1,this);
			esperar();
			return true;
		case 4:
			println("AGREGAR CAPÍTULO A UN LIBRO");
			listarLibros();
			print("A cuál libro desea agregar capítulos? (inserte #) => ");
			int numBoo = sc.nextInt();
			b = libros.get(numBoo-1);
			print("Ingrese la cantidad de capítulos a agregar del libro: ");
			int numCap;
			numCap = sc.nextInt();
			sc.nextLine();
			for(i=0;i<numCap;i++) {
				print("CAP #"+(b.maxCap+1)+": Título del capítulo: ");
				String tCap;
				tCap = sc.nextLine();
				print("CAP #"+(b.maxCap+1)+": Página inicio: ");
				int pagIni;
				pagIni = sc.nextInt();
				sc.nextLine();
				print("CAP #"+(b.maxCap+1)+": Página final: ");
				int pagFin;
				pagFin = sc.nextInt();
				sc.nextLine();
				try {
					c = new Capitulo();
					c.addCap(tCap,pagIni,pagFin,(b.maxCap+1),b);
				}catch(Exception e1) {
					println("ERROR Autor: "+e1);
					return false;
				}
			}
			return true;
		case 5:
			println("REGRESAR MENÚ");
			return false;
		}
		return true;
	}
	
	static void esperar() {
		sc.nextLine();
		println("");
		print(" ** PRESIONE ENTER PARA CONTINUAR **");
		String entrada = "";
		do{
			entrada  = sc.nextLine();
		    System.out.println(entrada);
		}
		while(!entrada.equals("")); 
	}

}
