package taller6;

public class Carreras extends navePasajero{
	
	public Carreras(String matricula, int hangar) {
	
		super(matricula, hangar);
		precioPorDia = ( this.precioPorDia + 1.5 );
        super.tipoNave = 1;
		
	}
	
	public double precioAlquiler(int dias) {
		
		super.precioAlquiler = ( dias * precioPorDia );
		
		return precioAlquiler;
	}
	
	
		}
	
	
	

