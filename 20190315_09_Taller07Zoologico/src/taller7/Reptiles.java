package taller7;

public class Reptiles extends Animal{

	public Reptiles() {
		
	} 
	 
	
	public void comer() {
		
		System.out.println( " su alimentacion es de tres tipos: " );
		System.out.println( " Carn�voros/insect�voros:  utilizan la grasa y las prote�nas como fuente de energ�a" );
	    System.out.println( " Herb�voros:  utilizan carbohidratos solubles y fibra fermentada" );
		System.out.println( " Omn�voros:  utilizan nutrientes de animales y plantas" );
	}
	public void mover() {
		
		System.out.println( " ellos se mueven de esta manera: " );
		System.out.println( " raptan, nadan y andan ");
	}
	public void comunicarse() {
		
		System.out.println( " se comunican por tres tipods de canales:" );
		System.out.println( " 1) canal acustico " );
		System.out.println( " 2) canal visual " );
		System.out.println( " 3) canal quimico " );

		
	}
	
	public void cocodrilo() {
		
		super.edad = 70 ;
		super.ojos = " muy buena vision " ;
		super.tamano = 4.3;
		super.raza = "COCODRILO";
		
		System.out.println( "   " + super.raza + "   ");

		comer();
		mover();
		comunicarse();
		System.out.println();
		System.out.println( "    COCODRILOS  " );
		System.out.println( " viven al rededor de " + super.edad + " anos");
		System.out.println( " son portadores de una " + super.ojos);
		System.out.println( " su tamano promedio es de " + super.tamano + " metros");
		System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
	}

		public void serpiente() {
			
			super.edad = 9 ;
			super.ojos = " ojos grandes y no parpadean " ;
			super.tamano = 2.5 ;
			super.raza = "SERPIENTE";
			
			System.out.println( "   "  + super.raza + "   ");
     		comer();
			mover();
			comunicarse();
			System.out.println();
			System.out.println( " viven al rededor de " + super.edad + " a�os");
			System.out.println( " son portadores de una " + super.ojos);
			System.out.println( " su tamano promedio es de " + super.tamano + " metros");
			System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
		}

		public void lagartija () {

			super.edad = 10 ;
			super.ojos = "  tres ojos " ;
			super.tamano = 6.5 ;
			super.raza = "LAGARTIJA";
			
			System.out.println( "   "  + super.raza + "   ");
     		comer();
			mover();
			comunicarse();
			System.out.println();
			System.out.println( " viven al rededor de " + super.edad + " a�os");
			System.out.println( " son portadoras de " + super.ojos);
			System.out.println( " su tamano promedio es de " + super.tamano + " cm");
			System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
			
		}
		
		public void camaleon() {
			super.edad = 5 ;
			super.ojos = "  se mueven independientemente y tiene una vision de 360 grados " ;
			super.tamano = 43 ;
			super.raza = "CAMALEON";
			
			System.out.println( "   "  + super.raza + "   ");
     		comer();
			mover();
			comunicarse();
			System.out.println();
			System.out.println( " viven al rededor de " + super.edad + " a�os");
			System.out.println( " son portadoras de unos ojos que  " + super.ojos);
			System.out.println( " su tamano promedio es de " + super.tamano + " cm");
			System.out.println( " cuerpo cubierto de escamas  y nacen de huevos ");
		}
	}



