package taller6;

public class Nave {

	public double precioPorDia;
	public String matricula;
	public int tipoNave;
	public double precioAlquiler;
	
	public Nave(String matricula) {
		this.matricula = matricula;
		precioPorDia=50.0;
	}
	
	public Nave() {
		
	}
	

	


	public String getMatriculaNave() {
		return matricula;
	}

	public void setMatriculaNave(String matriculaNave) {
		this.matricula = matriculaNave;
	}
}

