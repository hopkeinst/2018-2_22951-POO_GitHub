package taller6;

public class navePasajero extends Nave{

	public double precioDiaHangar;
	private int hangar;
	
	public navePasajero( String matricula, int hangar ) {
		super(matricula);
		this.hangar = hangar;
	}
	
	public navePasajero() {
		super();
	}
	
	

	public int getHangar() {
		return hangar;
	}

	public void setHangar(int hangar) {
		this.hangar = hangar;
	}
	
	
	
	


	
}
