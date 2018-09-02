package punto02_reloj;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VConfigReloj  extends JFrame implements ActionListener, ChangeListener{

	public VConfigReloj() {
    }
	
	public VConfigReloj(Relooj reloj) {
        super();
        configVentana();
        iniciaComponentes();
    }
	
	public void configVentana() {
    }

    public void iniciaComponentes() {
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
		
	}

}
