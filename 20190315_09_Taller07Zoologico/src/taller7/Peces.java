package taller7;

public class Peces extends Animal{

	public String escamas = " cuerpo cubierto de escamas";
	
	
public void comer() {
		
		System.out.println( " su alimentacion es de tres tipos: " );
		System.out.println( " carn�voros, herb�voros u omn�voros ");
	}
	public void mover() {
		
		System.out.println( " ellos se mueven nadando con ayuda de sus aletas " );
		
	}
	public void comunicarse() {
		
		System.out.println( " se comunican haciendo ruido, emiten gru�idos, gritos, pitidos y algunos lanzan sonidos similares a ronquidos" );
		

		
	}
	
	
	public void lenguados() {
		
		super.edad = 18 ;
		super.ojos = "  pueden alterar su color para mimetizarse " ;
		super.tamano = 60 ;
		super.raza = "LENGUADO";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( escamas + " y nacen de huevos ");
	}
	


	public void salmon() {
		super.edad = 10 ;
		super.ojos = "  no tienen caracteristicas sobresalientes " ;
		super.tamano = 1 ;
		super.raza = "SALMON";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " m");
		System.out.println( escamas + " y nacen de huevos ");
	}
	
	public void tiburon() {
		
		super.edad = 12 ;
		super.ojos = "  son dalt�nicos " ;
		super.tamano = 25 ;
		super.raza = "tiburon";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " m");
		System.out.println( escamas + " y nacen de huevos ");
	}
	
public void sardina() {
		
		super.edad = 15 ;
		super.ojos = "  no tiene caracteristicas sobresalientes " ;
		super.tamano = 25 ;
		super.raza = "SARDINA";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " Cm");
		System.out.println( escamas + " y nacen de huevos ");
	}

public void pezEspada() {
		
		super.edad = 5 ;
		super.ojos = "  son bastante llamativos " ;
		super.tamano = 2.5 ;
		super.raza = "PEZESPADA";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " m");
		System.out.println( escamas + " y nacen de huevos ");
	}



}
	

