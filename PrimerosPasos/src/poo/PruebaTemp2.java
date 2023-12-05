package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemp2 {

	public static void main(String[] args) {
		
		Reloj mireloj=new Reloj(3000, true);
		
		mireloj.enMarcha();
		
		JOptionPane.showMessageDialog(null, "Presione aceptar para terminar");
		
		JOptionPane.showMessageDialog(null, "El temporizador ha finalizado");
		
		System.exit(0);
		
		

	}

}

class Reloj {
	
	private int intervalo;
	
	private boolean sonido;
	
	public Reloj(int intervalo, boolean sonido) {
		
		this.intervalo=intervalo;
		
		this.sonido=sonido;
		
	}
	
	public void enMarcha() {
		
		ActionListener oyente=new dameLaHora2();
		
		Timer mitemp=new Timer(intervalo, oyente);
		
		mitemp.start();
		
	}
			
	 class dameLaHora2 implements ActionListener{	//CLASE INTERNA (DENTRO DE RELOJ)
		
		public void actionPerformed(ActionEvent e) {
			
			Date ahora= new Date();
			
			System.out.println("Te digo la hora cada 3 segundos: " + ahora);
			
			if (sonido) {
				
				Toolkit.getDefaultToolkit().beep();
				
			}
			
		}
		
	}
	
}