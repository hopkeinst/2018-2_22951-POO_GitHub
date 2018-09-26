package taller05V01;

import java.util.Scanner;

public class CasaPublicacion {

// ATRIBUTOS
	String nombre;
	String email;
	int tel;
	String web;
	
// OBJETOS
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Autor a;
	static CasaPublicacion cp;
	static Scanner sc;
		
// CONTRUCTORES
	public CasaPublicacion(String nombre, String email, int tel, String web) {
		this.nombre = nombre;
		this.email = email;
		this.tel = tel;
		this.web = web;
	}
	
	public CasaPublicacion() {

	}
	
// MÉTODOS
	int addCP(String nombre, String email, int tel, String web) {
		cp = new CasaPublicacion(nombre,email,tel,web);
		Main.editoriales.add(cp);
		int nAut = Main.editoriales.size();
		return (nAut-1);
	}

}
