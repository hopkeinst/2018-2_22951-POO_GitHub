package taller7;

public class Felinos extends Mamiferos{

public void gato() {
		
		super.edad = 9 ;
		super.ojos = "  tienen vision nocturna  " ;
		super.tamano = 24 ;
		super.raza = "GATO";
		super.tomaLeche = "toman leche";
		super.pelo = "cubierto de pelo";
		
		System.out.println( "   "  + super.raza + "   ");
		super.comer();
		super.mover();
		super.comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " ellos " + super.tomaLeche + " y su cuerpo esta " + super.pelo);
	}
}
