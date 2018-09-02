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
	    		if((diaAct >= 29) && (mesAct == 2)) {
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
	    		if(isFor24() == false) {
	            	Principal.lFecHor.setText(Principal.lFecHor.getText()+amPm);
	            }
	        }
	    };
	    tempo01.schedule(rSegundo, 0, 1000);
	}
	
	public void asignarFecha() {
		
	}
	
	public static void main(String arglist[]) {
		
	}
	
// Funciones creadas para ahorrar escribir código de imprimir
	public static void print(String string) {
		System.out.print(string);
	}
			
	public static void println(String string) {
		System.out.println(string);
	}

	public static void setFor24(boolean for24) {
		Relooj.for24 = for24;
	}

	public static boolean isFor24() {
		return for24;
	}

}
