package taller7;

public class Mamiferos extends Animal{

	public String pelo;
	public String tomaLeche;
	
	public void comer() {
		System.out.println(" ellos son omnivoros, carnivoros o herbivoros");
	}
	public void mover() {
	
		System.out.println(" ellos se trasladan en cuatro patas");
	}
	public void comunicarse() {
		System.out.println(" ellos se comunican con sonidos,  quimica y lenguaje corporal" );
	}
	
	public void caballo() {
		
		super.edad = 11 ;
		super.ojos = "  tienen una vision binocular sobre un campo visual de 60 grados " ;
		super.tamano = 12 ;
		super.raza = "CABALLO";
		tomaLeche = "toman leche";
		pelo = "cubierto de pelo";
		
		System.out.println( "   "  + super.raza + "   ");
		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);
	}
public void jirafa() {
		
		super.edad = 25 ;
		super.ojos = "  tiene vision periferica" ;
		super.tamano = 402 ;
		super.raza = "JIRAFA";
		tomaLeche = "toman leche";
		pelo = "cubierto de pelo";
		
		System.out.println( "   "  + super.raza + "   ");
			comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);
	
}

public void mono() {
	
	super.edad = 20 ;
	super.ojos = "  tienen binocular estereoscopica y cromatica" ;
	super.tamano = 80 ;
	super.raza = "MONO";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}
public void gorila() {
	
	super.edad = 37 ;
	super.ojos = "  tienen binocular estereoscopica y cromatica" ;
	super.tamano = 106 ;
	super.raza = "GORILA";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}
public void elefante() {
	
	super.edad = 65 ;
	super.ojos = "  les permite poca vision" ;
	super.tamano = 600 ;
	super.raza = "ELEFANTE";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}

public void ardilla() {
	
	super.edad = 4 ;
	super.ojos = " tiene una exelente vision" ;
	super.tamano = 21 ;
	super.raza = "ARDILLA";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}

public void delfin() {
	
	super.edad = 50 ;
	super.ojos = " tiene vision binocular" ;
	super.tamano = 300 ;
	super.raza = "DELFIN";
	tomaLeche = "toman leche";
	pelo = "cubierto por piel y sin pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}

public void murcielago() {
	
	super.edad = 15 ;
	super.ojos = " no son utiles ya que son ciegos" ;
	super.tamano = 5.3 ;
	super.raza = "MURCIELAGO";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}
public void vaca() {
	
	super.edad = 23 ;
	super.ojos = " tiene vision panoramica" ;
	super.tamano = 250 ;
	super.raza = "VACA";
	tomaLeche = "toman leche";
	pelo = "cubierto de pelo";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tamano promedio es de " + super.tamano + " cm");
	System.out.println( " ellos " + tomaLeche + " y su cuerpo esta " + pelo);

}


}
