package punto02_reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class VCronometro extends JFrame implements ActionListener{
	
	Relooj reloj;

	public VCronometro() {
	}
	
	public VCronometro(Relooj reloj) {
		super();
        this.reloj = reloj;
        println("Ventana Cronómetro");
        configVentana();
        iniciaElementos();
	}
	
	public void configVentana() {
		this.setTitle("Cronómetro");
		this.setSize(350, 290);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void iniciaElementos() {
    	
    }

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
// Funciones creadas para ahorrar escribir código de imprimir en consola
	public static void print(String string) {
		 System.out.print(string);
	}
		 			
	public static void println(String string) {
		 System.out.println(string);
	}
}
