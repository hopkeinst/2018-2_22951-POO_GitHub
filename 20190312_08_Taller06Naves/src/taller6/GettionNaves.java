package taller6;

import java.util.ArrayList;
import java.util.Scanner;

public class GettionNaves {
	
	static ArrayList<Carreras> listCarreras;
	static ArrayList<TransporPasajero> listPasajeros;
	static ArrayList<NavePequena> listPequena;
	static ArrayList<NaveDeGranCarga> listGran;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		listCarreras = new ArrayList<Carreras>();
		listPasajeros = new ArrayList<TransporPasajero>();
		listPequena = new ArrayList<NavePequena>();
		listGran = new ArrayList<NaveDeGranCarga>();
		
		//autos bases de la empresa
		
		
		Carreras cr1 = new Carreras("ABCD1234",2);
		Carreras cr2= new Carreras("EFGH5678",2);
		Carreras cr3= new Carreras("IJKL9123",2);
		Carreras cr4 = new Carreras("MNOP4567",2);
		listCarreras.add(cr1);
		listCarreras.add(cr2);
		listCarreras.add(cr3);
    	listCarreras.add(cr4);
    	
    	TransporPasajero tp1 = new TransporPasajero("QRST7891",1) ;
        TransporPasajero tp2 = new TransporPasajero("UVXY2345",1) ;
        TransporPasajero tp3 = new TransporPasajero("ZABC6789",1) ;
        TransporPasajero tp4 = new TransporPasajero("DEFG1234",1) ;
        listPasajeros.add(tp1);
        listPasajeros.add(tp2);
        listPasajeros.add(tp3);
        listPasajeros.add(tp4);
        
        NavePequena np1 = new NavePequena("HIJK5678",15);
        NavePequena np2 = new NavePequena("LMNO8912",15);
        NavePequena np3 = new NavePequena("PQRS3456",15);
        listPequena.add(np1);
        listPequena.add(np2);
        listPequena.add(np3);
        
        NaveDeGranCarga nc1 = new NaveDeGranCarga("TPUV7891", 50);
        NaveDeGranCarga nc2 = new NaveDeGranCarga("WXYZ2345", 50);
        listGran.add(nc1);
        listGran.add(nc2);

    		
	    RegistroNaves rn = new RegistroNaves();

	    while( rn.getRepeticionGeneral() == true) {
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.println("////                                                   ////");
		System.out.println("////  Digite el tipo de accion que desee realizar      ////");
		System.out.println("////                                                   ////");
		System.out.println("////     Opciones:                                     ////");
		System.out.println("////                                                   ////");
		System.out.println("////  1  =  Ingresar nueva nave                        ////");
		System.out.println("////  2  =  Obtener el precio de un vehiculo           ////");
		System.out.println("////  3  =  Mostrar todos los precios                  ////");
		System.out.println("////  4  =  valor general del alquiler de la nave      ////");
		System.out.println("////  5  =  Buscar nave                                ////");
		System.out.println("////  6  =  Conocer lista de las naves de la empresa   ////");
		System.out.println("////                                                   ////");
		System.out.println("///////////////////////////////////////////////////////////");
		System.out.print("Selecciona: ");
		int x = sc.nextInt();
	    sc.nextLine();
	   
	    
	    if(x == 1) {
                 rn.letrero();
	    		 int c = sc.nextInt();
	    		    sc.nextLine();  		
	    	    	    		    
	    		   //este while es por si la persona no digita el numero correcto en el momento de guardado o no guardado
	    		   
	    		    while (rn.getRepeticion() == true) {
	   	    	    
	    	       // guardar nave de carrera 
                  if( c == 1 ) {
	    	    	System.out.println("Digite la matricula: ");
	    	    	System.out.println(" Ejemplo: ABCD1234  ");
	    			System.out.println("Digite: ");

	    	    	String a = sc.nextLine();  
	    	        System.out.println("Digite el numero de hangar en el que se encontrara: ");
	    			System.out.println("Digite: ");

	    	        int b = sc.nextInt();
	    	        sc.nextLine();
	    	        Carreras cr = new Carreras(a, b);
	    	        
	    	        System.out.println();
	    	        System.out.println("DATOS DE LA NAVE");
	    	        System.out.println("La nave de carrera es de matricula: "+ cr.matricula +
	    	        		           " y estara en el hangar: \t" + cr.getHangar());	 
	    	        
	    	        //por si intrudice mal los datos, se da la opcion de no agregarlo a la lista.
                    rn.registrarNaves1();
		    	    
		    		// se guardara la nave
		    	    if(rn.aprobar == 1) {
		    	    	listCarreras.add(cr);
		    	    	System.out.println("la nave se guardo correctamente");
		    	    	rn.setRepeticion(false);
		    	    	
		    	    }
		    	    }

	    		   // guardar nave de transporte de pasajeros
	    	    if( c == 2 ) {
	    	    	System.out.println("Digite la matricula: ");
	    	    	System.out.println(" Ejemplo: ABCD1234  ");
	    			System.out.println("Digite: ");

	    	        String a = sc.nextLine();  
	    	        System.out.println("Digite el numero de hagar en el que se encontrara: ");
	    			System.out.println("Digite: ");

	    	        int b = sc.nextInt();
	    	        sc.nextLine();
	    	        TransporPasajero tp = new TransporPasajero(a, b);
	    	        
	    	        System.out.println();
	    	        System.out.println("DATOS DE LA NAVE");
	    	        System.out.println("La nave de transporte de pasajeros es de matricula: "+ tp.matricula + 
	    	        		            " y estara en el hangar: \t" + tp.getHangar());
	    	        
                   //por si intrudice mal los datos, se da la opcion de no agregarlo a la lista.
	    	        
                    rn.registrarNaves1();

		    	    // se guardara la nave
		    	    if(rn.aprobar == 1) {
		    	    	listPasajeros.add(tp);
		    	    	System.out.println("la nave se guardo correctamente");
		    	    	rn.setRepeticion(false);

		    	    }
	    	    }  
	    	    
	    	    
	    	    // guardar nave de de carga pequeña
	               if( c == 3) {
		    	    	System.out.println("Digite la matricula: ");
		    	    	System.out.println(" Ejemplo: ABCD1234  ");
		    			System.out.println("Digite: ");

		    	        String a = sc.nextLine();  
		    	        System.out.println("Digite la maxima cantidad maxima de carga que tendra la nave: ");
		    			System.out.println("Digite: ");

		    	        int b = sc.nextInt();
		    	        sc.nextLine();
		    	        NavePequena cp = new NavePequena(a, b);

		    	        System.out.println();
		    	        System.out.println("DATOS DE LA NAVE");
		    	        System.out.println("La nave de carga pequena es de matricula: "+ cp.matricula + 
		    	        		            ", su maximo de de carga sera :" + cp.getMaximaCarga());
		    	        //por si intrudice mal los datos, se da la opcion de no agregarlo a la lista.
	                   
		    	        rn.registrarNaves1();

		    	     	// se guardara la nave
			    	    if(rn.aprobar == 1) {
			    	    	listPequena.add(cp);
			    	    	System.out.println("la nave se guardo correctamente");
			    	    	rn.setRepeticion(false);
			    	    }
	    	    }
	
			    	    
	    	   // guardar nave de gran carga
	    	   if( c == 4) {
		    	    	System.out.println("Digite la matricula: ");
		    	    	System.out.println(" Ejemplo: ABCD1234  ");
		    			System.out.println("Digite: ");

		    	        String a = sc.nextLine();  
		    	        System.out.println("Digite la maxima cantidad maxima de carga que tendra la nave: ");
		    			System.out.println("Digite: ");

		    	        int b = sc.nextInt();
		    	        sc.nextLine();
		    	        NaveDeGranCarga cg = new NaveDeGranCarga(a, b);
		    	        
		    	        
		    	        System.out.println();
		    	        System.out.println("DATOS DE LA NAVE");
		    	        System.out.println("La nave de carga pequena es de matricula: "+ cg.matricula + 
	        		            ", su maximo de de carga sera :" + cg.getMaximaCarga());
		    	       //por si intrudice mal los datos, se da la opcion de no agregarlo a la lista.
		    	        
		    	    	rn.setRepeticion(false);

		    	     
			    	    // se guardara la nave
			    	    if(rn.aprobar == 1) {
			    	    	listGran.add(cg);
			    	    	System.out.println("la nave se guardo correctamente");
			    	    	rn.setRepeticion(false);

			    	    }	
	    	        }
	    	    }
	    		        //salir o volver al menu
	    				rn.salir();
			   }      
		    	    
            if(x == 2) {		    	
		    		System.out.println();
		    		System.out.println("///////////////////////////////////////////////////////////////");
		    		System.out.println("////                                                       ////");
		    		System.out.println("////  Digite el tipo de nave que quiere saber su precio    ////");
		    		System.out.println("////  por dia                                              ////");
		    		System.out.println("////     Opciones:                                         ////");
		    		System.out.println("////                                                       ////");
		    		System.out.println("////  1  =  Nave de Carreras                               ////");
		    		System.out.println("////  2  =  Nave de Tranporte de Pasajeros                 ////");
		    		System.out.println("////  3  =  Nave carga Pequena                             ////");
		    		System.out.println("////  4  =  Nave carga Grande                              ////");
		    		System.out.println("////                                                       ////");
		    		System.out.println("///////////////////////////////////////////////////////////////");
		    		System.out.println("Selecciona: ");
		    	    int p = sc.nextInt();
		    	    sc.nextLine();    		
		    	
		    	    //conocer el alquiler de una nave por dia
		    	    if(p == 1 ) {
		    	    	Carreras cr = new Carreras(null, 0);
		    	    	System.out.println("El precio por dia de alquiler de la nave carreras es : " 
		    	    	                   + cr.precioPorDia);
		    	    }
		    	    
		    	    if( p == 2 ) {
		    	    	TransporPasajero tp = new TransporPasajero (null, 0);
		    	    	System.out.println("El precio por dia de alquiler de la nave de transporte de pasajeros :" 
		    	    	                   + tp.precioPorDia);
		    	    }
		    	    
		    	    if( p== 3 ) {
		    	    	NavePequena np = new NavePequena(null, 0); 
		    	        System.out.println(" El precio por dia de alquiler de la nave de carga pequena es: "
		    	    	                   + np.precioPorDia);
		    	    	
		    	    }
		    	    
		    	    if( p == 4 ) {
		    	    	NaveDeGranCarga ngp = new NaveDeGranCarga(null, 0); 
		    	        System.out.println(" El precio por dia de alquiler de la nave de gran carga es :"
		    	    	                   + ngp.precioPorDia);
		    	    }
		    		
		    	  //salir o volver al menu
		    	  rn.salir();
	  }
		    	
	
       if(x==3) {	
	        	 rn.mostarTodosprecios();
	        	
	        	 //salir o volver al menu
	    		  rn.salir();
	      }
		    	    	
     if(x == 4) {
				   // saber el costo del alquiler teniedno en cuenta la cantidad de dias
					Carreras cr = new Carreras(null, 0);

			    	TransporPasajero tp = new TransporPasajero (null, 0);
			    	
			    	NavePequena np = new NavePequena(null, 0); 
			    	
			    	NaveDeGranCarga ngc = new NaveDeGranCarga(null, 0); 

			    	rn.letrero();
			    	int y = sc.nextInt();
	    		    sc.nextLine();  
			    	
			    	if( y == 1 ) {
     	     	        System.out.println();
		        	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("////                                                       ////");
			    		System.out.println("////   Digite las cantidad de dias que requiere la nave    ////");
			    		System.out.println("////                                                       ////");
			    	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("Selecciona: ");

			    	    int d = sc.nextInt();
			    	    sc.nextLine();

				   System.out.println(cr.precioAlquiler(d) + " Dactarios" );

			    	}
			    	
			    	if( y == 2 ) {
     	     	        System.out.println();
		        	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("////                                                       ////");
			    		System.out.println("////   Digite las cantidad de dias que requiere la nave    ////");
			    		System.out.println("////                                                       ////");
			    	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("Selecciona: ");

			    	    int d = sc.nextInt();
			    	    sc.nextLine();

				   System.out.println(tp.precioAlquiler(d) + " Dactarios" );

			    	}
			    	
			    	if( y == 3 ) {
     	     	        System.out.println();
		        	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("////                                                       ////");
			    		System.out.println("////   Digite las cantidad de dias que requiere la nave    ////");
			    		System.out.println("////                                                       ////");
			    	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("Selecciona: ");

			    	    int d = sc.nextInt();
			    	    sc.nextLine();

				   System.out.println(np.precioAlquiler(d) + " Dactarios" );

			    	}
			    	
			    	if( y == 4 ) {
     	     	        System.out.println();
		        	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("////                                                       ////");
			    		System.out.println("////   Digite las cantidad de dias que requiere la nave    ////");
			    		System.out.println("////                                                       ////");
			    	    System.out.println("///////////////////////////////////////////////////////////////");
			    		System.out.println("Selecciona: ");

			    	    int d = sc.nextInt();
			    	    sc.nextLine();

				   System.out.println(ngc.precioAlquiler(d) + " Dactarios" );

		        	}
			    	
		   			//salir o volver al menu
			   		rn.salir();
			    }

      if(x==5) {
				  
				   //buscar en las listas por la matricula
				    System.out.println();
	        	    System.out.println("/////////////////////////////////////////////////////////////");
		    		System.out.println("////                                                     ////");
		    		System.out.println("////     DIGITE LA MATRICULA DE LA NAVE A BUSCAR         ////");		    	
		    		System.out.println("////                                                     ////");
		    	    System.out.println("/////////////////////////////////////////////////////////////");
		    		System.out.println("Selecciona: ");

		    	    String d = sc.nextLine();
		    	   
		       	    boolean h = true;
		    	    boolean busc = true;
		    	    	if(busc == true) {

		    	    		for( Carreras e : listCarreras) 
		    	    		{

   	    	    			  if( e.matricula.contentEquals(d) ) {

   	    	    				  
		    	    				System.out.println( "La matricula es: " + e.matricula );
		    	    				System.out.println( "El hangar en el que se encuentra: " + e.getHangar() );
		    	    				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de carreras" );
		    	    			  h = false;
		    	     		   }
    	    				}
		    	    		
		    	    		for( TransporPasajero e : listPasajeros) 
		    	    		{

   	    	    			  if( e.matricula.contentEquals(d) ) {

   	    	    				  
		    	    				System.out.println( "La matricula es: " + e.matricula );
		    	    				System.out.println( "El hangar en el que se encuentra: " + e.getHangar() );
		    	    				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de transporte de pasajeros" );
		    	    			  h = false;
		    	     		   }
    	    				}
				      	  
		    	    		for( NavePequena e : listPequena) 
		    	    		{
   	    	    			  if( e.matricula.contentEquals(d) ) {

		    	    				System.out.println( "La matricula es 1: " + e.matricula );
		    	    				System.out.println( "Maxima carga de la nave es: " + e.getMaximaCarga() );
		    	    				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de carga pequeña" );
		    	    				 h = false;
		    	     		   }
    	    				}
		    	    		
		    	    		for( NaveDeGranCarga e : listGran) 
		    	    		{
   	    	    			  if( e.matricula.contentEquals(d) ) {

		    	    				System.out.println( "La matricula es 1: " + e.matricula );
		    	    				System.out.println( "Maxima carga de la nave es: " + e.getMaximaCarga() );
		    	    				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de gran carga");
		    	    				 h = false;
		    	     		   }
    	    				}
		    	    		
		    	     	}
		    	    	
		    	    	   if ( h == true ) {
		    	    		   System.out.print("no se encontro");
		    	    		   System.out.println();
		    	    	     }
		    	    	   
		                    rn.salir();

		    	         }
     
     if( x==6 ) {
    	 
        System.out.println();
 	    System.out.println("/////////////////////////////////////////////////////////////");
 		System.out.println("////                                                     ////");
 		System.out.println("////            LAS NAVES DE LA EMPRESA SON              ////");		    	
 		System.out.println("////                                                     ////");
 	    System.out.println("/////////////////////////////////////////////////////////////");
		System.out.println("Selecciona: ");

    	 
    	 for(Carreras e : listCarreras) 
 		 {
 				System.out.println( "La matricula es: " + e.matricula );
 				System.out.println( "El hangar en el que se encuentra: " + e.getHangar() );
 				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de carreras");
 				System.out.println();
 				System.out.println();

 				}
    	
    	 for( TransporPasajero e : listPasajeros ) 
  		  {
  				System.out.println( "La matricula es: " + e.matricula );
  				System.out.println( "El hangar en el que se encuentra: " + e.getHangar() );
  				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de transporte de pasajeros" );
  				System.out.println();
 				System.out.println();
  				}
    	
    	 for( NavePequena e : listPequena ) 
 		 {
 				System.out.println( "La matricula es 1: " + e.matricula );
 				System.out.println( "Maxima carga de la nave es: " + e.getMaximaCarga() );
 				System.out.println( "Tipo de la nave: " + e.tipoNave + " = nave de carga pequeña" );
 				System.out.println();
 				System.out.println();
  		   }
			
    
        for( NaveDeGranCarga e : listGran) 
		 {
				System.out.println( "La matricula es 1: " + e.matricula );
				System.out.println( "Maxima carga de la nave es: " + e.getMaximaCarga() );
				System.out.println( "Tipo de la nave es: " + e.tipoNave + " = nave de gran carga" );
				System.out.println();
 				System.out.println();
		   }
			     
                 rn.salir();
     
     
                      }
                 }	    
	        }
       }

   
	



