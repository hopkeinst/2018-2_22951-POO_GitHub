package taller7;

public class Anfibios extends Animal{

	public void comer() {
		System.out.println( " son animales que son carnivoros ya que sus dietas son poco variadas ");
	}
	public void mover() {
		
		System.out.println( " ellos se trasladan andando o por medio de saltos");
	}
	public void comunicarse() {
		System.out.println( " ellos se comunican atraves de un croar");
	}

public void rana() {
	
	super.edad = 11 ;
	super.ojos = "  tienen una vision binocular sobre un campo visual de 60 grados " ;
	super.tamano = 12 ;
	super.raza = "RANA";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tama�o promedio es de " + super.tamano + " cm");
	System.out.println( " cuerpo humedo  y nacen de huevos ");
}

public void sapo() {
	
	super.edad = 12 ;
	super.ojos = "  tienen una vision binocular sobre un campo visual de 60 grados " ;
	super.tamano = 12 ;
	super.raza = "SAPO";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tama�o promedio es de " + super.tamano + " cm");
	System.out.println( " cuerpo humedo y nacen de huevos ");
}

public void triton() {
	
	super.edad = 8 ;
	super.ojos = "  es poco desarrollada" ;
	super.tamano = 7.5 ;
	super.raza = "TRITON";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " anos");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tama�o promedio es de " + super.tamano + " cm");
	System.out.println( " cuerpo humedo y nacen de huevos ");
}

public void salamandra() {
	
	super.edad = 27 ;
	super.ojos = "  pueden ver de noche ( vision nocturna ) " ;
	super.tamano = 16 ;
	super.raza = "SALAMANDRA";
	
	System.out.println( "   "  + super.raza + "   ");
		comer();
	mover();
	comunicarse();
	System.out.println();
	System.out.println( " viven al rededor de " + super.edad + " a�os");
	System.out.println( " poseen unos ojos que " + super.ojos);
	System.out.println( " su tama�o promedio es de " + super.tamano + " cm");
	System.out.println( " cuerpo humedo  y nacen de huevos ");
}
}
