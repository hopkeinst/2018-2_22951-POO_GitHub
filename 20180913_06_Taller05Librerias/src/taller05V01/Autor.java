package taller05V01;

import java.util.ArrayList;

public class Autor {
	
// ATRIBUTOS
	ArrayList <Libro> librosAut;
	String nombre;
	String email;
	String web;
	
// CONSTRUCTORES
	public Autor(String nombre,String email,String web) {
		this.nombre = nombre;
		this.email = email;
		this.web = web;
	}

	public Autor() {

	}

}
