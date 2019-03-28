package taller7;

public class Aves extends Animal{

public void comer() {
		
		System.out.println( " Se alimentan principalmente de frutos y de semillas " );
		
	}
	public void mover() {
		
		System.out.println( " las mayoria de ellos vuelan " );
	}
	public void comunicarse() {
		
		System.out.println( " se comunican mediante los ruidos que hacen mientras taladran los �rboles y los guacos" 
				             + " producen sonidos golpeando el suelo con sus patas" );
	}
	
	public void paloma() {
			
			super.edad = 6 ;
			super.ojos = "  son raros por su composicion y por esta razon se presentan teorias alrededor de ellos " ;
			super.tamano = 55 ;
			super.raza = "PALOMA";
			
			System.out.println( "   "  + super.raza + "   ");
	 		comer();
			mover();
			comunicarse();
			System.out.println();
			System.out.println( " viven al rededor de " + super.edad + " a�os");
			System.out.println( " poseen unos ojos que " + super.ojos);
			System.out.println( " su tamano promedio es de " + super.tamano + " cm");
			System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
		}
	
	public void aguila() {
		
		super.edad = 18 ;
		super.ojos = "  son mur eficientes ya que tiene una aguda visi�n " ;
		super.tamano = 70 ;
		super.raza = "AGUILA";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}
	
	public void gorrion() {
		
		super.edad = 3 ;
		super.ojos = "  mancha de color marr�n rojizo detr�s de cada ojo " ;
		super.tamano = 15 ;
		super.raza = "GORRION";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que tienen una " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}
	
	public void canario() {
		
		super.edad = 10 ;
		super.ojos = "  presentan muy frecuente ricomoniasis " ;
		super.tamano = 10 ;
		super.raza = "CANARIO";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}
	public void gallina() {
		
		super.edad = 15 ;
		super.ojos = " distinguen mejor los colores que los humanos " ;
		super.tamano = 40 ;
		super.raza = "GALLINA";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}

	public void ganzo() {
		
		super.edad = 17 ;
		super.ojos = "  suelen ser marr�n avellana, gris y azules " ;
		super.tamano = 45 ;
		super.raza = "GANZO";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}
	public void pato() {
		
		super.edad = 7 ;
		super.ojos = "  no presentan grandes rasgos " ;
		super.tamano = 48 ;
		super.raza = "PATO";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}

	public void pavo() {
		
		super.edad = 10 ;
		super.ojos = "  son de color negro, marron y azules " ;
		super.tamano = 100 ;
		super.raza = "PAVO";
		
		System.out.println( "   "  + super.raza + "   ");
 		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( " viven al rededor de " + super.edad + " a�os");
		System.out.println( " poseen unos ojos que " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " cm");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}

}

