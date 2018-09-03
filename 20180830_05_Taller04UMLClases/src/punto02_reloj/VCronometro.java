package punto02_reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;

public class VCronometro extends JFrame implements ActionListener{
	
	JLabel lTitulo;
	static JLabel lCrono;
	static JLabel lActual;
	static JButton bIniciar;
	static JButton bPausar;
	static JButton bReiniciar;
	JButton bAtras;
	
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
		this.setSize(350, 200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void iniciaElementos() {
    	lTitulo = new JLabel();
    	lCrono = new JLabel();
    	lActual = new JLabel();
    	bIniciar = new JButton();
    	bPausar = new JButton();
    	bReiniciar = new JButton();
    	bAtras = new JButton();

    	lTitulo.setText("Cronómetro");
    	lTitulo.setFont(new Font("Verdana",Font.BOLD,18));
    	lTitulo.setBounds(50, 10, 250, 25);
    	lTitulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lCrono.setText(Byte.toString(reloj.horCro)+":"+Byte.toString(reloj.minCro)+":"+Byte.toString(reloj.segCro)+":"+Integer.toString(reloj.mSegCro));
    	lCrono.setFont(new Font("Verdana",Font.BOLD,24));
    	lCrono.setBounds(20, 40, 310, 35);
    	lCrono.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lActual.setText(Byte.toString(reloj.diaAct)+"-"+Byte.toString(reloj.mesAct)+"-"+Integer.toString(reloj.anoAct)+" "+Byte.toString(reloj.horAct)+":"+Byte.toString(reloj.minAct)+":"+Byte.toString(reloj.segAct));
    	if(reloj.isFor24() == false) {
        	lActual.setText(lActual.getText()+reloj.amPm);
        }
    	lActual.setBounds(130, 130, 190, 30);
    	lActual.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	
    	bIniciar.setText("Iniciar");
    	bIniciar.setBounds(20, 80, 90, 35);
    	bIniciar.setFont(new Font("Verdana",Font.BOLD,16));
    	bIniciar.setForeground(Color.green);
    	bIniciar.addActionListener(this);
    	bPausar.setText("Pausar");
    	bPausar.setBounds(130, 80, 90, 35);
    	bPausar.setFont(new Font("Verdana",Font.BOLD,16));
    	bPausar.setForeground(Color.red);
    	bPausar.addActionListener(this);
    	bPausar.setEnabled(false);
    	bReiniciar.setText("Reiniciar");
    	bReiniciar.setBounds(240, 80, 90, 35);
    	bReiniciar.setFont(new Font("Verdana",Font.BOLD,16));
    	bReiniciar.setForeground(Color.blue);
    	bReiniciar.addActionListener(this);
    	bReiniciar.setEnabled(false);
    	bAtras.setText("Atrás");
    	bAtras.setBounds(30, 130, 80, 30);
    	bAtras.addActionListener(this);
    	
    	this.add(lTitulo);
    	this.add(lCrono);
    	this.add(lActual);
    	this.add(bIniciar);
    	this.add(bPausar);
    	this.add(bReiniciar);
    	this.add(bAtras);
    }

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bAtras) {
    		this.dispose();
    		reloj.pausaCrono();
    		reloj.reiniciaCrono();
    		Principal vPrincipal = new Principal(reloj);
    		vPrincipal.setVisible(true);
    		Principal.boolCrono = false;
    	}
		if(e.getSource() == bIniciar) {
			reloj.iniciaCrono();
    	}
		if(e.getSource() == bPausar) {
    		reloj.pausaCrono();
    	}
		if(e.getSource() == bReiniciar) {
    		reloj.reiniciaCrono();
    	}
	}
	
// Funciones creadas para ahorrar escribir código de imprimir en consola
	public static void print(String string) {
		 System.out.print(string);
	}
		 			
	public static void println(String string) {
		 System.out.println(string);
	}
}
