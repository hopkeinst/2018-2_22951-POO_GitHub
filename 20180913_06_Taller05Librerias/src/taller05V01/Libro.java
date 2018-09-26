package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Libro {
	
// ATRIBUTOS
	String titulo;
	String iSBN;
	int pags;
	int aPub;
	int nEdic;
	int posCP;
	int posA;
		
// OBJETOS
	ArrayList <Integer> autores;
	ArrayList <Capitulo> capitulos;
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Autor a;
	static CasaPublicacion cp;
	static Capitulo cap;
	static Scanner sc;
		
// VARIABLES
	static int opc;
	static int i,j,k;
	String nEst;
	boolean menuB = true;
	int maxCap = 0;

// CONSTRUCTORES
	public Libro(String titulo,String iSBN,int pags,int aPub,int nEdic) {
		autores = new ArrayList<Integer>();
		capitulos = new ArrayList<Capitulo>();
		this.titulo = titulo;
		this.iSBN = iSBN;
		this.pags = pags;
		this.aPub = aPub;
		this.nEdic = nEdic;
	}
	
	public Libro() {

	}
	
// MÉTODOS
	
	boolean addBoo(String titulo,String iSBN,int pags,int aPub,int nEdic,Estanteria e) {
		boolean fISBN = false;
		try {
			if(e.libros.size() > 0) {
				for(i=0;i<e.libros.size();i++) {
					b = e.libros.get(i);
					if(b.iSBN == iSBN) {
						fISBN = true;
						println("ERROR, ISBN ya agregado - Título: "+titulo+" = "+b.titulo);
					}
				}
				if(fISBN == false) {
					b = new Libro(titulo,iSBN,pags,aPub,nEdic);
					e.libros.add(b);
				}
			}else {
				b = new Libro(titulo,iSBN,pags,aPub,nEdic);
				e.libros.add(b);
			}
		}catch(Exception e1) {
			println("ERROR libro: "+e1);
			return false;
		}
		return true;
	}
	
	void remBoo(int pos,Estanteria e) {
		b = e.libros.get(pos);
		println("Eliminando libro '"+b.titulo+":"+b.iSBN+":"+b.pags+":"+b.aPub+":"+":"+b.nEdic+"'");
		e.libros.remove(pos);
	}
	
// ADICIONALES
	
	static void print(String s) {
		System.out.print(s);
	}
		
	static void println(String s) {
		System.out.println(s);
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
