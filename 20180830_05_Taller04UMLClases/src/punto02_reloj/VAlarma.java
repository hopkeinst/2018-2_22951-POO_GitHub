package punto02_reloj;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;

public class VAlarma extends JFrame implements ActionListener, ChangeListener{
	
	JLabel lTitulo,lInfo,lHor,lMin,lSeg;
	static JLabel lAmPm;
	JLabel lAlarma1;
	JLabel lAlarma2;
	JLabel lActual1;
	JLabel lDif1;
	static JLabel lActual2,lDif2;
	static JSpinner sHor,sMin,sSeg;
	SpinnerNumberModel snmHor,snmMin,snmSeg;
	static JButton bIniciar,bParar;
	static JButton bAtras;
	static JRadioButton rbAm;
	static JRadioButton rbPm;
	ButtonGroup bgAmPm;
	
	Relooj reloj;
	
	byte segAla,minAla,horAla,diaAla,mesAla;
	int anoAla;

	public VAlarma() {
	}
	
	public VAlarma(Relooj reloj) {
		this.reloj = reloj;
        println("Ventana Alarma");
        configVentana();
        iniciaElementos();
	}
	
	void configVentana() {
		this.setTitle("Alarma");
		this.setSize(350, 270);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	void iniciaElementos() {
		lTitulo = new JLabel();
		lInfo = new JLabel();
		lHor = new JLabel();
		lMin = new JLabel();
		lSeg = new JLabel();
		lAmPm = new JLabel();
		lActual1 = new JLabel();
		lAlarma1 = new JLabel();
		lDif1 = new JLabel();
		lActual2 = new JLabel();
		lAlarma2 = new JLabel();
		lDif2 = new JLabel();
		bIniciar = new JButton();
		bParar = new JButton();
		bAtras = new JButton();
    	sSeg = new JSpinner();
    	sMin = new JSpinner();
    	sHor = new JSpinner();
    	rbAm = new JRadioButton();
    	rbPm = new JRadioButton();
    	bgAmPm = new ButtonGroup();
		
		lTitulo.setText("Alarma");
    	lTitulo.setFont(new Font("Verdana",Font.BOLD,18));
    	lTitulo.setBounds(50, 10, 250, 25);
    	lTitulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lInfo.setText("Configure la alarma, iníciela o deténgala");
    	lInfo.setFont(new Font("Verdana",Font.PLAIN,14));
        lInfo.setBounds(10, 40, 330, 20);
        lInfo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lHor.setText("Hora");
    	lHor.setFont(new Font("Verdana",Font.PLAIN,12));
        lHor.setBounds(10, 60, 70, 20);
        lHor.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lMin.setText("Minuto");
    	lMin.setFont(new Font("Verdana",Font.PLAIN,12));
        lMin.setBounds(80, 60, 70, 20);
        lMin.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lSeg.setText("Segundo");
    	lSeg.setFont(new Font("Verdana",Font.PLAIN,12));
        lSeg.setBounds(160, 60, 70, 20);
        lSeg.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lAmPm.setText("am/pm");
    	lAmPm.setFont(new Font("Verdana",Font.PLAIN,12));
        lAmPm.setBounds(225, 60, 105, 20);
        lAmPm.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lActual1.setText("Actual:");
    	lActual1.setFont(new Font("Verdana",Font.BOLD,12));
        lActual1.setBounds(30, 145, 70, 20);
        lActual2.setText(Byte.toString(reloj.diaAct)+"-"+Byte.toString(reloj.mesAct)+"-"+Integer.toString(reloj.anoAct)+" "+Byte.toString(reloj.horAct)+":"+Byte.toString(reloj.minAct)+":"+Byte.toString(reloj.segAct));
    	lActual2.setFont(new Font("Verdana",Font.PLAIN,12));
        lActual2.setBounds(85, 145, 160, 20);
        lAlarma1.setText("Alarma:");
        lAlarma1.setFont(new Font("Verdana",Font.BOLD,12));
        lAlarma1.setBounds(30, 165, 70, 20);
        lAlarma2.setFont(new Font("Verdana",Font.PLAIN,12));
        lAlarma2.setBounds(90, 165, 160, 20);
        lDif1.setText("Diferencia:");
        lDif1.setFont(new Font("Verdana",Font.BOLD,12));
        lDif1.setBounds(30, 185, 90, 20);
        lDif2.setText("");
        lDif2.setFont(new Font("Verdana",Font.PLAIN,12));
        lDif2.setBounds(115, 185, 160, 20);
        
        snmSeg = new SpinnerNumberModel(reloj.segAct, 0, 59, 1);
    	snmMin = new SpinnerNumberModel(reloj.minAct, 0, 59, 1);
    	if(reloj.isFor24() == true) {
        	snmHor = new SpinnerNumberModel(reloj.horAct, 0, 23, 1);
    		rbAm.setEnabled(false);
    		rbPm.setEnabled(false);
    		lAmPm.setEnabled(false);
    	}else {
    		rbAm.setEnabled(true);
    		rbPm.setEnabled(true);
    		lAmPm.setEnabled(true);
    		if(reloj.amPm == "am") {
        		snmHor = new SpinnerNumberModel(reloj.horAct, 0, 11, 1);
    		}else if(reloj.amPm == "pm") {
        		snmHor = new SpinnerNumberModel(reloj.horAct, 1, 12, 1);
    		}
    	}
    	sHor.setModel(snmHor);
    	sHor.setBounds(25,80,50,25);
    	sHor.addChangeListener(this);
    	sMin.setModel(snmMin);
    	sMin.setBounds(95,80,50,25);
    	sMin.addChangeListener(this);
    	sSeg.setModel(snmSeg);
    	sSeg.setBounds(165,80,50,25);
    	sSeg.addChangeListener(this);
    	rbAm.setText("am");
    	rbAm.setFont(new Font("Verdana",Font.PLAIN,12));
    	rbAm.setBounds(225,80,55,25);
    	rbAm.addActionListener(this);
    	rbPm.setText("pm");
    	rbPm.setFont(new Font("Verdana",Font.PLAIN,12));
    	rbPm.setBounds(275,80,55,25);
    	rbPm.addChangeListener(this);
    	bgAmPm.add(rbAm);
    	bgAmPm.add(rbPm);
    	
    	bIniciar.setText("Iniciar");
    	bIniciar.setBounds(30, 110, 130, 35);
    	bIniciar.setFont(new Font("Verdana",Font.BOLD,16));
    	bIniciar.setForeground(Color.green);
    	bIniciar.addActionListener(this);
    	bParar.setText("Detener");
    	bParar.setBounds(190, 110, 130, 35);
    	bParar.setFont(new Font("Verdana",Font.BOLD,16));
    	bParar.setForeground(Color.red);
    	bParar.addActionListener(this);
    	bParar.setEnabled(false);
    	bAtras.setText("Atrás");
    	bAtras.setBounds(30, 210, 80, 30);
    	bAtras.addActionListener(this);
		
		this.add(lTitulo);
		this.add(lInfo);
		this.add(lHor);
		this.add(lMin);
		this.add(lSeg);
		this.add(lAmPm);
		this.add(lActual1);
		this.add(lActual2);
		this.add(lAlarma1);
		this.add(lAlarma2);
		this.add(lDif1);
		this.add(lDif2);
		this.add(sHor);
		this.add(sMin);
		this.add(sSeg);
		this.add(rbAm);
		this.add(rbPm);
		this.add(bIniciar);
		this.add(bParar);
		this.add(bAtras);

        segAla = (byte)((byte)((int)sSeg.getValue())-reloj.segAct);
		minAla = (byte)((byte)((int)sMin.getValue())-reloj.minAct);
		horAla = (byte)((byte)((int)sHor.getValue())-reloj.horAct);
		if(segAla < 0) {
			minAla--;
		}
		if(minAla < 0) {
			horAla--;
		}
		if(horAla > 0) {
			lAlarma2.setText(reloj.diaAct+"-"+reloj.mesAct+"-"+reloj.anoAct+" "+sHor.getValue().toString()+":"+sMin.getValue().toString()+":"+sSeg.getValue().toString());
		}else {
			lAlarma2.setText((reloj.diaAct+1)+"-"+reloj.mesAct+"-"+reloj.anoAct+" "+sHor.getValue().toString()+":"+sMin.getValue().toString()+":"+sSeg.getValue().toString());
		}
	}

	public static void main(String[] args) {

	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(e.getSource() == sHor) {
			asignarRelojAlarma();
		}
		if(e.getSource() == sMin) {
			asignarRelojAlarma();
		}
		if(e.getSource() == sSeg) {
			asignarRelojAlarma();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bAtras) {
    		this.dispose();
    		Principal vPrincipal = new Principal(reloj);
    		vPrincipal.setVisible(true);
    		Principal.boolAlarma = false;
    	}
		if(e.getSource() == bIniciar) {
    		bIniciar.setEnabled(false);
    		bParar.setEnabled(true);
    		sSeg.setEnabled(false);
    		sMin.setEnabled(false);
    		sHor.setEnabled(false);
    		rbAm.setEnabled(false);
    		rbPm.setEnabled(false);
    		lAmPm.setEnabled(false);
    		reloj.fAlarma = true;
    	}
		if(e.getSource() == bParar) {
    		bIniciar.setEnabled(true);
    		bParar.setEnabled(false);
    		sSeg.setEnabled(true);
    		sMin.setEnabled(true);
    		sHor.setEnabled(true);
    		if(reloj.isFor24() == false) {
    			rbAm.setEnabled(true);
        		rbPm.setEnabled(true);
        		lAmPm.setEnabled(true);
    		}
    		reloj.fAlarma = false;
    		reloj.difHorAla = 0;
    		reloj.difMinAla = 0;
    		reloj.difSegAla = 0;
    	}
	}
	
	void asignarRelojAlarma() {
		reloj.calcularDiferenciaAlarma();
		segAla = (byte)((byte)((int)sSeg.getValue())-reloj.segAct);
		minAla = (byte)((byte)((int)sMin.getValue())-reloj.minAct);
		horAla = (byte)((byte)((int)sHor.getValue())-reloj.horAct);
		if(segAla < 0) {
			minAla--;
		}
		if(minAla < 0) {
			horAla--;
		}
		if(horAla < 0) {
			lAlarma2.setText((reloj.diaAct+1)+"-"+reloj.mesAct+"-"+reloj.anoAct+" "+sHor.getValue().toString()+":"+sMin.getValue().toString()+":"+sSeg.getValue().toString());
		}else {
			lAlarma2.setText(reloj.diaAct+"-"+reloj.mesAct+"-"+reloj.anoAct+" "+sHor.getValue().toString()+":"+sMin.getValue().toString()+":"+sSeg.getValue().toString());
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
