package punto02_reloj;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Alerta extends JFrame implements ActionListener{
	
	JLabel lTitulo;
	JButton bSalir;

	public Alerta() {
		super();
        println("Ventana Alerta");
        this.setTitle("ALARMA!!!");
		this.setSize(300, 130);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		lTitulo = new JLabel();
		bSalir = new JButton();
		lTitulo.setText("¡¡¡ ALARMA !!!");
    	lTitulo.setFont(new Font("Verdana",Font.BOLD,20));
    	lTitulo.setBounds(50, 15, 200, 30);
    	lTitulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	bSalir.setText("Salir");
    	bSalir.setFont(new Font("Verdana",Font.PLAIN,14));
    	bSalir.setBounds(50, 60, 200, 30);
    	bSalir.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	bSalir.addActionListener(this);
    	this.add(lTitulo);
    	this.add(bSalir);
        this.setBackground(Color.red);
		try        
		{
		    Thread.sleep(500);
			Toolkit.getDefaultToolkit().beep();
		    Thread.sleep(500);
			Toolkit.getDefaultToolkit().beep();
		    Thread.sleep(500);
			Toolkit.getDefaultToolkit().beep();
		} 
		catch(InterruptedException ex) 
		{
		    Thread.currentThread().interrupt();
		}
	}
	
// Funciones creadas para ahorrar escribir código de imprimir en consola
	public static void print(String string) {
		 System.out.print(string);
	}
		 			
	public static void println(String string) {
		 System.out.println(string);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
    	if (e.getSource() == bSalir) {
    		System.exit(0);
    	}
	}
}
