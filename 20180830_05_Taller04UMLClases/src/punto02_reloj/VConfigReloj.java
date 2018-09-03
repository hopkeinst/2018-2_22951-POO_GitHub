package punto02_reloj;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class VConfigReloj  extends JFrame implements ActionListener, ChangeListener{
	
//Spinner = un elemento que permite escoger entre números o una lista con
// botones de arriba y abajo
	JSpinner sSeg, sMin, sHor, sDia, sMes, sAno;
//SpinnerNumberModel es para establecer el modelo del spinner, que es numérico
// y que parámetros al respecto debe tener
	SpinnerNumberModel snmSeg, snmMin, snmHor, snmDia, snmMes, snmAno;
//RadioButton es para escoger entre un grupo de opciones una sola, esto
// se usará para el formato de 24 horas, am y pm
	JRadioButton rb12H, rb24H, rbAm, rbPm;
//ButtonGroup es para establecer los RadioButton que están asociados, porque
// como no se puede escoger sino uno solo
	ButtonGroup bgFor24,bgAmPm;
	JLabel lTitulo,lInfo,lDia,lMes,lAno,lHor,lMin,lSeg,lFor24,lAmPm,lActual1;
	static JLabel lActual2;
	JLabel lNuevo1;
	JLabel lNuevo2;
	JButton bAtras,bGuardar;
	Relooj reloj;
	
	static boolean fAm = true,fPm = false;

	public VConfigReloj() {
    }
	
	public VConfigReloj(Relooj reloj) {
        super();
        this.reloj = reloj;
        println("Ventana Configurar Hora");
        configVentana();
        iniciaElementos();
    }
	
	public void configVentana() {
		this.setTitle("Configurando Reloj");
		this.setSize(350, 290);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void iniciaElementos() {
    	bAtras = new JButton();
    	bGuardar = new JButton();
    	lTitulo = new JLabel();
    	lInfo = new JLabel();
    	lDia = new JLabel();
    	lMes = new JLabel();
    	lAno = new JLabel();
    	lHor = new JLabel();
    	lMin = new JLabel();
    	lSeg = new JLabel();
    	lFor24 = new JLabel();
    	lAmPm = new JLabel();
    	lActual1 = new JLabel();
    	lActual2 = new JLabel();
    	lNuevo1 = new JLabel();
    	lNuevo2 = new JLabel();
    	sSeg = new JSpinner();
    	sMin = new JSpinner();
    	sHor = new JSpinner();
    	sDia = new JSpinner();
    	sMes = new JSpinner();
    	sAno = new JSpinner();
    	rb12H = new JRadioButton();
    	rb24H = new JRadioButton();
    	rbAm = new JRadioButton();
    	rbPm = new JRadioButton();
    	bgFor24 = new ButtonGroup();
    	bgAmPm = new ButtonGroup();
//El modelo numérico para el spinner se crea, y se establece como (valorActual,
// mínimo, máximo, paso) 
    	snmSeg = new SpinnerNumberModel(reloj.segAct, 0, 59, 1);
    	snmMin = new SpinnerNumberModel(reloj.minAct, 0, 59, 1);
//EL modelo del spinner de las horas va a depender si el formato ds 12 o 23
    	if(reloj.isFor24() == true) {
        	snmHor = new SpinnerNumberModel(reloj.horAct, 0, 23, 1);
    	}else {
    		if(reloj.amPm == "am") {
        		snmHor = new SpinnerNumberModel(reloj.horAct, 0, 11, 1);
        		fAm = true;
        		fPm = false;
    		}else if(reloj.amPm == "pm") {
        		snmHor = new SpinnerNumberModel(reloj.horAct, 1, 12, 1);
        		fAm = false;
        		fPm = true;
    		}
    	}
//El modelo del spinner de los días va a depender del mes, puesto que cada
// mes tiene diferente cantidad de días, y del año bisiesto
    	if((reloj.mesAct == 2) && ((reloj.anoAct % 4) != 0)) {
    		snmDia = new SpinnerNumberModel(reloj.diaAct, 1, 28, 1);
    	}else if((reloj.mesAct == 2) && ((reloj.anoAct % 4) == 0)){
    		snmDia = new SpinnerNumberModel(reloj.diaAct, 1, 29, 1);
    	}else if((reloj.mesAct == 4) || (reloj.mesAct == 6) || (reloj.mesAct == 9) || (reloj.mesAct == 11)) {
    		snmDia = new SpinnerNumberModel(reloj.diaAct, 1, 30, 1);
    	}else if((reloj.mesAct == 1) || (reloj.mesAct == 3) || (reloj.mesAct == 5) || (reloj.mesAct == 7) || (reloj.mesAct == 8) || (reloj.mesAct == 10) || (reloj.mesAct == 12)) {
    		snmDia = new SpinnerNumberModel(reloj.diaAct, 1, 31, 1);
    	}
    	snmMes = new SpinnerNumberModel(reloj.mesAct, 1, 12, 1);
    	snmAno = new SpinnerNumberModel(reloj.anoAct, 2001, 2100, 1);
//Ahora se crean los labels, los textos que van a ir
    	lTitulo.setText("Configura Reloj");
    	lTitulo.setFont(new Font("Verdana",Font.BOLD,18));
    	lTitulo.setBounds(50, 10, 250, 25);
    	lTitulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lInfo.setText("Configura el reloj según la necesidad");
    	lInfo.setFont(new Font("Verdana",Font.PLAIN,14));
        lInfo.setBounds(10, 40, 330, 20);
        lInfo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lDia.setText("Día");
    	lDia.setFont(new Font("Verdana",Font.PLAIN,12));
        lDia.setBounds(30, 60, 50, 20);
        lDia.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lMes.setText("Mes");
    	lMes.setFont(new Font("Verdana",Font.PLAIN,12));
        lMes.setBounds(120, 60, 50, 20);
        lMes.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lAno.setText("Año");
    	lAno.setFont(new Font("Verdana",Font.PLAIN,12));
        lAno.setBounds(210, 60, 90, 20);
        lAno.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lHor.setText("Hora");
    	lHor.setFont(new Font("Verdana",Font.PLAIN,12));
        lHor.setBounds(10, 120, 70, 20);
        lHor.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lMin.setText("Minuto");
    	lMin.setFont(new Font("Verdana",Font.PLAIN,12));
        lMin.setBounds(90, 120, 70, 20);
        lMin.setHorizontalAlignment((int) CENTER_ALIGNMENT);
    	lSeg.setText("Segundo");
    	lSeg.setFont(new Font("Verdana",Font.PLAIN,12));
        lSeg.setBounds(170, 120, 70, 20);
        lSeg.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lFor24.setText("Formato");
    	lFor24.setFont(new Font("Verdana",Font.PLAIN,12));
        lFor24.setBounds(260, 115, 70, 20);
        lFor24.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lAmPm.setText("am/pm");
    	lAmPm.setFont(new Font("Verdana",Font.PLAIN,12));
        lAmPm.setBounds(220, 180, 100, 20);
        lAmPm.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        lActual1.setText("Actual:");
    	lActual1.setFont(new Font("Verdana",Font.BOLD,12));
        lActual1.setBounds(20, 175, 70, 20);
        lNuevo1.setText("Nueva:");
    	lNuevo1.setFont(new Font("Verdana",Font.BOLD,12));
        lNuevo1.setBounds(20, 195, 70, 20);
        lActual2.setText(Byte.toString(reloj.diaAct)+"-"+Byte.toString(reloj.mesAct)+"-"+Integer.toString(reloj.anoAct)+" "+Byte.toString(reloj.horAct)+":"+Byte.toString(reloj.minAct)+":"+Byte.toString(reloj.segAct));
    	lActual2.setFont(new Font("Verdana",Font.PLAIN,12));
        lActual2.setBounds(75, 175, 160, 20);
        if(reloj.isFor24() == false) {
        	lActual2.setText(lActual2.getText()+reloj.amPm);
        }
    	lNuevo2.setFont(new Font("Verdana",Font.PLAIN,12));
        lNuevo2.setBounds(75, 195, 160, 20);
//Y se le asigna el modelo al spinner, se coloca en un lugar de la ventana y se le 
// dice que cuando cambie de estado verifique por si hay que cambiar algo
        sDia.setModel(snmDia);
    	sDia.setBounds(40,80,50,25);
    	sDia.addChangeListener(this);
        sMes.setModel(snmMes);
    	sMes.setBounds(130,80,50,25);
    	sMes.addChangeListener(this);
        sAno.setModel(snmAno);
    	sAno.setBounds(220,80,90,25);
    	sAno.addChangeListener(this);
    	sHor.setModel(snmHor);
    	sHor.setBounds(25,140,50,25);
    	sHor.addChangeListener(this);
    	sMin.setModel(snmMin);
    	sMin.setBounds(95,140,50,25);
    	sMin.addChangeListener(this);
    	sSeg.setModel(snmSeg);
    	sSeg.setBounds(165,140,50,25);
    	sSeg.addChangeListener(this);
//Y se establecen los RadioButton para escoger el formato de hora
    	rb12H.setText("12 Horas");
    	rb12H.setFont(new Font("Verdana",Font.PLAIN,12));
    	rb12H.setBounds(235,130,90,25);
    	rb12H.addChangeListener(this);
    	rb24H.setText("24 Horas");
    	rb24H.setFont(new Font("Verdana",Font.PLAIN,12));
    	rb24H.setBounds(235,150,90,25);
    	rb24H.addActionListener(this);
    	rbAm.setText("am");
    	rbAm.setFont(new Font("Verdana",Font.PLAIN,12));
    	rbAm.setBounds(215,195,60,25);
    	rbAm.addActionListener(this);
    	rbPm.setText("pm");
    	rbPm.setFont(new Font("Verdana",Font.PLAIN,12));
    	rbPm.setBounds(270,195,60,25);
    	rbPm.addChangeListener(this);
    	bgFor24.add(rb12H);
    	bgFor24.add(rb24H);
    	bgAmPm.add(rbAm);
    	bgAmPm.add(rbPm);
    	if(reloj.isFor24() == true) {
    		rb24H.setSelected(true);
    		rbAm.setVisible(false);
    		rbPm.setVisible(false);
    		lAmPm.setVisible(false);
    	}else {
    		rb12H.setSelected(true);
    		if(reloj.amPm == "am") {
    			rbAm.setSelected(true);
    			fAm = true;
    			fPm = false;
    		}else if(reloj.amPm == "pm") {
    			rbPm.setSelected(true);
    			fAm = false;
    			fPm = true;
    		}
    	}
    	
    	bAtras.setText("Atrás");
    	bAtras.setBounds(30, 225, 80, 30);
    	bAtras.addActionListener(this);
    	bGuardar.setText("Guardar");
    	bGuardar.setBounds(250, 225, 80, 30);
    	bGuardar.addActionListener(this);
    	
    	this.add(lTitulo);
    	this.add(lInfo);
    	this.add(lDia);
    	this.add(lMes);
    	this.add(lAno);
    	this.add(lHor);
    	this.add(lMin);
    	this.add(lSeg);
    	this.add(lFor24);
    	this.add(lAmPm);
    	this.add(lActual1);
    	this.add(lActual2);
    	this.add(lNuevo1);
    	this.add(lNuevo2);
    	this.add(sDia);
    	this.add(sMes);
    	this.add(sAno);
    	this.add(sHor);
    	this.add(sMin);
    	this.add(sSeg);
    	this.add(rb12H);
    	this.add(rb24H);
    	this.add(rbAm);
    	this.add(rbPm);
    	this.add(bAtras);
    	this.add(bGuardar);
    	asignarRelojNuevo();
    }

	public static void main(String[] args) {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bAtras) {
    		this.dispose();
    		Principal vPrincipal = new Principal(reloj);
    		vPrincipal.setVisible(true);
    	}
		if(e.getSource() == bGuardar) {
			reloj.setAnoAct((int) sAno.getValue());
			reloj.setMesAct((byte)((int) sMes.getValue()));
			reloj.setDiaAct((byte)((int) sDia.getValue()));
			reloj.setHorAct((byte)((int) sHor.getValue()));
			reloj.setMinAct((byte)((int) sMin.getValue()));
			reloj.setSegAct((byte)((int) sSeg.getValue()));
			if(rb24H.isSelected()) {
				reloj.for24 = true;
			}else {
				reloj.for24 = false;
				if(rbAm.isSelected()) {
					reloj.amPm = "am";
				}else if(rbPm.isSelected()) {
					reloj.amPm = "pm";
				}
			}
    		this.dispose();
    		Principal vPrincipal = new Principal(reloj);
    		vPrincipal.setVisible(true);
    	}
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		if(rb24H.isSelected() && lAmPm.isVisible()) {
			snmHor.setValue(12);
			snmHor.setMinimum(0);
			snmHor.setMaximum(23);
			snmHor.setStepSize(1);
			sHor.setModel(snmHor);
			asignarRelojNuevo();
    		rbAm.setVisible(false);
    		rbPm.setVisible(false);
    		lAmPm.setVisible(false);
    		println(" -- -- rb24H selected");
    		println("fam: "+Boolean.toString(fAm));
    		println("fpm: "+Boolean.toString(fAm));
		}
		if(rb12H.isSelected() && !lAmPm.isVisible()) {
			snmHor.setValue(0);
			snmHor.setMinimum(0);
			snmHor.setMaximum(11);
			snmHor.setStepSize(1);
			sHor.setModel(snmHor);
			asignarRelojNuevo();
    		rbAm.setVisible(true);
    		rbPm.setVisible(true);
    		lAmPm.setVisible(true);
    		rbAm.setSelected(true);
    		fAm = true;
		}
		if(rbAm.isSelected() && (fAm == false)) {
    		fAm = true;
			snmHor.setValue(0);
			snmHor.setMinimum(0);
			snmHor.setMaximum(11);
			snmHor.setStepSize(1);
			sHor.setModel(snmHor);
			asignarRelojNuevo();
		}
		if(rbPm.isSelected() && (fAm == true)) {
    		fAm = false;
			snmHor.setValue(12);
			snmHor.setMinimum(1);
			snmHor.setMaximum(12);
			snmHor.setStepSize(1);
			sHor.setModel(snmHor);
			asignarRelojNuevo();
		}
		if(e.getSource() == sDia) {
			asignarRelojNuevo();
		}
		if(e.getSource() == sMes) {
			if(((int) sMes.getValue() == 2) && (((int) sAno.getValue() % 4) != 0)) {
	    		snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(28);
	    		snmDia.setStepSize(1);
	    	}else if(((int) sMes.getValue() == 2) && (((int) sAno.getValue() % 4) == 0)){
	    		snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(29);
	    		snmDia.setStepSize(1);
	    	}else if(((int) sMes.getValue() == 4) || ((int) sMes.getValue() == 6) || ((int) sMes.getValue() == 9) || ((int) sMes.getValue() == 11)) {
	    		snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(30);
	    		snmDia.setStepSize(1);
	    	}else if(((int) sMes.getValue() == 1) || ((int) sMes.getValue() == 3) || ((int) sMes.getValue() == 5) || ((int) sMes.getValue() == 7) || ((int) sMes.getValue() == 8) || ((int) sMes.getValue() == 10) || ((int) sMes.getValue() == 12)) {
	    		snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(31);
	    		snmDia.setStepSize(1);
	    	}
			sDia.setModel(snmDia);
			asignarRelojNuevo();
		}
		if(e.getSource() == sAno) {
			if(((int) sMes.getValue() == 2) && (((int) sAno.getValue() % 4) != 0)) {
				snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(28);
	    		snmDia.setStepSize(1);
	    	}else if(((int) sMes.getValue() == 2) && (((int) sAno.getValue() % 4) == 0)){
	    		snmDia.setValue(1);
	    		snmDia.setMinimum(1);
	    		snmDia.setMaximum(29);
	    		snmDia.setStepSize(1);
	    	}
			sDia.setModel(snmDia);
			asignarRelojNuevo();
		}
		if(e.getSource() == sHor) {
			asignarRelojNuevo();
		}
		if(e.getSource() == sMin) {
			asignarRelojNuevo();
		}
		if(e.getSource() == sSeg) {
			asignarRelojNuevo();
		}
	}
	
	void asignarRelojNuevo() {
		lNuevo2.setText(sDia.getValue().toString()+"-"+sMes.getValue().toString()+"-"+sAno.getValue().toString()+" "+sHor.getValue().toString()+":"+sMin.getValue().toString()+":"+sSeg.getValue().toString());
    	if((rb12H.isSelected() == true) && (rbAm.isSelected())) {
    		lNuevo2.setText(lNuevo2.getText()+"am");
    	}else if((rb12H.isSelected() == true) && (rbPm.isSelected())) {
    		lNuevo2.setText(lNuevo2.getText()+"pm");
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
