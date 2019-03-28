package taller7;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("////////                                                                 ////////");
		System.out.println("////////   DIGITE EL NOMBRE DEL ANIMAL QUE QUIERE SABER SU INFORMACION   ////////");
		System.out.println("////////                                                                 ////////");
		System.out.println("////////      LOS NOMBRES DE LOS ANIMALES DEBEN DE IR MAYUSCULA          ////////");
		System.out.println("////////                                                                 ////////");
		System.out.println("////////  DIGITE (VER) SI QUIERE SABER QUE ANIMALES HAY EN EL ZOOLOGICO  ////////");
		System.out.println("////////                                                                 ////////");
		System.out.println("/////////////////////////////////////////////////////////////////////////////////");
		System.out.println("Selecciones: ");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		
		boolean vali = true;
		
		// creando objetos de la clase
		Mamiferos ma = new Mamiferos();
		Anfibios an = new Anfibios();
		Reptiles re = new Reptiles();
		Peces pe = new Peces();
		Aves av = new Aves();
		Caninos ca = new Caninos();
		Felinos fe = new Felinos();
		
		// if para cada animal a imprimir
		if(a.contentEquals("VER") ){
			
			System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");
			System.out.println("////////                                                                            ////////");
			System.out.println("////////               LOS ANIMALES DEL ZOOLOGICO SON:                              ////////");
			System.out.println("////////  MAMIFEROS: perro, gato, caballo, jirafa, mono, gorila, ardilla, delfin    ////////");
			System.out.println("////////             murcielago y vaca                                              ////////");
			System.out.println("////////  REPTILES:  cocodrilo, serpiente, lagartija y camaleon                     ////////");
			System.out.println("////////  PECES:     lenguados, salmon, trucha, sardina, pez espada y dorada        ////////");
			System.out.println("////////  AVES:      paloma, aguila, gorrion, canario, gallina, ganzo, pato y pavo  ////////");
			System.out.println("////////  ANFIBIOS:  rana, sapo, triton y salamandra                                ////////");
			System.out.println("////////                                                                            ////////");
			System.out.println("////////////////////////////////////////////////////////////////////////////////////////////");

		}
		if(a.contentEquals("GATO")) {
			fe.gato();
			vali = false;
		}
		if(a.contentEquals("PERRO")) {
			ca.perro();
			vali = false;
		}
		
		if(a.contentEquals("CABALLO")) {
			ma.caballo();
			vali = false;
		}
		
		if(a.contentEquals("JIRAFA")) {
			ma.jirafa();
			vali = false;
		}
		
		if(a.contentEquals("MONO")) {
			ma.mono();
			vali = false;
		}
		
		if(a.contentEquals("GORILA")) {
			ma.gorila();
			vali = false;
		}

		if(a.contentEquals("ELEFANTE")) {
			ma.elefante();
			vali = false;
		}

		if(a.contentEquals("ARDILLA")) {
			ma.ardilla();
			vali = false;
		}

		if(a.contentEquals("DELFIN")) {
			ma.delfin();
			vali = false;
		}

		if(a.contentEquals("MURCIELAGO")) {
			ma.murcielago();
		}

		if(a.contentEquals("VACA")) {
			ma.vaca();
			vali = false;
		}
		
		if(a.contentEquals("COCODRILO")) {
			re.cocodrilo();
			vali = false;
		}
		if(a.contentEquals("SERPIENTE")) {
			re.serpiente();
			vali = false;
		}
		if(a.contentEquals("LAGARTIJA")) {
			re.lagartija();
			vali = false;
		}
		if(a.contentEquals("CAMALEON")) {
			re.camaleon();
			vali = false;
		}
		if(a.contentEquals("LRNGUADOS")) {
			pe.lenguados();
			vali = false;
		}
		if(a.contentEquals("SALMON")) {
			pe.salmon();
			vali = false;
		}
		if(a.contentEquals("SARDINA")) {
			pe.sardina();
			vali = false;
		}
		if(a.contentEquals("TIBURON")) {
			pe.tiburon();
			vali = false;
		}
		if(a.contentEquals("PEZ ESPADA")) {
			pe.pezEspada();
			vali = false;
		}
		if(a.contentEquals("PALOMA")) {
			av.paloma();
			vali = false;
		}
		if(a.contentEquals("AGUILA")) {
			av.aguila();
			vali = false;
		}
		if(a.contentEquals("GORRION")) {
			av.gorrion();
			vali = false;
		}
		if(a.contentEquals("CANARIO")) {
			av.canario();
			vali = false;
		}
		if(a.contentEquals("GALLINA")) {
			av.gallina();
			vali = false;
		}
		if(a.contentEquals("GANZO")) {
			av.ganzo();
			vali = false;
		}
		if(a.contentEquals("PATO")) {
			av.pato();
			vali = false;
		}
		if(a.contentEquals("PAVO")) {
			av.pavo();
			vali = false;
		}
		if(a.contentEquals("RANA")) {
			an.rana();
			vali = false;
		}
		if(a.contentEquals("SAPO")) {
			an.sapo();
			vali = false;
		}
		if(a.contentEquals("TRITON")) {
			an.triton();
			vali = false;
		}
		if(a.contentEquals("SALAMANDRA")) {
			an.salamandra();
			vali = false;
		}
		
		if(vali == true ) {
			
			
			System.out.println("no se encuentra el animal en el zoologico");
		}
		
	}

}
