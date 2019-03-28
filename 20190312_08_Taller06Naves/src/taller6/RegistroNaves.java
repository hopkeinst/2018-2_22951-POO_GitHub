package taller6;

import java.util.Scanner;

public class RegistroNaves {

	public int numNaves;
	public int aprobar;
	private boolean repeticion;
	private boolean repeticionGeneral;

	public RegistroNaves() {
		repeticion = true;
		repeticionGeneral = true;
	}
	
	
	public boolean getRepeticionGeneral() {
		return repeticionGeneral;
	}


	public void setRepeticionGeneral(boolean repeticionGeneral) {
		this.repeticionGeneral = repeticionGeneral;
	}


	Scanner sc = new Scanner(System.in);


	public void registrarNaves1() 
	{
		System.out.println();
        System.out.println("////////////////////////////////////////////////////////");
		System.out.println("////                                                ////");
		System.out.println("////  Digite el tipo de nave que quiere ingresar    ////");
		System.out.println("////                                                ////");
		System.out.println("////     Opciones:                                  ////");
		System.out.println("////                                                ////");
		System.out.println("////  1  = guardar nave                             ////");
		System.out.println("////  2  = no guaradar nave                         ////");
		System.out.println("////                                                ////");
		System.out.println("////////////////////////////////////////////////////////");
		System.out.print("Selecciona: ");

		 aprobar = sc.nextInt();
	    sc.nextLine();
	   
	    // no se guarda nave
	    if(aprobar == 2) 
	    {
	    	System.out.println("la nave no se guardo");
	    	setRepeticion(false);

	    }
	   
	    //por si se introduce un valor no deseado
	    if(aprobar>=3  ||  aprobar<=0) 
	    {
	    	System.out.println("el numero introducido no es correcto");
	    	System.out.println();
	    	System.out.println("INTENTALO NUEVAMENTE");
	    	setRepeticion(true);
	    }
	 }
	
	public void salir() {
		System.out.println();
 	    System.out.println("/////////////////////////////////////////////////////////////");
 		System.out.println("////                                                     ////");
 		System.out.println("////  DIGITE 1 SI DESEA SALIR                            ////");
 		System.out.println("////  DIGITE CUALQUIER OTRO NUMERO PARA VOLVER AL MENU   ////");
 		System.out.println("////                                                     ////");
 	    System.out.println("/////////////////////////////////////////////////////////////");
		System.out.print("Selecciona: ");

 	    int u1 = sc.nextInt();
 	    sc.nextLine();
 	    
 	    if( u1 == 1 ) {
 	    	System.out.println("cerrando...");
 	    	setRepeticionGeneral(false);
 	   }
 	      }
	
	//necesitaba un controlador de repeticion
	public boolean getRepeticion() {
		return repeticion;
	}

	public void setRepeticion(boolean repeticion) {
		this.repeticion = repeticion;
	}

	
	//se utiliza varias veces por lo que lo cree para poder ahorra codigo
	public void letrero() 
	{
		System.out.println();
		System.out.println("////////////////////////////////////////////////////////");
		System.out.println("////                                                ////");
		System.out.println("////  Digite el tipo de nave que quiere ingresar    ////");
		System.out.println("////                                                ////");
		System.out.println("////     Opciones:                                  ////");
		System.out.println("////                                                ////");
		System.out.println("////  1  =  Nave de Carreras                        ////");
		System.out.println("////  2  =  Nave de Tranporte de Pasajeros          ////");
		System.out.println("////  3  =  Nave carga Pequena                     ////");
		System.out.println("////  4  =  Nave carga Grande                       ////");
		System.out.println("////                                                ////");
		System.out.println("////////////////////////////////////////////////////////");
		System.out.print("Selecciona: ");
	 }

	
	public int aprobar() {
	   return aprobar;
    }

   	
	// se muestran todos los precios de los carros por tipo de carro
	public void mostarTodosprecios()
	{
		Carreras cr = new Carreras(null, 0);

    	TransporPasajero tp = new TransporPasajero (null, 0);
    	
    	NavePequena np = new NavePequena(null, 0); 
    	
    	NaveDeGranCarga ngc = new NaveDeGranCarga(null, 0); 
	    System.out.println();
		System.out.println("//////////////////////////////////////////////////////////////////////");
		System.out.println("////                                                              ////");
		System.out.println("////        PRECIOS DE ALQUILER POR DIA DE LAS NAVES              ////");	
		System.out.println("////                                                              ////");
        System.out.println("////     TIPO DE NAVE                 PRECIO POR DIA(Dactarios)   ////");
		System.out.println("////      nave de Carreras                 51.5                   ////");
		System.out.println("////      nave de Trasporte de pasajeros   53.5                   ////");
		System.out.println("////      Nave de carga pequeña            70                     ////");
		System.out.println("////      Nave de gran carga               90                     ////");
		System.out.println("////                                                              ////");
		System.out.println("//////////////////////////////////////////////////////////////////////");
		System.out.print("Selecciona: ");

	}

}



