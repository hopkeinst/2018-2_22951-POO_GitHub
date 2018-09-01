package punto02_reloj;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VConfigReloj  extends JFrame implements ActionListener, ChangeListener{

	public VConfigReloj() {
        super();                    // usamos el contructor de la clase padre JFrame
        configVentana();        // configuramos la ventana
        iniciaComponentes();   // inicializamos los atributos o componentes
    }
	
	public void configVentana() {
    }

    public void iniciaComponentes() {
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

}
