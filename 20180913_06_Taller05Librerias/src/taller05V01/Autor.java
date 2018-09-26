package taller05V01;

import java.util.ArrayList;
import java.util.Scanner;

public class Autor {
	
// ATRIBUTOS
	String nombre;
	String email;
	String web;
	
// OBJETOS
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Autor a;
	static Scanner sc;
	
// CONSTRUCTORES
	public Autor(String nombre,String email,String web) {
		this.nombre = nombre;
		this.email = email;
		this.web = web;
	}

	public Autor() {

	}
	
// MÉTODOS
	int addAut(String nombre,String email,String web) {
		a = new Autor(nombre,email,web);
		Main.autores.add(a);
		int nAut = Main.autores.size();
		return (nAut-1);
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
		print(" ** PRESIONE ENTER PARA CONTINUAR **");
		String entrada = "";
		do{
			entrada  = sc.nextLine();
		    System.out.println(entrada);
		}
		while(!entrada.equals("")); 
	}

}
