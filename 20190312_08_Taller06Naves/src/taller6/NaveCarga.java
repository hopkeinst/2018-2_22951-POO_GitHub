package taller6;

public class NaveCarga extends Nave{

	
	
	private int maximaCarga;
		
	public NaveCarga(String matricula, int maximaCarga) {
        super(matricula);
        this.maximaCarga = maximaCarga;
	}
		 
	public void precioAlquiler() {}

	public int getMaximaCarga() {
		return maximaCarga;
	}

	public void setMaximaCarga(int maximaCarga) {
		this.maximaCarga = maximaCarga;
	}		
	
	
	
}

