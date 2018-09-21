package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;

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
	
	// ADICIONALES
	
	static void print(String s) {
		System.out.print(s);
	}
		
	static void println(String s) {
		System.out.println(s);
	}
		
	void listarLibros() {
		
	}
		
	boolean menuEst(Estanteria e) {
		sc = new Scanner(System.in);
		
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
