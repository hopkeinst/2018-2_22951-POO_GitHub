package taller6;

public class TransporPasajero extends navePasajero {

	public double precioPorHangar;

	public  TransporPasajero( String matricula,int hangar) {
		super(matricula, hangar);
		
		super.tipoNave = 2;
		
		precioPorDia = ( this.precioPorDia + 3.5 );
	}
	
	
	public double precioAlquiler(int dias) {
	
		super.precioAlquiler = ( dias * precioPorDia );
		
		return precioAlquiler;
	}
	
	
	
	
    	
}