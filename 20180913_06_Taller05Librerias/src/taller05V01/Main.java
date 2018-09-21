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
	static Scanner sc = new Scanner(System.in);
	
// VARIABLES
	static int opc,opcL;
	static int i,j,k;
	static boolean menu = true;
	
// CONSTRUCTORES 

	public Main() {
		librerias = new ArrayList<Libreria>();
		l = new Libreria();
		e = new Estanteria();
		b = new Libro();
		l.addLib(1, "Profitecnicas");
		l.addLib(2, "A1");
		l = librerias.get(0);
		e.addEst(1, "Computación", l);
		e.addEst(2, "Electrónica", l);
		e.addEst(3, "Civil", l);
		e = l.estanterias.get(0);
		b.addBoo("Programación en C y C++","1234567890",123,1993,2,e);
		e = l.estanterias.get(1);
		b.addBoo("Comunicaciones","2345678901",231,2007,1,e);
		b.addBoo("Digitales","3456789012",312,2017,8,e);
		b.addBoo("Potencia","4567890123",312,2017,8,e);
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
			println("5. Buscar en una librería");
			println("0. Salir");
			print(" -> Opción: ");
			opc = sc.nextInt();
			if((opc < 0) || (opc > 5)) {
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
			case 2:
				println("AGREGAR LIBRERÍA");
				sc.nextLine();
				print("Ingrese nombre de la nueva librería: ");
				String nLib;
				nLib = sc.nextLine();
				int posL = librerias.size()-1;
				l = librerias.get(posL);
				l.addLib((l.id)+1,nLib);
				esperar();
				return true;
			case 3:
				println("ELMIMINAR LIBRERÍA");
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
