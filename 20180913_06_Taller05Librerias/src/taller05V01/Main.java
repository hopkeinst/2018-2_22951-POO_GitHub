package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	
// OBJETOS
	static ArrayList <Libreria> librerias;
	static ArrayList <Autor> autores;
	static ArrayList <CasaPublicacion> editoriales;
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Autor a;
	static CasaPublicacion cp;
	static Capitulo cap;
	static Scanner sc = new Scanner(System.in);
	
// VARIABLES
	static int opc,opcL;
	static int i,j,k,h;
	static boolean menu = true;
	static int idMaxL = 0;
	
// CONSTRUCTORES 

	public Main() {
		librerias = new ArrayList<Libreria>();
		editoriales = new ArrayList<CasaPublicacion>();
		autores = new ArrayList<Autor>();
		l = new Libreria();
		e = new Estanteria();
		b = new Libro();
		a = new Autor();
		cp = new CasaPublicacion();
		cap = new Capitulo();
		l.addLib(1, "Profitecnicas");
		l.addLib(2, "A1");
		l = librerias.get(0);
		e.addEst(1, "Computación", l);
		e.addEst(2, "Electrónica", l);
		e.addEst(3, "Civil", l);
		e = l.estanterias.get(0);
		b.addBoo("Programación en C y C++","1234567890",123,1993,2,e);
		b = e.libros.get(0);
		a.addAut("Deitel","deitel@deitel.com","www.deitel.com");
		b.autores.add(0);
		a.addAut("Chang","chang@deitel.com","www.chang.com");
		b.autores.add(1);
		cp.addCP("Pearson","books@pearson.net",11123412,"www.pearson.net");
		b.posCP = 0;
		cap.addCap("Introducción",1,12,1,b);
		cap.addCap("Variables",13,17,2,b);
		e = l.estanterias.get(1);
		b.addBoo("Comunicaciones","2345678901",231,2007,1,e);
		b = e.libros.get(0);
		b.autores.add(0);
		b.posCP = 0;
		cap.addCap("Introducción",1,5,1,b);
		b.addBoo("Digitales","3456789012",312,2017,8,e);
		b = e.libros.get(1);
		a.addAut("Sedra","Sedra@digital.com","www.digital.com");
		b.autores.add(2);
		cp.addCP("McGraw","books@grawhill.net",11248790,"book.grawhill.net");
		b.posCP = 1;
		cap.addCap("Introducción",1,5,1,b);
		cap.addCap("Lógica Booleana",7,15,2,b);
		b.addBoo("Potencia","4567890123",367,2017,2,e);
		b = e.libros.get(2);
		a.addAut("Hayt","whayt@epow.com.eu","www.epow.com.eu");
		b.autores.add(3);
		cap.addCap("Introduccion",1,8,1,b);
		cp.addCP("AlfaOmega","academic@aoeditorial.com",64209901,"www.oeditorial.com");
		b.posCP = 2;
		l = librerias.get(1);
		e.addEst(1, "Educación Infantil", l);
		e.addEst(2, "Nutrición", l);
	}
	
// METODOS

	public static void main(String[] args) {
		Main m = new Main();
		println("-----\t-----\t-----\t-----\t-----");
		println("BIENVENIDO AL SISTEMA DE LIBRERÍAS");
		println("Escoja entre las siguientes opciones:");
		while(menu == true) {
			menu = menuMain();
		}
		
	}
	
// ADICIONALES
	
	static void print(String s) {
		System.out.print(s);
	}
	
	static void println(String s) {
		System.out.println(s);
	}
	
	static void listarLibrerias() {
		for(i=0;i<librerias.size();i++) {
			l = librerias.get(i);
			println("Lib #"+(i+1)+"=['ID'='"+l.id+"' | 'Nombre'='"+l.nombre+"']");
			for(j=0;j<l.estanterias.size();j++) {
				e = l.estanterias.get(j);
				println("       Est #"+(j+1)+"=['ID'='"+e.id+" | 'Temática'='"+e.tematica+"']");
				for(k=0;k<e.libros.size();k++) {
					b = e.libros.get(k);
					println("              Boo #"+(k+1)+"=['Título'='"+b.titulo+"' | 'ISBN'='"+b.iSBN+"' | 'Páginas'='"+b.pags+"' | 'Año Publicación'='"+b.aPub+"' | 'Edición'='"+b.nEdic+"']");
					cp = editoriales.get(b.posCP);
					println("                     CaP=['Nombre'='"+cp.nombre+"' | 'Email'='"+cp.email+"' | 'Teléfono'='"+cp.tel+"' | 'Website'='"+cp.web+"']");
					int nAuts,nCaps,nA;
					nAuts = b.autores.size();
					nCaps = b.capitulos.size();
					for(h=0;h<nAuts;h++) {
						nA = b.autores.get(h);
						a = autores.get(nA);
						println("                     Aut #"+(h+1)+"=['Nombre'='"+a.nombre+"' | 'Email'='"+a.email+"' | 'Website'='"+a.web+"']");
					}
					if(nCaps > 0) {
						println("                     Caps:");
					}
					for(h=0;h<nCaps;h++) {
						c = b.capitulos.get(h);
						println("                          #"+c.num+"=['Título'='"+c.titulo+"' | 'Página Inicio'='"+c.pagIni+"' | 'Página Final'='"+c.pagFin+"']");
					}
				}
			}
		}
	}
	
	static boolean menuMain() {
		do {
			println("");
			println("-----\t-----\t-----\t-----\t-----");
			println("1. Mostrar librerías");
			println("2. Agregar librería");
			println("3. Eliminar librería");
			println("4. Modificar librería");
			println("5. Búsquedas");
			println("0. Salir");
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
				return false;
			case 1:
				println("MOSTRAR LIBRERÍAS");
				listarLibrerias();
				esperar();
				return true;
			case 2: //Agregación, aunque la parte de agregado va en el método addLib
				println("AGREGAR LIBRERÍA");
				sc.nextLine();
				print("Ingrese nombre de la nueva librería: ");
				String nLib;
				nLib = sc.nextLine();
				int posL = librerias.size()-1;
				l = librerias.get(posL);
				l.addLib(idMaxL+1,nLib);
				esperar();
				return true;
			case 3:
				println("ELIMINAR LIBRERÍA");
				listarLibrerias();
				print("Cuál librería desea eliminar? (inserte #) => ");
				opcL = sc.nextInt();
				l.remLib(opcL-1);
				esperar();
				return true;
			case 4:
				println("MODIFICAR LIBRERÍA");
				listarLibrerias();
				print("Cuál librería desea modificar? (inserte #) => ");
				opcL = sc.nextShort();
				l = librerias.get(opcL-1);
				l.updLib(l);
				esperar();
				return true;
			case 5:
				println("BÚSQUEDAS");
				println("¿Qué tipo de búsqueda desea realizar?");
				println("1. Buscar libros por Autor");
				println("2. Buscar libros por Casa de Publicación");
				print("Tipo de búsqueda: ");
				opcL = sc.nextShort();
				if(opcL == 1) {
					busquedaAutor();
				}else if(opcL == 2) {
					busquedaEditorial();
				}
				esperar();
				return true;
		}
		return true;
	}
	
	static void busquedaAutor() {
		println("Escoja entre los siguientes Autores presentes en la cadena de librerías.");
		for(i=0;i<autores.size();i++) {
			a = autores.get(i);
			println(Integer.toString(i+1)+". "+a.nombre);
		}
		print("Buscar por el autor (el #): ");
		int opcA = sc.nextInt();
		int posA;
		a = autores.get(opcA-1);
		println("LIBROS DEL AUTOR "+a.nombre);
		for(i=0;i<librerias.size();i++) {
			l = librerias.get(i);
			for(j=0;j<l.estanterias.size();j++) {
				e = l.estanterias.get(j);
				for(k=0;k<e.libros.size();k++) {
					b = e.libros.get(k);
					for(h=0;h<b.autores.size();h++) {
						posA = b.autores.get(h);
						if(posA == (opcA-1)) {
							println("['Título'='"+b.titulo+"' | 'ISBN'='"+b.iSBN+"' | 'Páginas'='"+b.pags+"' | 'Año Publicación'='"+b.aPub+"' | 'Edición'='"+b.nEdic+"']");
							cp = editoriales.get(b.posCP);
							println("       Casa Publicación=['Nombre'='"+cp.nombre+"' | 'Email'='"+cp.email+"' | 'Teléfono'='"+cp.tel+"' | 'Website'='"+cp.web+"']");
							int nCaps = b.capitulos.size();
							println("       Caps:");
							for(h=0;h<nCaps;h++) {
								c = b.capitulos.get(h);
								println("            #"+c.num+"=['Título'='"+c.titulo+"' | 'Página Inicio'='"+c.pagIni+"' | 'Página Final'='"+c.pagFin+"']");
							}
						}
					}
				}
			}
		}
	}
	
	static void busquedaEditorial() {
		println("Escoja entre las siguientes Casas de Publicación presentes en la cadena de librerías.");
		for(i=0;i<editoriales.size();i++) {
			cp = editoriales.get(i);
			println(Integer.toString(i+1)+". "+cp.nombre);
		}
		print("Buscar por la casa de publicación (el #): ");
		int opcCP = sc.nextInt();
		int posCP;
		cp = editoriales.get(opcCP-1);
		println("LIBROS DE LA CASA DE PUBLICACIÓN "+cp.nombre);
		for(i=0;i<librerias.size();i++) {
			l = librerias.get(i);
			for(j=0;j<l.estanterias.size();j++) {
				e = l.estanterias.get(j);
				for(k=0;k<e.libros.size();k++) {
					b = e.libros.get(k);
					for(h=0;h<b.autores.size();h++) {
						posCP = b.posCP;
						if(posCP == (opcCP-1)) {
							println("['Título'='"+b.titulo+"' | 'ISBN'='"+b.iSBN+"' | 'Páginas'='"+b.pags+"' | 'Año Publicación'='"+b.aPub+"' | 'Edición'='"+b.nEdic+"']");
							if(b.autores.size() > 1) {
								println("       Autores:");
							}else {
								println("       Autor:");
							}
							for(int g=0;g<b.autores.size();g++) {
								a = autores.get(b.autores.get(g));
								println("               #"+(g+1)+"['Nombre'='"+a.nombre+"' | 'Email'='"+a.email+"' | 'Website'='"+a.web+"']");
							}
							int nCaps = b.capitulos.size();
							println("       Caps:");
							for(h=0;h<nCaps;h++) {
									c = b.capitulos.get(h);
									println("            #"+c.num+"=['Título'='"+c.titulo+"' | 'Página Inicio'='"+c.pagIni+"' | 'Página Final'='"+c.pagFin+"']");
							}
						}
					}
				}
			}
		}
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
