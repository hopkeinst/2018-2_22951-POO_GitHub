package taller6;

public class NavePequena extends NaveCarga {

	public NavePequena(String matricula, int maximaCarga) {
		super(matricula, maximaCarga);
		this.precioPorDia = (precioPorDia + 20);
		super.tipoNave = 3;

		
	}
	
	public double precioAlquiler(int dias) {
		
		super.precioAlquiler = ( dias * precioPorDia );
		
		return precioAlquiler;
	}
	
	
	
}