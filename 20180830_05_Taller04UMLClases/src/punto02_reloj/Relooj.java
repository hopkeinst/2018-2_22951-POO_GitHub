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
	short mesAct;
	byte diaAct;
	byte horAct;
	byte minAct;
	byte segAct;
//Para el formato 24 horas
	static boolean for24 = true;

//Se crea el objeto para el manejo del tiempo
	Calendar tiempo = Calendar.getInstance();
	
// ### CONSTRUCTORES VARIOS

//Constructor que toma el tiempo actual,pero escogiendo formato 12 o 24
	public Relooj(String formato) {
		super();
		this.anoAct = tiempo.get(Calendar.YEAR);
		this.mesAct = (short) ((tiempo.get(Calendar.MONTH))+1);
		this.diaAct = (byte) tiempo.get(Calendar.DATE);
// Calendar.AM_PM = 0 cuando es am, y 1 cuando es pm
		if(formato == "12") {
			this.horAct = (byte) tiempo.get(Calendar.HOUR);
			for24 = false;
		}else if(formato == "24") {
			this.horAct = (byte) tiempo.get(Calendar.HOUR_OF_DAY);
			for24 = true;
		}
		this.minAct = (byte) tiempo.get(Calendar.MINUTE);
		this.segAct = (byte) tiempo.get(Calendar.SECOND);	
	}
	
	public static void main(String arglist[]) {
		println("jj");
	    Timer tempo = new Timer();
	    TimerTask rSegundo = new TimerTask() {
	    	@Override
	        public void run()
	        {
	    		println("H");
	        }
	    };
	    tempo.schedule(rSegundo, 0, 1000);
	}
	
// Funciones creadas para ahorrar escribir código de imprimir
	public static void print(String string) {
		System.out.print(string);;
	}
			
	public static void println(String string) {
		System.out.println(string);
	}

}
