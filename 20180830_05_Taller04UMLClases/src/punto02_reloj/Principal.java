package punto02_reloj;

import java.awt.Font;

/* Principal creado para ser la 'interfaz visual' del programa
 * Desde aquí se llamará a la clase 'relooj' y sus objetos, según
 * se escoja. Permite interacción usuario/máquina.
 */

import java.awt.event.*;
import javax.swing.*;

public class Principal extends JFrame implements ActionListener{

/*Objetos que se van creando, de la clase JFrame perteneciente a 
 * javax.swing que nos permite crear los labels, botones, ventanas,
 * inputs y demás...
 * */
	
//Label = texto a mostrarse
    JLabel  lTitulo,lInfo;
//Botones
    JButton bConfigReloj,bCrono,bAlarma,bSalir;
    Relooj reloj;
    
    static JLabel lFecHor = new JLabel();
    
    static boolean boolConfigReloj = false;
    static boolean boolCrono = false;
    static boolean boolAlarma = false;

    public Principal(Relooj reloj) {
//super() para usar el constructor de la clase padre JFrame
    	super();
    	this.reloj = reloj;
//Se llaman a las funciones para configurar y crear los elementos
// en configVentana() se configura la ventana
// en iniciaElementos() se inicializan y configuran los elementos de la ventana
        configVentana();
        iniciaElementos();
    }

    public Principal() {
	}
    
    public void configVentana() {
//setTitle para colocarle título a la ventana
        this.setTitle("Reloj en JAVA");
//setSize para configurar el tamaño de la ventana (ancho,alto)
        this.setSize(350, 240);
//setLocationRelativeTo para ubicar la ventana (null) = colocarla en el centro
        this.setLocationRelativeTo(null);
//setLayout para utilizar una base para mostrar los objetos, algo así como una 'cuadrícula'
// utiliza (null) para no usar ninguna y ubicarlos según gusto
        this.setLayout(null);     
//setResizable es para definir si se puede modificar el tamaño de la ventana
// (false) significa que no se pueda modificar el tamaño
        this.setResizable(false);
//setDefaultCloseOperation para definir que se hace cuando se cierra la ventana
// (JFrame.EXIT_ON_CLOSE) es para terminar el programar al cerrar ventana
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    public void iniciaElementos() {
//Se crean los elementos que van en la ventana
        lTitulo = new JLabel();
        lInfo = new JLabel();
        bConfigReloj = new JButton();
        bCrono = new JButton();
        bAlarma = new JButton();
        bSalir = new JButton();
//Y se configuran los elementos ...
//Al label lTitulo se le asigna un texto mediante setText
        lTitulo.setText("RELOJ");
//Al label lTitulo se le asigna una fuente, estilo y tamaño  
        lTitulo.setFont(new Font("Verdana",Font.BOLD,18));
//Al label lTitulo se le da una posición, un ancho y alto (xIzq,ySup,ancho,alto)
        lTitulo.setBounds(50, 10, 250, 20);
//Al label lTitulo se le asigna la alineación horizontal, que quede en el centro
        lTitulo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
//Ahora lo mismo con lInfo
        lInfo.setText("Selecciona la acción que deseas\nrealizar:");
        lInfo.setFont(new Font("Verdana",Font.PLAIN,14));
        lInfo.setBounds(10, 40, 330, 20);
        lInfo.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        
        lFecHor.setText(Byte.toString(reloj.diaAct)+"-"+Byte.toString(reloj.mesAct)+"-"+Integer.toString(reloj.anoAct)+" "+Byte.toString(reloj.horAct)+":"+Byte.toString(reloj.minAct)+":"+Byte.toString(reloj.segAct));
        if(reloj.isFor24() == false) {
        	lFecHor.setText(lFecHor.getText()+reloj.amPm);
        	println(lFecHor.getText());
        }
        lFecHor.setBounds(30,175,230,30);
//Al botón bConfigReloj algunas similares que con los label
        bConfigReloj.setText("Configurar Reloj (hora y fecha)");
        bConfigReloj.setBounds(20, 70, 310, 25);
//addActionListener es para agregar una acción para cuando se presione,
// el programa siempre está escuchando a que se presione
        bConfigReloj.addActionListener(this);
//Y se realiza lo mismo con los otros botones
        bCrono.setText("Cronómetro");
        bCrono.setBounds(20, 105, 310, 25);
        bCrono.addActionListener(this);
        bAlarma.setText("Alarma");
        bAlarma.setBounds(20, 140, 310, 25);
        bAlarma.addActionListener(this);
        bSalir.setText("Salir");
        bSalir.setBounds(260, 175, 70, 30);
        bSalir.addActionListener(this);
//Y añadimos los elementos creados y configurados a esta ventana
        this.add(lTitulo);
        this.add(lInfo);
        this.add(lFecHor);
        this.add(bConfigReloj);
        this.add(bCrono);
        this.add(bAlarma);
        this.add(bSalir);
    }

//La función que está pendiente a cuando se realice una acción
    @Override
	public void actionPerformed(ActionEvent e) {
//En este caso pregunta si la acción realizada es sobre el elemento bConfigReloj
    	if (e.getSource() == bConfigReloj) {
    		this.dispose();
    		boolConfigReloj = true;
    		VConfigReloj vConfigReloj = new VConfigReloj(reloj);
    		vConfigReloj.setVisible(true);
    	}
    	if (e.getSource() == bCrono) {
    		this.dispose();
    		boolCrono = true;
    		boolConfigReloj = false;
    		boolAlarma = false;
    		VCronometro vCrono = new VCronometro(reloj);
    		vCrono.setVisible(true);
    	}
    	if (e.getSource() == bAlarma) {
    		this.dispose();
    		boolCrono = false;
    		boolConfigReloj = false;
    		boolAlarma = true;
    		VAlarma vAlarma = new VAlarma(reloj);
    		vAlarma.setVisible(true);
    	}
    	if (e.getSource() == bSalir) {
    		System.exit(0);
    	}
    }

    public static void main(String[] args) {
//Se crea el objeto del reloj, y se configura inicialmente
        Relooj rel = new Relooj("24");
//Se crea la ventana principal
    	Principal V = new Principal(rel);
//Y se hace visible la ventana
        V.setVisible(true);
    }
    
// Funciones creadas para ahorrar escribir código de imprimir en consola
 	public static void print(String string) {
 		System.out.print(string);
 	}
 			
 	public static void println(String string) {
 		System.out.println(string);
 	}
}
