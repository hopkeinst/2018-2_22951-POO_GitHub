package taller7;

public class Caninos extends Mamiferos{

	public void perro() {
		
		super.edad = 11 ;
		super.ojos = "  constan de dos tipos de receptores de color " ;
		super.tamano = 75 ;
		super.raza = "PERRO";
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
