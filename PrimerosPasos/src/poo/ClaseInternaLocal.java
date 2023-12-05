package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class ClaseInternaLocal {
	
	//CLASE INTERNA: DENTRO DE UN MÉTODO. ÚTILES PARA INSTANCIAR LA CLASE SÓLO UNA VEZ, SÓLO PUEDE ACCEDER A ELLA EL
	//MÉTODO EN EL QUE ESTÁ DECLARADA, SÓLO PUEDE TENER EL MODIFICADOR DE ACCESO POR DEFECTO(NINGUNO)

	public static void main(String[] args) {
		
		Reloj2 mireloj=new Reloj2();
		
		mireloj.enMarcha(3000, true);
		
		JOptionPane.showMessageDialog(null, "Presione aceptar para terminar");
		
		System.exit(0);

	}

}

class Reloj2 {
	
	//private int intervalo;		//TODO ESTO LO HEMOS DESPLAZADO AL MÉTODO ENMARCHA() PARA SIMPLIFICAR
	
	//private boolean sonido;		
	
	/*public Reloj2(int intervalo, boolean sonido) {	//NOS CARGAMOS EL CONSTRUCTOR DE RELOJ2
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}*/
	
	public void enMarcha(int intervalo, boolean sonido) {
		
		class dameLaHora3 implements ActionListener{	//CLASE INTERNA LOCAL (DENTRO DEL MÉTODO ENMARCHA())
			
			public void actionPerformed(ActionEvent event) {
				
				Date ahora= new Date();
				
				System.out.println("Te digo la hora cada " + intervalo/1000 +" segundos: " + ahora);
				
				if (sonido) {
					
					Toolkit.getDefaultToolkit().beep();
					
				}
				
			}
			
		}
		
		dameLaHora3 oyente=new dameLaHora3();
		
		Timer mitemp=new Timer(intervalo, oyente);
		
		mitemp.start();
		
	}
			
	
	
}