package taller05V01;

import java.util.Scanner;

public class Capitulo {
	
// ATRIBUTOS
	String titulo;
	int pagIni;
	int pagFin;
	int num;
	
// OBJETOS
	static Libreria l;
	static Estanteria e;
	static Libro b;
	static Capitulo c;
	static Autor a;
	static Capitulo cap;
	static Scanner sc;
	
// CONSTRUCTORES

	public Capitulo(String titulo, int pagIni, int pagFin, int num) {
		super();
		this.titulo = titulo;
		this.pagIni = pagIni;
		this.pagFin = pagFin;
		this.num = num;
	}

	public Capitulo() {

	}
	
// MÉTODOS
	Capitulo addCap(String titulo,int pagIni,int pagFin,int num,Libro b) {
		c = new Capitulo(titulo,pagIni,pagFin,num);
		b.capitulos.add(c);
		b.maxCap++;
		return this;
	}

}
