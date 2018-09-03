package punto02_reloj;

//Importamos librerías de tiempo 
//import java.util.Timer;
//import java.util.TimerTask;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Relooj extends Principal{

//Variables de tiempo
	int anoAct;
	byte mesAct;
	byte diaAct;
	byte horAct;
	byte minAct;
	byte segAct;
//Para el formato 24 horas
	static boolean for24 = true;
	String amPm = "am";

//Se crea el objeto para el manejo del tiempo
	Calendar tiempo = Calendar.getInstance();
	
//Timer para el cronómetro, y se deja vacía para asignarle las características
// en el método correspondiente, y pararlo en otro método
	Timer tCrono = null;
	byte horCro = 0;
	byte minCro = 0;
	byte segCro = 0;
	int mSegCro = 0;
	
// ### CONSTRUCTORES VARIOS

//Constructor que toma el tiempo actual,pero escogiendo formato 12 o 24
	public Relooj(String formato) {

//Se le hace la asignación a los atributos del objeto de la clase Relooj
// los valores obtenidos por la clase Calendar (hora y fecha del computador)
		this.anoAct = tiempo.get(Calendar.YEAR);
		this.mesAct = (byte) ((tiempo.get(Calendar.MONTH))+1);
		this.diaAct = (byte) tiempo.get(Calendar.DATE);
//Se lee si el string ingresado como argumento al constructor, que es para 
// saber cual formato de reloj, y asigna la hora y a una bandera si es 
// 12 o 24 horas
		if(formato == "12") {
			this.horAct = (byte) tiempo.get(Calendar.HOUR);
			for24 = false;
// Calendar.AM_PM = 0 cuando es am, y 1 cuando es pm
			if(tiempo.get(Calendar.AM_PM) == 0) {
				this.amPm = "am";
			}else {
				this.amPm = "pm";
			}
		}else if(formato == "24") {
			this.horAct = (byte) tiempo.get(Calendar.HOUR_OF_DAY);
			for24 = true;
		}
		this.minAct = (byte) tiempo.get(Calendar.MINUTE);
		this.segAct = (byte) tiempo.get(Calendar.SECOND);	
		
//Se crea un objeto de un timer para llevar el tiempo cada segundo
	    Timer tempo01 = new Timer();
//Se crea un objeto para el timer, para que lleve a una actividad o tarea
	    TimerTask rSegundo = new TimerTask(){
	    	@Override
	    	public void run()
	    	{
//Aumenta de uno en uno los segundos, cada segundo
	    		segAct++;
//Y los casos de qué sucede si llega a los 60 segundos, a los 60 minutos,
// a las 24 horas, a los 28, 30 o 31 días, a los 12 meses y así sucesivamente
// para ir incrementando la siguiente variable
	    		if(segAct >= 60) {
	    			minAct++;
	    			segAct = 0;
	    		}
	    		if(minAct >= 60) {
	    			horAct++;
	    			minAct = 0;
	    		}
	    		if(for24 == true) {
	    			if(horAct >= 24) {
	    				diaAct++;
	    				horAct = 0;
	    			}
	    		}else {
	    			if((horAct == 12) && (segAct == 0)) {
	    				if(amPm == "am") {
	    					amPm = "pm";
	    				}else if((amPm == "pm") && (segAct == 0)) {
	    					diaAct++;
	    					horAct = 0;
	    					amPm = "am";
	    				}
	    			}
	    		}
	    		if((diaAct >= 29) && (mesAct == 2) && ((anoAct % 4) != 0)) {
	    			mesAct++;
	    			diaAct = 1;
	    		}else if((diaAct >= 30) && (mesAct == 2) && ((anoAct % 4) == 0)) {
	    			mesAct++;
	    			diaAct = 1;
	    		}else if((diaAct >= 31) && ((mesAct == 4) || (mesAct == 6) || (mesAct == 9) || (mesAct == 11))) {
	    			mesAct++;
	    			diaAct = 1;
	    		}else if((diaAct >= 32) && ((mesAct == 1) || (mesAct == 3) || (mesAct == 5) || (mesAct == 7) || (mesAct == 8) || (mesAct == 10) || (mesAct == 12))) {
	    			mesAct++;
	    			diaAct = 1;
	    		}
	    		if(mesAct >= 13) {
	    			anoAct++;
	    			mesAct = 1;
	    		}
//Y se le asigma al label que está en la ventana principal mostrando
// la hora y fecha, con el cambio correspondiente
	    		Principal.lFecHor.setText(Byte.toString(diaAct)+"-"+Byte.toString(mesAct)+"-"+Integer.toString(anoAct)+" "+Byte.toString(horAct)+":"+Byte.toString(minAct)+":"+Byte.toString(segAct));
	    		if(Principal.boolConfigReloj == true) {
	    			VConfigReloj.lActual2.setText(Byte.toString(diaAct)+"-"+Byte.toString(mesAct)+"-"+Integer.toString(anoAct)+" "+Byte.toString(horAct)+":"+Byte.toString(minAct)+":"+Byte.toString(segAct));
	    			if(isFor24() == false) {
		            	VConfigReloj.lActual2.setText(VConfigReloj.lActual2.getText()+amPm);
		            }
	    		}
	    		if(isFor24() == false) {
	            	Principal.lFecHor.setText(Principal.lFecHor.getText()+amPm);
	            }
	    		if(Principal.boolCrono == true) {
	    			VCronometro.lActual.setText(Byte.toString(diaAct)+"-"+Byte.toString(mesAct)+"-"+Integer.toString(anoAct)+" "+Byte.toString(horAct)+":"+Byte.toString(minAct)+":"+Byte.toString(segAct));
	    			if(isFor24() == false) {
	    				VCronometro.lActual.setText(VCronometro.lActual.getText()+amPm);
		            }
	    		}
	        }
	    };
	    tempo01.schedule(rSegundo, 0, 1000);
	}
	
	void iniciaCrono() {
		VCronometro.bIniciar.setEnabled(false);
		VCronometro.bReiniciar.setEnabled(true);
		VCronometro.bPausar.setEnabled(true);
		tCrono = new Timer();
		TimerTask mSeg = new TimerTask(){
	    	@Override
	    	public void run()
	    	{
	    		mSegCro+=50;
	    		if(mSegCro >= 1000) {
	    			segCro++;
	    			mSegCro = 0;
	    		}
	    		if(segCro >= 60) {
	    			minCro++;
	    			segCro = 0;
	    		}
	    		if(minCro >= 60) {
	    			horCro++;
	    			minCro = 0;
	    		}
	    		VCronometro.lCrono.setText(Byte.toString(horCro)+":"+Byte.toString(minCro)+":"+Byte.toString(segCro)+":"+Integer.toString(mSegCro/10));
	    	}
	    };
	    tCrono.schedule(mSeg, 0, 50);
	}
	
	void pausaCrono() {
		VCronometro.bIniciar.setEnabled(true);
		VCronometro.bReiniciar.setEnabled(true);
		VCronometro.bPausar.setEnabled(false);
		tCrono.cancel();
	}
	
	void reiniciaCrono() {
		mSegCro = 0;
		segCro = 0;
		minCro = 0;
		horCro = 0;
		if(VCronometro.bPausar.isEnabled() == false) {
			VCronometro.bReiniciar.setEnabled(false);
		}else {
			VCronometro.bIniciar.setEnabled(false);
			VCronometro.bReiniciar.setEnabled(true);
			VCronometro.bPausar.setEnabled(true);
		}
		VCronometro.lCrono.setText(Byte.toString(horCro)+":"+Byte.toString(minCro)+":"+Byte.toString(segCro)+":"+Integer.toString(mSegCro/10));
	}

	public static void setFor24(boolean for24) {
		Relooj.for24 = for24;
	}

	public boolean isFor24() {
		return for24;
	}

	public int getAnoAct() {
		return anoAct;
	}

	public void setAnoAct(int anoAct) {
		this.anoAct = anoAct;
	}

	public byte getMesAct() {
		return mesAct;
	}

	public void setMesAct(byte mesAct) {
		this.mesAct = mesAct;
	}

	public byte getDiaAct() {
		return diaAct;
	}

	public void setDiaAct(byte diaAct) {
		this.diaAct = diaAct;
	}

	public byte getHorAct() {
		return horAct;
	}

	public void setHorAct(byte horAct) {
		this.horAct = horAct;
	}

	public byte getMinAct() {
		return minAct;
	}

	public void setMinAct(byte minAct) {
		this.minAct = minAct;
	}

	public byte getSegAct() {
		return segAct;
	}

	public void setSegAct(byte segAct) {
		this.segAct = segAct;
	}

	public String getAmPm() {
		return amPm;
	}

	public void setAmPm(String amPm) {
		this.amPm = amPm;
	}

	public Calendar getTiempo() {
		return tiempo;
	}

	public void setTiempo(Calendar tiempo) {
		this.tiempo = tiempo;
	}


public byte getHorCro() {
		return horCro;
	}

	public void setHorCro(byte horCro) {
		this.horCro = horCro;
	}

	public byte getMinCro() {
		return minCro;
	}

	public void setMinCro(byte minCro) {
		this.minCro = minCro;
	}

	public byte getSegCro() {
		return segCro;
	}

	public void setSegCro(byte segCro) {
		this.segCro = segCro;
	}

	public int getmSegCro() {
		return mSegCro;
	}

	public void setmSegCro(int mSegCro) {
		this.mSegCro = mSegCro;
	}

	// Funciones creadas para ahorrar escribir código de imprimir
	public static void print(String string) {
		System.out.print(string);
	}
				
	public static void println(String string) {
		System.out.println(string);
	}
}
