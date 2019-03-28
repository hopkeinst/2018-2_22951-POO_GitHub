package taller6;

public class NaveDeGranCarga extends NaveCarga{

	
	public double precioFijo;
	
	public NaveDeGranCarga(String matricula, int maximaCarga  ) {
		super(matricula, maximaCarga);
		this.precioPorDia = (precioPorDia + 40);
		super.tipoNave = 4;

	}
	
	public void precioAlquiler() {
		
	}
	
	public double precioAlquiler(int dias) {
		
		super.precioAlquiler = ( dias * precioPorDia );
		
		return precioAlquiler;
	}
		
	
}